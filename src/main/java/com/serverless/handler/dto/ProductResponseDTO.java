package com.serverless.handler.dto;

public class ProductResponseDTO {
    private String data;

    public ProductResponseDTO() {
    }

    public ProductResponseDTO(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public java.lang.String toString() {
        return "ProductResponseDTO{" +
                "data=" + data +
                '}';
    }
}
