package cn.net.susan.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 应用运行时配置
 */
@MapperScan(basePackages = "cn.net.susan.mapper")
@Configuration
public class ApplicationConfig {
}
