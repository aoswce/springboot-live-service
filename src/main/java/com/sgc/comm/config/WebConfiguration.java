package com.sgc.comm.config;
//package com.art.config;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
///**
// * Created by Bruin
// */
//@Aspect
//@Configuration
//public class WebConfiguration {
//
//	@Bean
//	public FilterRegistrationBean corsFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
//		config.setAllowCredentials(true);
//		// 设置你要允许的网站域名，如果全允许则设为 *
//		config.addAllowedOrigin("*");
//		// 如果要限制 HEADER 或 METHOD 请自行更改
//		config.addAllowedHeader("*");
//		config.addAllowedMethod("*");
//		source.registerCorsConfiguration("/v1/**", config);
//		source.registerCorsConfiguration("/api/**", config);
//		source.registerCorsConfiguration("/sys/**", config);
//		source.registerCorsConfiguration("/druid/**", config);
//		source.registerCorsConfiguration("/management/**", config);
//		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
//		// 这个顺序很重要哦，为避免麻烦请设置在最前
//		bean.setOrder(0);
//		return bean;
//	}
//
//}
