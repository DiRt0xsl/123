package cn.tedu.jsd2307enjoymall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // /**匹配任意请求
        registry.addMapping("/**")
                .allowedHeaders("*")            //允许任意请求头访问
                .allowedMethods("*")            //允许任意请求方式(get/post/put/delete)访问
                .allowedOriginPatterns("*")     //允许任意的域访问
                .allowCredentials(true)         //允许携带cookie/Session相关信息
                .maxAge(3600);                  //1小时内同一请求不再检测 直接放行
    }
}
