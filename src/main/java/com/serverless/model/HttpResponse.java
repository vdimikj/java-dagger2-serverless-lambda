package com.serverless.model;

import java.util.Map;

public class HttpResponse {
    private Integer statusCode;
    private Map<String, String> headers;
    private String body;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public HttpResponse withStatusCode(Integer statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public HttpResponse withHeaders(Map<String, String> headers) {
        setHeaders(headers);
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public HttpResponse withBody(String body) {
        setBody(body);
        return this;
    }

    @Override
    public String toString() {
        return "HttpResponse [statusCode=" + statusCode + ", headers="
                + headers + ", body=" + body + "]";
    }
}