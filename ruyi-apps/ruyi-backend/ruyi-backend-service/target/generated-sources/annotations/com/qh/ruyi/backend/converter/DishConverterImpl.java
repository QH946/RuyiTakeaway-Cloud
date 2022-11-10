package com.qh.ruyi.backend.converter;

import com.qh.ruyi.dto.DishDto;
import com.qh.ruyi.entity.Dish;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-09T15:43:18+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_351 (Oracle Corporation)"
)
public class DishConverterImpl implements DishConverter {

    @Override
    public Dish dto2Entity(DishDto r) {
        if ( r == null ) {
            return null;
        }

        Dish dish = new Dish();

        dish.setId( r.getId() );
        dish.setName( r.getName() );
        dish.setCategoryId( r.getCategoryId() );
        dish.setPrice( r.getPrice() );
        dish.setCode( r.getCode() );
        dish.setImage( r.getImage() );
        dish.setDescription( r.getDescription() );
        dish.setStatus( r.getStatus() );
        dish.setSort( r.getSort() );
        dish.setCreateTime( r.getCreateTime() );
        dish.setUpdateTime( r.getUpdateTime() );
        dish.setCreateUser( r.getCreateUser() );
        dish.setUpdateUser( r.getUpdateUser() );
        dish.setIsDeleted( r.getIsDeleted() );

        return dish;
    }

    @Override
    public List<Dish> dto2Entity4List(List<DishDto> listR) {
        if ( listR == null ) {
            return null;
        }

        List<Dish> list = new ArrayList<Dish>( listR.size() );
        for ( DishDto dishDto : listR ) {
            list.add( dto2Entity( dishDto ) );
        }

        return list;
    }

    @Override
    public DishDto entity2Dto(Dish t) {
        if ( t == null ) {
            return null;
        }

        DishDto dishDto = new DishDto();

        dishDto.setId( t.getId() );
        dishDto.setName( t.getName() );
        dishDto.setCategoryId( t.getCategoryId() );
        dishDto.setPrice( t.getPrice() );
        dishDto.setCode( t.getCode() );
        dishDto.setImage( t.getImage() );
        dishDto.setDescription( t.getDescription() );
        dishDto.setStatus( t.getStatus() );
        dishDto.setSort( t.getSort() );
        dishDto.setCreateTime( t.getCreateTime() );
        dishDto.setUpdateTime( t.getUpdateTime() );
        dishDto.setCreateUser( t.getCreateUser() );
        dishDto.setUpdateUser( t.getUpdateUser() );
        dishDto.setIsDeleted( t.getIsDeleted() );

        return dishDto;
    }

    @Override
    public List<DishDto> entity2Dto4List(List<Dish> t) {
        if ( t == null ) {
            return null;
        }

        List<DishDto> list = new ArrayList<DishDto>( t.size() );
        for ( Dish dish : t ) {
            list.add( entity2Dto( dish ) );
        }

        return list;
    }
}
