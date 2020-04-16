package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRoteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("path_route_custom",
                        r -> r.path("/").uri("https://www.baidu.com/"))
                .build();
    }
}
