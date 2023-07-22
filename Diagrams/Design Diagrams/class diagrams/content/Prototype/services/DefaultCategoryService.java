package org.example.content.services;

import org.example.content.context.CategoryRequest;
import org.example.content.context.Response;
import org.example.content.library.CategoryAssertions;
import org.example.content.repositories.CategoryRepository;
import org.example.content.repositories.ContentMetaDataRepository;
import org.example.content.services.contracts.CategoryService;
import org.example.content.services.contracts.ContentService;

public class DefaultCategoryService implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final ContentMetaDataRepository metaDataRepository;
    private final ContentService contentService;

    public DefaultCategoryService(CategoryRepository categoryRepository, ContentMetaDataRepository metaDataRepository, ContentService contentService) {
        this.categoryRepository = categoryRepository;
        this.metaDataRepository = metaDataRepository;
        this.contentService = contentService;
    }

    @Override
    public Response add(CategoryRequest request) {
        new CategoryAssertions().assertDuplicateName()
    }

    @Override
    public Response edit(CategoryRequest request) {
        return null;
    }

    @Override
    public Response show(CategoryRequest request) {
        metaDataRepository.findByCategoryId()
        contentService.show()
        return null;
    }

    @Override
    public Response delete(CategoryRequest request) {
        metaDataRepository.findByCategoryId(request.getId());
        metaDataRepository.sa
        return null;
    }
}
