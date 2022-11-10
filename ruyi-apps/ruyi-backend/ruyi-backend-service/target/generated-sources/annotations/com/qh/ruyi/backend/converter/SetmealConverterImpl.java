package com.qh.ruyi.backend.converter;

import com.qh.ruyi.dto.SetmealDto;
import com.qh.ruyi.entity.Setmeal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-09T15:43:18+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_351 (Oracle Corporation)"
)
public class SetmealConverterImpl implements SetmealConverter {

    @Override
    public Setmeal dto2Entity(SetmealDto r) {
        if ( r == null ) {
            return null;
        }

        Setmeal setmeal = new Setmeal();

        setmeal.setId( r.getId() );
        setmeal.setCategoryId( r.getCategoryId() );
        setmeal.setName( r.getName() );
        setmeal.setPrice( r.getPrice() );
        setmeal.setStatus( r.getStatus() );
        setmeal.setCode( r.getCode() );
        setmeal.setDescription( r.getDescription() );
        setmeal.setImage( r.getImage() );
        setmeal.setCreateTime( r.getCreateTime() );
        setmeal.setUpdateTime( r.getUpdateTime() );
        setmeal.setCreateUser( r.getCreateUser() );
        setmeal.setUpdateUser( r.getUpdateUser() );
        setmeal.setIsDeleted( r.getIsDeleted() );

        return setmeal;
    }

    @Override
    public List<Setmeal> dto2Entity4List(List<SetmealDto> listR) {
        if ( listR == null ) {
            return null;
        }

        List<Setmeal> list = new ArrayList<Setmeal>( listR.size() );
        for ( SetmealDto setmealDto : listR ) {
            list.add( dto2Entity( setmealDto ) );
        }

        return list;
    }

    @Override
    public SetmealDto entity2Dto(Setmeal t) {
        if ( t == null ) {
            return null;
        }

        SetmealDto setmealDto = new SetmealDto();

        setmealDto.setId( t.getId() );
        setmealDto.setCategoryId( t.getCategoryId() );
        setmealDto.setName( t.getName() );
        setmealDto.setPrice( t.getPrice() );
        setmealDto.setStatus( t.getStatus() );
        setmealDto.setCode( t.getCode() );
        setmealDto.setDescription( t.getDescription() );
        setmealDto.setImage( t.getImage() );
        setmealDto.setCreateTime( t.getCreateTime() );
        setmealDto.setUpdateTime( t.getUpdateTime() );
        setmealDto.setCreateUser( t.getCreateUser() );
        setmealDto.setUpdateUser( t.getUpdateUser() );
        setmealDto.setIsDeleted( t.getIsDeleted() );

        return setmealDto;
    }

    @Override
    public List<SetmealDto> entity2Dto4List(List<Setmeal> t) {
        if ( t == null ) {
            return null;
        }

        List<SetmealDto> list = new ArrayList<SetmealDto>( t.size() );
        for ( Setmeal setmeal : t ) {
            list.add( entity2Dto( setmeal ) );
        }

        return list;
    }
}
