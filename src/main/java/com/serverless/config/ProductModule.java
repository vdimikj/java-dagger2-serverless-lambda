package com.serverless.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.service.ProductService;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ProductModule {
    @Provides
    @Singleton
    public ProductService productService() {
        return new ProductService();
    }

    @Singleton
    @Provides
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}