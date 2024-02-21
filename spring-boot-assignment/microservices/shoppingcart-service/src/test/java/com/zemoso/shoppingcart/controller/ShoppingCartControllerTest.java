package com.zemoso.shoppingcart.controller;

import com.zemoso.shoppingcart.entity.CartEntity;
import com.zemoso.shoppingcart.model.ShoppingCartRequest;
import com.zemoso.shoppingcart.model.ShoppingCartResponse;
import com.zemoso.shoppingcart.service.ShoppingCartService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ShoppingCartControllerTest {
    @Mock
    private ShoppingCartService cartService;

    @InjectMocks
    private ShoppingCartController shoppingCartController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void addToCart() {
        // Arrange
        Long productId = 1L;
        ShoppingCartRequest request =ShoppingCartRequest.builder().build();
        request.setProductId(productId);
        request.setAmount(10.0);
        request.setItemName("Test Item");

        CartEntity cart = new CartEntity();
        cart.setCartId(productId);
        cart.setTotalItems(0);
        cart.setTotalCost(0.0);
        cart.setProductId(productId);

        when(cartService.getCartByProductId(productId)).thenReturn(null);
        when(cartService.createCart(any(CartEntity.class))).thenReturn(cart);

        // Act
        ResponseEntity<ShoppingCartResponse> responseEntity = shoppingCartController.addToCart(productId, request);

        // Assert
        verify(cartService, times(1)).getCartByProductId(productId);
        verify(cartService, times(1)).createCart(any(CartEntity.class));
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(cart.getCartId(), responseEntity.getBody().getCartId());
    }

    @Test
    void removeFromCart() {
        // Arrange
        Long cartId = 1L;
        Optional<CartEntity> cartOptional = Optional.of(new CartEntity());

        when(cartService.getCartById(cartId)).thenReturn(cartOptional);

        // Act
        String redirectURL = shoppingCartController.removeFromCart(cartId);

        // Assert
        verify(cartService, times(1)).getCartById(cartId);
        verify(cartService, times(1)).deleteCart(cartId);
        assertEquals("redirect:/shoppingCart/", redirectURL);
    }

}
