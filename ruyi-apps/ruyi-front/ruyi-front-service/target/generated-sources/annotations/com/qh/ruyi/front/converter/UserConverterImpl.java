package com.qh.ruyi.front.converter;

import com.qh.ruyi.dto.UserDto;
import com.qh.ruyi.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-09T15:43:15+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_351 (Oracle Corporation)"
)
public class UserConverterImpl implements UserConverter {

    @Override
    public User dto2Entity(UserDto r) {
        if ( r == null ) {
            return null;
        }

        User user = new User();

        user.setId( r.getId() );
        user.setName( r.getName() );
        user.setPhone( r.getPhone() );
        user.setSex( r.getSex() );
        user.setIdNumber( r.getIdNumber() );
        user.setAvatar( r.getAvatar() );
        user.setStatus( r.getStatus() );

        return user;
    }

    @Override
    public List<User> dto2Entity4List(List<UserDto> listR) {
        if ( listR == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( listR.size() );
        for ( UserDto userDto : listR ) {
            list.add( dto2Entity( userDto ) );
        }

        return list;
    }

    @Override
    public UserDto entity2Dto(User t) {
        if ( t == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( t.getId() );
        userDto.setName( t.getName() );
        userDto.setPhone( t.getPhone() );
        userDto.setSex( t.getSex() );
        userDto.setIdNumber( t.getIdNumber() );
        userDto.setAvatar( t.getAvatar() );
        userDto.setStatus( t.getStatus() );

        return userDto;
    }

    @Override
    public List<UserDto> entity2Dto4List(List<User> t) {
        if ( t == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( t.size() );
        for ( User user : t ) {
            list.add( entity2Dto( user ) );
        }

        return list;
    }
}
