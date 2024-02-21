package com.zemoso.shoppingcart.repository;

import com.zemoso.shoppingcart.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Long> {
    CartEntity getCartByProductId(Long productId);
}
