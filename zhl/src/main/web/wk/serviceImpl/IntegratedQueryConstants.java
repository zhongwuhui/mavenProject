package wk.serviceImpl;

/**
 * @Author: zhanghl
 * @Date: 2018/11/27 17:35
 */
public class IntegratedQueryConstants {
    /**
     * 精确查询
     */
    public static final int PRECISE_QUERY = 0;

    /**
     * 模糊查询
     */
    public static final int FUZZY_QUERY = 1;

    /**
     * 全文检索
     */
    public static final int FULLTEST_QUERY = 2;

    /**
     * 分隔符
     */
    public static final String SPLIT_CHARTER = "、";

    /**
     * 权利人
     */
    public static final String OBLIGEE = "1";

    /**
     * 对照转换赋值的时候，分隔符
     */
    public static final String TRANSFER_SPLIT_CHARACTER=":";
    public static final int TRANSFER_SPLIT_LENGTH = 2 ;

    /**
     * 房地产权相关表名
     */
    public static final String HOUSE_RIGHT_TABLE_NAME = "FDCQ";
    public static final String HOUSE_RIGHT_TABLE_NAME_FOR_HISTORY = "FDCQ_LS";

    /**
     * 土地使用权相关表明
     */
    public static final String LAND_RIGHT_TABLE_NAME = "JSYDSYQ";
    public static final String LAND_RIGHT_TABLE_NAME_FOR_HISTORY = "JSYDSYQ_LS";

    /**
     * 林权相关表名
     */
    public static final String FOREST_RIGHT_TABLE_NAME = "LQ";
    public static final String FOREST_RIGHT_TABLE_NAME_FOR_HISTORY = "LQ_LS";

    /**
     * 海域使用权相关表名
     */
    public static final String SEA_RIGHT_TABLE_NAME = "HYSYQ";
    public static final String SEA_RIGHT_TABLE_NAME_FOR_HISTORY = "HYSYQ_LS";

    /**
     * 集体土地所有权相关表名
     */
    public static final String LANDOWNERSHIP_RIGHT_TABLE_NAME = "TDSYQ";
    public static final String LANDOWNERSHIP_RIGHT_TABLE_NAME_FOR_HISTORY = "TDSYQ_LS";

    /**
     * 农用地使用权相关表名
     */
    public static final String LANDAGRICULTURAL_RIGHT_TABLE_NAME = "NYDSYQ";
    public static final String LANDAGRICULTURAL_RIGHT_TABLE_NAME_FOR_HISTORY = "NYDSYQ_LS";

    /**
     * 抵押权、异议、预告、地役、查封、限制表名
     */
    public static final String PLEDGE_TABLE_NAME = "DYAQ";
    public static final String FORNOTICE_TABLE_NAME = "YGDJ";
    public static final String OBJECTION_TABLE_NAME = "YYDJ";
    public static final String EASEMENT_TABLE_NAME = "DYIQ";
    public static final String SEALUP_TABLE_NAME = "CFDJ";
    public static final String Limit_TABLE_NAME = "XZDJ";

}
