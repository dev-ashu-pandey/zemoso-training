package com.zemoso.shoppingcart.service;

import com.zemoso.shoppingcart.entity.CartEntity;
import com.zemoso.shoppingcart.repository.CartRepository;
import com.zemoso.shoppingcart.service.ShoppingCartService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ShoppingCartServiceTest {

    @Mock
    private ShoppingCartService shoppingCartService;
    @Mock
    private CartRepository cartRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getAllCarts_ReturnsListOfCarts() {
        // Arrange
        List<CartEntity> expectedCarts = new ArrayList<>();
        expectedCarts.add(new CartEntity());
        expectedCarts.add(new CartEntity());

        when(cartRepository.findAll()).thenReturn(expectedCarts);

        // Act
        List<CartEntity> actualCarts = cartRepository.findAll();

        // Assert
        assertEquals(expectedCarts, actualCarts);
        verify(cartRepository, times(1)).findAll();
    }

    @Test
    public void getCartById_ValidId_ReturnsCart() {
        // Arrange
        Long cartId = 1L;
        CartEntity expectedCart = new CartEntity();

        when(cartRepository.findById(cartId)).thenReturn(Optional.of(expectedCart));

        // Act
        Optional<CartEntity> actualCart = cartRepository.findById(cartId);

        // Assert
        assertEquals(Optional.of(expectedCart), actualCart);
    }

    @Test
    public void createCart_ValidCart_ReturnsCreatedCart() {
        // Arrange
        CartEntity cart = new CartEntity();
        CartEntity expectedCart = new CartEntity();

        when(cartRepository.save(cart)).thenReturn(expectedCart);

        // Act
        CartEntity actualCart = cartRepository.save(cart);

        // Assert
        assertEquals(expectedCart, actualCart);
        verify(cartRepository, times(1)).save(cart);
    }

    @Test
    public void deleteCart_ValidId_DeletesCart() {
        // Arrange
        Long cartId = 1L;

        // Act
        cartRepository.deleteById(cartId);

        // Assert
        verify(cartRepository, times(1)).deleteById(cartId);
    }

    @Test
    public void getCartByProductId_ValidProductId_ReturnsCart() {
        // Arrange
        Long productId = 1L;
        CartEntity expectedCart = new CartEntity();

        when(cartRepository.getCartByProductId(productId)).thenReturn(expectedCart);

        // Act
        CartEntity actualCart = cartRepository.getCartByProductId(productId);

        // Assert
        assertEquals(expectedCart, actualCart);
        verify(cartRepository, times(1)).getCartByProductId(productId);
    }
}
