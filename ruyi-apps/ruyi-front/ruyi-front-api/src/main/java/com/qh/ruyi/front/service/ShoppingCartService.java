package com.qh.ruyi.front.service;

import com.qh.ruyi.dto.ShoppingCartDto;

import java.util.List;

public interface ShoppingCartService {
    ShoppingCartDto add(ShoppingCartDto shoppingCartDto);

    List<ShoppingCartDto> list();

    Boolean remove();

    ShoppingCartDto sub(ShoppingCartDto shoppingCartDto);
}
