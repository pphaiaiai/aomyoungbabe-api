package com.aomyoungbabe.aomyoungbabeapi.mapper;

import com.aomyoungbabe.aomyoungbabeapi.dto.CategoryDto;
import com.aomyoungbabe.aomyoungbabeapi.entity.Category;

public class CategoryMapper {

    public static CategoryDto mapToCategoryDto(Category category) {
        return new CategoryDto(
                category.getId(),
                category.getName(),
                category.getDescription(),
                category.getType(),
                category.getUser().getId()
        );
    }

    public static Category mapToCategory(CategoryDto categoryDto) {
        return new Category(
                categoryDto.getId(),
                categoryDto.getName(),
                categoryDto.getDescription(),
                categoryDto.getType(),
                null
        );
    }
}
