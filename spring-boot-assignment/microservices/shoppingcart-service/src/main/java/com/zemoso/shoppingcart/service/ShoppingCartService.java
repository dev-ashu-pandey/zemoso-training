package com.zemoso.shoppingcart.service;

import com.zemoso.shoppingcart.entity.CartEntity;
import com.zemoso.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartService {

    @Autowired
    private CartRepository cartRepository;


    public List<CartEntity> getAllCarts() {
        return cartRepository.findAll();
    }

    public Optional<CartEntity> getCartById(Long cartId) {
        return cartRepository.findById(cartId);
    }

    public CartEntity createCart(CartEntity cart) {
        return cartRepository.save(cart);
    }


    public void deleteCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }

    public CartEntity getCartByProductId(Long productId) {
        return cartRepository.getCartByProductId(productId);
    }
}
