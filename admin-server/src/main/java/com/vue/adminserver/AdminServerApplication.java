package com.vue.adminserver;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author caishaodong
 * @since 2020-08-06
 */
@SpringBootApplication
@MapperScan(basePackages = "com.vue.adminserver.mapper")
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        generateDocs();
    }

    /**
     * 生成 JApiDocs
     */
    public static void generateDocs() {
        DocsConfig config = new DocsConfig();
        String projectPath = System.getProperty("user.dir");
        String docPath = projectPath + "\\src\\main\\resources\\docs";
        // 项目根目录
        config.setProjectPath(projectPath);
        // 项目名称
        config.setProjectName("AdminServer");
        // 声明该API的版本
        config.setApiVersion("V2.0");
        // 生成API 文档所在目录
        config.setDocsPath(docPath);
        // 配置自动生成
        config.setAutoGenerate(Boolean.TRUE);
        Docs.buildHtmlDocs(config);
    }

}
