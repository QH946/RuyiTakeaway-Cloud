package com.qh.ruyi.front.converter;

import com.qh.ruyi.dto.ShoppingCartDto;
import com.qh.ruyi.entity.ShoppingCart;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-09T15:43:15+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_351 (Oracle Corporation)"
)
public class ShoppingChartConverterImpl implements ShoppingChartConverter {

    @Override
    public ShoppingCart dto2Entity(ShoppingCartDto r) {
        if ( r == null ) {
            return null;
        }

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setId( r.getId() );
        shoppingCart.setName( r.getName() );
        shoppingCart.setUserId( r.getUserId() );
        shoppingCart.setDishId( r.getDishId() );
        shoppingCart.setSetmealId( r.getSetmealId() );
        shoppingCart.setDishFlavor( r.getDishFlavor() );
        shoppingCart.setNumber( r.getNumber() );
        shoppingCart.setAmount( r.getAmount() );
        shoppingCart.setImage( r.getImage() );
        shoppingCart.setCreateTime( r.getCreateTime() );

        return shoppingCart;
    }

    @Override
    public List<ShoppingCart> dto2Entity4List(List<ShoppingCartDto> listR) {
        if ( listR == null ) {
            return null;
        }

        List<ShoppingCart> list = new ArrayList<ShoppingCart>( listR.size() );
        for ( ShoppingCartDto shoppingCartDto : listR ) {
            list.add( dto2Entity( shoppingCartDto ) );
        }

        return list;
    }

    @Override
    public ShoppingCartDto entity2Dto(ShoppingCart t) {
        if ( t == null ) {
            return null;
        }

        ShoppingCartDto shoppingCartDto = new ShoppingCartDto();

        shoppingCartDto.setId( t.getId() );
        shoppingCartDto.setName( t.getName() );
        shoppingCartDto.setUserId( t.getUserId() );
        shoppingCartDto.setDishId( t.getDishId() );
        shoppingCartDto.setSetmealId( t.getSetmealId() );
        shoppingCartDto.setDishFlavor( t.getDishFlavor() );
        shoppingCartDto.setNumber( t.getNumber() );
        shoppingCartDto.setAmount( t.getAmount() );
        shoppingCartDto.setImage( t.getImage() );
        shoppingCartDto.setCreateTime( t.getCreateTime() );

        return shoppingCartDto;
    }

    @Override
    public List<ShoppingCartDto> entity2Dto4List(List<ShoppingCart> t) {
        if ( t == null ) {
            return null;
        }

        List<ShoppingCartDto> list = new ArrayList<ShoppingCartDto>( t.size() );
        for ( ShoppingCart shoppingCart : t ) {
            list.add( entity2Dto( shoppingCart ) );
        }

        return list;
    }
}
