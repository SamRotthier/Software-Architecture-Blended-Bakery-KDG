package be.kdg.sa.bakery.controller.dto;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class OrderDto {
    private UUID orderId;
    private List<OrderProductDto> products;
    private UUID accountId;

    private Instant bakeStartTimestamp;

    private Instant ingredientsReceivedTimestamp;

    public OrderDto() {
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public List<OrderProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProductDto> products) {
        this.products = products;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public Instant getBakeStartTimestamp() {
        return bakeStartTimestamp;
    }

    public void setBakeStartTimestamp(Instant bakeStartTimestamp) {
        this.bakeStartTimestamp = bakeStartTimestamp;
    }
}