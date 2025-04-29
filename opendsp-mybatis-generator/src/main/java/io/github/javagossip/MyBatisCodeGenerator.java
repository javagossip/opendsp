package io.github.javagossip;

import com.mybatisflex.codegen.Generator;
import com.mybatisflex.codegen.config.ColumnConfig;
import com.mybatisflex.codegen.config.GlobalConfig;
import com.mybatisflex.core.handler.CommaSplitTypeHandler;
import com.mybatisflex.core.handler.Fastjson2TypeHandler;
import com.zaxxer.hikari.HikariDataSource;

import org.apache.ibatis.type.JdbcType;

public class MyBatisCodeGenerator {

    private static final String DB_URL = """
                                         jdbc:mysql://localhost:3306/opendsp?allowPublicKeyRetrieval=true&remarks=true&useInformationSchema=true&useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC&tinyInt1isBit=true
                                         """;
    //private static final String OUTPUT_DIR = Paths.get(System.getProperty("user.dir"));

    public static void main(String[] args) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(DB_URL);
        dataSource.setUsername("root");
        dataSource.setPassword("Hello%1234");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

        //创建配置内容，两种风格都可以。
        GlobalConfig globalConfig = createGlobalConfigUseStyle1();
        //GlobalConfig globalConfig = createGlobalConfigUseStyle2();

        //通过 datasource 和 globalConfig 创建代码生成器
        Generator generator = new Generator(dataSource, globalConfig);

        //生成代码
        generator.generate();
    }

    public static GlobalConfig createGlobalConfigUseStyle1() {
        //创建配置内容
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setSourceDir(
                "/Users/weipingwang/Documents/workspaces/java/opendsp/opendsp-dao/src/main/java");

        //设置根包
        globalConfig.setBasePackage("io.github.javagossip.opendsp");

        //设置表前缀和只生成哪些表
        //globalConfig.setTablePrefix("tb_");
        globalConfig.setGenerateTable("sys_dict");

        //设置生成 entity 并启用 Lombok
        globalConfig.setEntityGenerateEnable(true);
        globalConfig.setEntityWithLombok(true);
        //设置项目的JDK版本，项目的JDK为14及以上时建议设置该项，小于14则可以不设置
        //globalConfig.setEntityJdkVersion(17);

        //设置生成 mapper
        globalConfig.setMapperGenerateEnable(true);
        globalConfig.setMapperXmlGenerateEnable(true);
        globalConfig.setMapperAnnotation(true);
        globalConfig.setMapperXmlPath(
                "/Users/weipingwang/Documents/workspaces/java/opendsp/opendsp-dao/src/main/resources" +
                        "/mapper");
        globalConfig.setControllerGenerateEnable(false);
        globalConfig.setServiceGenerateEnable(true);
        globalConfig.setServiceClassSuffix("Dao");
        globalConfig.setServiceImplGenerateEnable(true);
        globalConfig.setServiceImplClassSuffix("DaoImpl");
        globalConfig.setAuthor("weiping wang");
        globalConfig.setMapperPackage("io.github.javagossip.opendsp.mapper");
        globalConfig.setServicePackage("io.github.javagossip.opendsp.dao");
        globalConfig.setServiceImplPackage("io.github.javagossip.opendsp.dao.impl");
        globalConfig.setEntityPackage("io.github.javagossip.opendsp.model");

        globalConfig.setServiceOverwriteEnable(true);
        globalConfig.setServiceImplOverwriteEnable(true);
        globalConfig.setMapperOverwriteEnable(true);
        globalConfig.setEntityOverwriteEnable(true);

        ColumnConfig cc = ColumnConfig.create();
        cc.setColumnName("freq_capping");
        cc.setJdbcType(JdbcType.VARCHAR);
        cc.setPropertyType("io.github.javagossip.opendsp.model.FreqCapping");
        cc.setTypeHandler(Fastjson2TypeHandler.class);

        ColumnConfig cc1 = ColumnConfig.create();
        cc1.setColumnName("target_geo_location");
        cc1.setJdbcType(JdbcType.VARCHAR);
        cc1.setPropertyType("java.util.List<GeoLocation>");
        cc1.setTypeHandler(Fastjson2TypeHandler.class);


//        ColumnConfig cc2 = ColumnConfig.create();
//        cc2.setColumnName("target_region");
//        cc2.setJdbcType(JdbcType.VARCHAR);
//        cc2.setPropertyType("java.util.List<String>");
//        cc2.setTypeHandler(CommaSplitTypeHandler.class);
//
//        ColumnConfig cc3 = ColumnConfig.create();
//        cc3.setColumnName("target_os");
//        cc3.setJdbcType(JdbcType.VARCHAR);
//        cc3.setPropertyType("java.util.List<String>");
//        cc3.setTypeHandler(CommaSplitTypeHandler.class);

        globalConfig.setColumnConfig("ad_group", cc);
        globalConfig.setColumnConfig("ad_group", cc1);
//        globalConfig.setColumnConfig("ad_group", cc2);
//        globalConfig.setColumnConfig("ad_group", cc3);
        return globalConfig;
    }
}
