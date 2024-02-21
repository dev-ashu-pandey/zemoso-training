package com.zemoso.shoppingcart.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShoppingCartResponse {
    private Long cartId;
}
