package com.competence.map.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CorsFilterConfig {

  @Value("${allowed-origin}")
  private String allowedOrigin;

//  @Bean
//  public FilterRegistrationBean<CorsFilter> simpleCorsFilter() {
//    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//    CorsConfiguration config = new CorsConfiguration();
//    config.setAllowCredentials(true);
//    config.setAllowedOrigins(Collections.singletonList(allowedOrigin));
//    config.setAllowedMethods(Collections.singletonList("*"));
//    config.setAllowedHeaders(Collections.singletonList("*"));
//    source.registerCorsConfiguration("/**", config);
//    FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
//    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//    return bean;
//  }
}
