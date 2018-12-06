package com.serverless.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.serverless.model.HttpRequest;
import com.serverless.model.HttpResponse;
import com.serverless.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class DeleteProductHandler extends HttpBaseHandler {

    private static final Logger LOG = LogManager.getLogger(DeleteProductHandler.class);

    @Inject
    ProductService productService;

    protected void init() {
        productService = productComponent.getProductService();
    }

    @Override
    protected HttpResponse process(HttpRequest request, HttpResponse response, Context context) {
        return null;
    }
}
