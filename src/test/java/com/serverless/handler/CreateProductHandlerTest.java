package com.serverless.handler;

import org.junit.Assert;
import org.junit.Test;

public class CreateProductHandlerTest {

    @Test
    public void testHandleRequestSuccess() {
        Assert.assertEquals(new Integer(200), new CreateProductHandler().handleRequest(null, null).getStatusCode());
    }
}