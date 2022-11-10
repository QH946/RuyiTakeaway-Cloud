package com.qh.ruyi.backend.converter;

import com.qh.ruyi.dto.CategoryDto;
import com.qh.ruyi.entity.Category;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-09T15:43:18+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_351 (Oracle Corporation)"
)
public class CategoryConverterImpl implements CategoryConverter {

    @Override
    public Category dto2Entity(CategoryDto r) {
        if ( r == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( r.getId() );
        category.setType( r.getType() );
        category.setName( r.getName() );
        category.setSort( r.getSort() );
        category.setCreateTime( r.getCreateTime() );
        category.setUpdateTime( r.getUpdateTime() );
        category.setCreateUser( r.getCreateUser() );
        category.setUpdateUser( r.getUpdateUser() );

        return category;
    }

    @Override
    public List<Category> dto2Entity4List(List<CategoryDto> listR) {
        if ( listR == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( listR.size() );
        for ( CategoryDto categoryDto : listR ) {
            list.add( dto2Entity( categoryDto ) );
        }

        return list;
    }

    @Override
    public CategoryDto entity2Dto(Category t) {
        if ( t == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId( t.getId() );
        categoryDto.setType( t.getType() );
        categoryDto.setName( t.getName() );
        categoryDto.setSort( t.getSort() );
        categoryDto.setCreateTime( t.getCreateTime() );
        categoryDto.setUpdateTime( t.getUpdateTime() );
        categoryDto.setCreateUser( t.getCreateUser() );
        categoryDto.setUpdateUser( t.getUpdateUser() );

        return categoryDto;
    }

    @Override
    public List<CategoryDto> entity2Dto4List(List<Category> t) {
        if ( t == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( t.size() );
        for ( Category category : t ) {
            list.add( entity2Dto( category ) );
        }

        return list;
    }
}
