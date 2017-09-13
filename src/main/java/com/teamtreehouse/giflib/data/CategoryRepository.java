package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jianjunliu on 2017-09-12.
 */

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATOGORIES = Arrays.asList(
            new Category(1, "Sightseeing"),
            new Category(2, "Study"),
            new Category(3, "Dining"),
            new Category(4, "Entertainment")
    );

    public Category findById(int id) {
        for (Category category : ALL_CATOGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategories() {
        return ALL_CATOGORIES;
    }
}
