package com.aomyoungbabe.aomyoungbabeapi.repository;

import com.aomyoungbabe.aomyoungbabeapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
