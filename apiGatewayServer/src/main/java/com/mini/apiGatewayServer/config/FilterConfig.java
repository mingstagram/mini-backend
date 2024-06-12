package com.mini.apiGatewayServer.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class FilterConfig {
//	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
						.route(r -> r.path("/mini/**")
												.filters(f->f.addRequestHeader("mini-request", "mini-request-header")
																		.addResponseHeader("mini-respose", "mini-response-header"))
												.uri("http://localhost:8001"))
//						.route(r -> r.path("/second/**")
//												.filters(f->f.addRequestHeader("second-request", "second-request-header")
//																		.addResponseHeader("second-response", "second-response-header"))
//												.uri("http://localhost:8002"))
						.build();
	}

}
