package com.williamnews;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
        registry.addResourceHandler("/upload/news-posts/**").addResourceLocations("classpath:/static/upload/news-posts/");
        registry.addResourceHandler("/upload/addsense/**").addResourceLocations("classpath:/static/upload/addsense/");
        registry.addResourceHandler("/upload/banners/**").addResourceLocations("classpath:/static/upload/banners/");
        registry.addResourceHandler("/upload/flickr/**").addResourceLocations("classpath:/static/upload/flickr/");
        registry.addResourceHandler("/upload/users/**").addResourceLocations("classpath:/static/upload/users/");
        registry.addResourceHandler("/less/**").addResourceLocations("classpath:/static/less/");
        registry.addResourceHandler("/files/**").addResourceLocations("classpath:/static/files/");
    }
}