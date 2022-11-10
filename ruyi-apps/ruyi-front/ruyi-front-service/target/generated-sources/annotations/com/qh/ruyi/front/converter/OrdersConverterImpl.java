package com.qh.ruyi.front.converter;

import com.qh.ruyi.dto.OrdersDto;
import com.qh.ruyi.entity.Orders;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-09T15:43:15+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_351 (Oracle Corporation)"
)
public class OrdersConverterImpl implements OrdersConverter {

    @Override
    public Orders dto2Entity(OrdersDto r) {
        if ( r == null ) {
            return null;
        }

        Orders orders = new Orders();

        orders.setId( r.getId() );
        orders.setNumber( r.getNumber() );
        orders.setStatus( r.getStatus() );
        orders.setUserId( r.getUserId() );
        orders.setAddressBookId( r.getAddressBookId() );
        orders.setOrderTime( r.getOrderTime() );
        orders.setCheckoutTime( r.getCheckoutTime() );
        orders.setPayMethod( r.getPayMethod() );
        orders.setAmount( r.getAmount() );
        orders.setRemark( r.getRemark() );
        orders.setUserName( r.getUserName() );
        orders.setPhone( r.getPhone() );
        orders.setAddress( r.getAddress() );
        orders.setConsignee( r.getConsignee() );

        return orders;
    }

    @Override
    public List<Orders> dto2Entity4List(List<OrdersDto> listR) {
        if ( listR == null ) {
            return null;
        }

        List<Orders> list = new ArrayList<Orders>( listR.size() );
        for ( OrdersDto ordersDto : listR ) {
            list.add( dto2Entity( ordersDto ) );
        }

        return list;
    }

    @Override
    public OrdersDto entity2Dto(Orders t) {
        if ( t == null ) {
            return null;
        }

        OrdersDto ordersDto = new OrdersDto();

        ordersDto.setId( t.getId() );
        ordersDto.setNumber( t.getNumber() );
        ordersDto.setStatus( t.getStatus() );
        ordersDto.setUserId( t.getUserId() );
        ordersDto.setAddressBookId( t.getAddressBookId() );
        ordersDto.setOrderTime( t.getOrderTime() );
        ordersDto.setCheckoutTime( t.getCheckoutTime() );
        ordersDto.setPayMethod( t.getPayMethod() );
        ordersDto.setAmount( t.getAmount() );
        ordersDto.setRemark( t.getRemark() );
        ordersDto.setUserName( t.getUserName() );
        ordersDto.setPhone( t.getPhone() );
        ordersDto.setAddress( t.getAddress() );
        ordersDto.setConsignee( t.getConsignee() );

        return ordersDto;
    }

    @Override
    public List<OrdersDto> entity2Dto4List(List<Orders> t) {
        if ( t == null ) {
            return null;
        }

        List<OrdersDto> list = new ArrayList<OrdersDto>( t.size() );
        for ( Orders orders : t ) {
            list.add( entity2Dto( orders ) );
        }

        return list;
    }
}
