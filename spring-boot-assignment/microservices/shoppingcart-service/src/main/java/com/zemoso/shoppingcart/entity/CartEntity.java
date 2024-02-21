package com.zemoso.shoppingcart.entity;

import com.zemoso.shoppingcart.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "SHOPPING_CART")
public class CartEntity {

    @Id
    private Long cartId;
    private Integer totalItems;
    private Double totalCost;
    private String itemName;
    private Long productId;
    @Transient
    private Product product=new Product();
}
