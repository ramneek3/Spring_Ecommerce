package com.example.ecommerce.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order_items")
public class OrderItem {

    @Id
    private String id;
    private String orderId;
    private String productId;
    private int quantity;

}