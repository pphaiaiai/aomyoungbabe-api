package com.aomyoungbabe.aomyoungbabeapi.service.impl;

import com.aomyoungbabe.aomyoungbabeapi.dto.CategoryDto;
import com.aomyoungbabe.aomyoungbabeapi.entity.Category;
import com.aomyoungbabe.aomyoungbabeapi.mapper.CategoryMapper;
import com.aomyoungbabe.aomyoungbabeapi.repository.CategoryRepository;
import com.aomyoungbabe.aomyoungbabeapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.mapToCategory(categoryDto);
        Category savedCategory = categoryRepository.save(category);
        return CategoryMapper.mapToCategoryDto(savedCategory);
    }
}
