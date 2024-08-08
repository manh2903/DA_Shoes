package com.phs.application.model.dto;

import com.phs.application.entity.Cart;

public class CartResponse {
    private Long id;
    private Long userId;
    private ProductDTO product;
    private int quantity;
    private int size;

    // Constructor từ CartItem
    public CartResponse(Cart cartItem) {
        this.id = Long.valueOf(cartItem.getId()); // Nếu id là kiểu long
        this.userId = cartItem.getUser().getId(); // ID của người dùng
        this.product = new ProductDTO(cartItem.getProduct()); // Chuyển đổi Product sang ProductDTO

    }

    // Getters và Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public ProductDTO getProduct() { return product; }
    public void setProductId(ProductDTO product) { this.product = product; }
}
