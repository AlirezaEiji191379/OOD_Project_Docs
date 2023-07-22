package org.example.content.services.contracts;

import org.example.content.context.CategoryRequest;
import org.example.content.context.Response;

public interface CategoryService {
    Response add(CategoryRequest request);
    Response edit(CategoryRequest request);
    Response show(CategoryRequest request);
    Response delete(CategoryRequest request);
}
