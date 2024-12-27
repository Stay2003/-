package cn.net.susan.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 应用运行时配置
 *
 * @author 思源，该项目是知识星球：java突击队 的内部项目
 * @date 2024/1/4 下午5:07
 */
@MapperScan(basePackages = "cn.net.susan.mapper")
@Configuration
public class ApplicationConfig {
}
