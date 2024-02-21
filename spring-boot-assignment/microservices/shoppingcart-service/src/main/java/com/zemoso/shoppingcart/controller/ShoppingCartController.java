package com.zemoso.shoppingcart.controller;

import com.zemoso.shoppingcart.entity.CartEntity;
import com.zemoso.shoppingcart.model.ShoppingCartRequest;
import com.zemoso.shoppingcart.model.ShoppingCartResponse;
import com.zemoso.shoppingcart.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService cartService;

    @GetMapping("/")
    public String showCart(Model model) {
        List<CartEntity> cart = cartService.getAllCarts();
        double totalSum = cart.stream()
                .mapToDouble(CartEntity::getTotalCost)
                .sum();
        model.addAttribute("totalSum", totalSum);
        model.addAttribute("products", cart);
        return "cart-page";
    }



    @PostMapping("/{productId}")
    public ResponseEntity<ShoppingCartResponse>
        addToCart(@PathVariable Long productId, @RequestBody ShoppingCartRequest request) {
        CartEntity cart = cartService.getCartByProductId(request.getProductId());

        if (cart == null) {
            cart = new CartEntity();
            cart.setCartId(request.getProductId());
            cart.setTotalItems(0);
            cart.setTotalCost(0.0);
            cart.setProductId(request.getProductId());
        }

        cart.setProductId(productId);

        // Update the total items and total cost
        cart.setTotalItems(cart.getTotalItems() + 1);
        cart.setTotalCost(cart.getTotalCost() + request.getAmount()); // Assuming you have a 'price' property in the Product entity
        cart.setItemName(request.getItemName());
        cartService.createCart(cart);

        // Prepare the response
        ShoppingCartResponse response = ShoppingCartResponse.builder().build();
        response.setCartId(cart.getCartId());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }



    @PostMapping("/remove/{cartId}")
    public String removeFromCart(@PathVariable Long cartId) {
        Optional<CartEntity> cartOptional = cartService.getCartById(cartId);
        cartService.deleteCart(cartId);
        return "redirect:/shoppingCart/";
    }
}
