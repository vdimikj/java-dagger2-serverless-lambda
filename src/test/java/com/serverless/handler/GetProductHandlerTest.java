package com.serverless.handler;

import com.serverless.model.HttpResponse;
import org.junit.Assert;
import org.junit.Test;

public class GetProductHandlerTest {

    @Test
    public void testHandleRequestSuccess() {
        HttpResponse response = new GetProductHandler().handleRequest(null, null);
        Assert.assertEquals(new Integer(200), response.getStatusCode());
    }
}