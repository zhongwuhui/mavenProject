package wk.serviceImpl;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: zhanghl
 * @Date: 2018/11/27 17:33
 */
public class HouseAndLandUtils<T> {

    /**
     * 单值过滤信息
     *
     * @param t
     * @param filedName
     * @param value
     * @return
     */
    public List<T> getFilterValue(List<T> t, String filedName, Object value) {
        return t.stream().filter(lamada -> ReflectUtils.invokeGet(lamada, filedName).equals(value)).collect(Collectors.toList());
    }

    /**
     * 多值过滤信息
     *
     * @param t
     * @param filedNames
     * @param values
     * @return
     */
    public List<T> getFilterValue(List<T> t, String[] filedNames, Object[] values) {
        return t.stream().filter(lamada ->
                compareValue(lamada, filedNames, values))
                .collect(Collectors.toList());
    }
    public List<T> getFilterValue(List<T> t, String[] filedNames, Object[] values,boolean isOr) {
        return t.stream().filter(lamada ->
                compareValue(lamada, filedNames, values,isOr))
                .collect(Collectors.toList());
    }

    /**
     * 对象属性组合赋值，组合分隔符默认是“、”
     * @param targetClass
     * @param copyColumns
     * @param sourceList
     */
    public void getJoinValue(Object targetClass, String[] copyColumns, List<T> sourceList) {
        getJoinValue(targetClass, copyColumns, sourceList, IntegratedQueryConstants.SPLIT_CHARTER);
    }

    /**
     * 对象属性组合赋值，可传入组合分隔符
     * @param targetClass
     * @param copyColumns
     * @param sourceList
     * @param splitCharacter
     */
    public void getJoinValue(Object targetClass, String[] copyColumns, List<T> sourceList, String splitCharacter) {

        //组合外围导入的字段，用于处理字段不一致要对照的字段
        Stream<String> allColumns = ReflectUtils.getAllColumns(targetClass,copyColumns);
        allColumns.forEach(copyColumn -> {
            try {
                String sourceColumn;
                String targetColumn;
                String[] arrColumns =  copyColumn.split(IntegratedQueryConstants.TRANSFER_SPLIT_CHARACTER);
                //处理字段不一致需要对照的
                if(arrColumns.length== IntegratedQueryConstants.TRANSFER_SPLIT_LENGTH){
                    targetColumn = arrColumns[0];
                    sourceColumn = arrColumns[1];
                }
                else{
                    sourceColumn = arrColumns[0];
                    targetColumn = arrColumns[0];
                }
                Field field;
                try{
                    field = sourceList.get(0).getClass().getDeclaredField(sourceColumn);
                }catch (Exception e){
                    return;
                }

                String value = "";
                switch (field.getType().getName()) {
                    case "java.util.Date":
                    case "java.sql.Date":
                      /*  value = sourceList.stream().map(source -> ReflectUtils.invokeGetDate(source, sourceColumn)).distinct()
                                .collect(Collectors.joining(IntegratedQueryConstants.SPLIT_CHARTER));*/
                        break;
                    case "java.lang.Long":
                    case "java.lang.Integer":
                        value = sourceList.stream().map(source -> ReflectUtils.invokeGetWithOutNull(source, sourceColumn)).distinct()
                                .collect(Collectors.joining(IntegratedQueryConstants.SPLIT_CHARTER));
                        break;
                    default:
                        value = sourceList.stream().map(source -> ReflectUtils.invokeGetWithOutNull(source, sourceColumn)).distinct()
                                .collect(Collectors.joining(IntegratedQueryConstants.SPLIT_CHARTER));
                        break;
                }
                ReflectUtils.invokeSet(targetClass, targetColumn, value);
            } catch (Exception er) {
                er.printStackTrace();
            }
        });
    }

    /**
     * 多值比较
     * 并且过滤
     *
     * @param t
     * @param filedNames
     * @param values
     * @return
     */
    public boolean compareValue(T t, String[] filedNames, Object[] values) {
        return  compareValue(t,filedNames,values,false);
    }

    /**
     * 或者过滤
     * @param t
     * @param filedNames
     * @param values
     * @param isOr
     * @return
     */
    public boolean compareValue(T t, String[] filedNames, Object[] values, boolean isOr) {
        boolean isAllCommon = isOr;
        for (int i = 0; i < filedNames.length; i++) {
            if (i <= values.length) {
                if(!isOr){
                    if (!ReflectUtils.invokeGet(t, filedNames[i]).equals(values[i])) {
                        return false;
                    }
                }
                else{
                    if (ReflectUtils.invokeGet(t, filedNames[i]).equals(values[i])) {
                        return true;
                    }
                }

            }
        }
        return !isAllCommon;

    }

    //重载方法  拓展
//    public boolean compareValueIgnoreType(T t, String[] filedNames, Object[] values, boolean isOr) {
//        boolean isAllCommon = isOr;
//        for (int i = 0; i < filedNames.length; i++) {
//            if (i <= values.length) {
//                if(!isOr){
//                    if (!ReflectUtils.invokeGet(t, filedNames[i]).equals(values[i])) {
//                        return false;
//                    }
//                }
//                else{
//                    if (ReflectUtils.invokeGet(t, filedNames[i]).equals(values[i])) {
//                        return true;
//                    }
//                }
//
//            }
//        }
//        return !isAllCommon;
//
//    }
}
