package org.example.content.controllers;

import org.example.content.context.CategoryRequest;
import org.example.content.context.Response;
import org.example.content.services.contracts.CategoryService;

public class CategoryController {
    private CategoryService categoryService;

    public Response add(CategoryRequest request) {
        return categoryService.add(request);
    }

    public Response edit(CategoryRequest request) {
        return categoryService.edit(request);
    }

    public Response show(CategoryRequest request) {
        return categoryService.show(request);
    }

    public Response delete(CategoryRequest request) {
        return categoryService.delete(request);
    }
}
