package wk.serviceImpl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

/**
 * @Author: zhanghl
 * @Date: 2018/11/27 15:32
 */
public class ReflectUtils {


    /**
     * 对象通过反射转换
     * @param source
     * @param target
     * @param copyColumns
     */
    public static  void reflectTransferProperty(Object source, Object  target, String[] copyColumns){
        reflectTransferProperty(source,target,copyColumns,true);
    }
    public static  void reflectTransferProperty(Object source, Object  target, String[] copyColumns,Boolean isTransferToString){
        if(source ==null) {
            return;
        }
        if(target ==null) {
            return;
        }

        Stream<String> allColumns =  getAllColumns(target,copyColumns);

        allColumns.forEach(copyColumn ->{

            try {
                Object value = invokeGet(source,copyColumn);

                if(isTransferToString){
                    if(value==null) {
                        value = "";
                    } else{
                        value = value.toString();
                    }

                }
                invokeSet(target,copyColumn,value);
            }
            catch (Exception er){
                System.out.print(er.getMessage());
            }
        });
    }

    public static Stream<String> getAllColumns(Object targetClass, String[] copyColumns){
        //把对象中本身的字段全部获取处理
        Field[] fields = targetClass.getClass().getDeclaredFields();
        String[] arrDefaultColumns =
                Arrays.asList(fields).stream().map(field -> field.getName()).toArray(String[] :: new);

        //组合外围导入的字段，用于处理字段不一致要对照的字段
        Stream<String> allColumns = Stream.concat(Stream.of(arrDefaultColumns),Stream.of(copyColumns))
                .distinct();
        return allColumns;
    }

    @SuppressWarnings("unchecked")
    public static Method getGetMethod(Class objectClass, String fieldName) {
        StringBuffer sb = new StringBuffer();
        sb.append("get");
        sb.append(fieldName.substring(0, 1).toUpperCase());
        sb.append(fieldName.substring(1));
        try {
            return objectClass.getMethod(sb.toString());
        } catch (Exception e) {
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static Method getSetMethod(Class objectClass, String fieldName) {
        try {
            Class[] parameterTypes = new Class[1];
            Field field = objectClass.getDeclaredField(fieldName);
            parameterTypes[0] = field.getType();
            StringBuffer sb = new StringBuffer();
            sb.append("set");
            sb.append(fieldName.substring(0, 1).toUpperCase());
            sb.append(fieldName.substring(1));
            Method method = objectClass.getMethod(sb.toString(), parameterTypes);
            return method;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void invokeSet(Object o, String fieldName, Object value) {
        Method method = getSetMethod(o.getClass(), fieldName);
        try {
            if(method != null){
                method.invoke(o, new Object[] { value });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String invokeGetWithOutNull(Object o, String fieldName) {
        Method method = getGetMethod(o.getClass(), fieldName);
        try {
            if(method ==null) {
                return "";
            }
            Object value =  method.invoke(o, new Object[0]);
            if(value == null) {
                return "";
            } else {
                return value.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
  /* public static String invokeGetDate(Object o, String fieldName) {
        Method method = getGetMethod(o.getClass(), fieldName);
        try {
            if(method ==null) {
                return "";
            }
            Object value = method.invoke(o, new Object[0]);
            if(value instanceof Date){
                return DateFormatUtils.format((Date)method.invoke(o, new Object[0]),"yyyy-MM-dd HH:mm:ss");
            }
            return  "";

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
    public static Object invokeGet(Object o, String fieldName) {
        Method method = getGetMethod(o.getClass(), fieldName);
        try {
            if(method ==null) {
                return null;
            }
            return method.invoke(o, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
