package com.develhope.SpringAdvanced0101.configuration;

import com.develhope.SpringAdvanced0101.interceptors.BasicControllerInterceptor;
import com.develhope.SpringAdvanced0101.interceptors.BasicControllerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private BasicControllerInterceptor basicControllerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(basicControllerInterceptor);

    }

}
