package com.serverless.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.serverless.config.DaggerProductComponent;
import com.serverless.config.ProductComponent;
import com.serverless.model.HttpRequest;
import com.serverless.model.HttpResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class HttpBaseHandler implements RequestHandler<HttpRequest, HttpResponse> {
    static final ProductComponent productComponent = DaggerProductComponent.builder().build();
    private static final Logger LOGGER = LogManager.getLogger(HttpBaseHandler.class);

    protected void init() {

    }

    protected abstract HttpResponse process(HttpRequest request, HttpResponse response, Context context);


    protected void destroy() {
    }


    @Override
    public final HttpResponse handleRequest(HttpRequest request, Context context) {
        HttpResponse response = new HttpResponse();

        try {
            init();

            response = process(request, response, context);

            destroy();
        } catch (Throwable t) {
            LOGGER.debug("Error thrown {}", t);
        }

        return response;
    }
}