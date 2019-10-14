package com.serverless.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.serverless.handler.dto.ProductResponseDTO;
import com.serverless.model.HttpRequest;
import com.serverless.model.HttpResponse;
import com.serverless.model.Product;
import com.serverless.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class CreateProductHandler extends HttpBaseHandler {

    private static final Logger LOG = LogManager.getLogger(CreateProductHandler.class);

    @Inject
    ProductService productService;

    protected void init() {
        productService = productComponent.getProductService();
    }

    @Override
    protected HttpResponse process(HttpRequest request, HttpResponse response, Context context) {
        String id = "testId";

        LOG.info("received: {}", request);
        String product = productService.createProduct(new Product().withId(id));

        String body = null;
        try {
            body = new ObjectMapper().writeValueAsString(new ProductResponseDTO(product));
        } catch (JsonProcessingException e) {
            LOG.error("Error during serialization of Create request {}", e.getMessage(), e);
        }
        return response
                .withBody(body)
                .withStatusCode(200);

    }
}
