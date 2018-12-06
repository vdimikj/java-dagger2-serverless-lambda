package com.serverless.config;

import com.serverless.service.ProductService;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ProductModule.class})
public interface ProductComponent {
    ProductService getProductService();
}
