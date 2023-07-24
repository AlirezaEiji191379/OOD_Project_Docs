package content.controllers;

import content.context.CategoryRequest;
import content.services.contracts.CategoryService;
import core.library.context.Response;

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
