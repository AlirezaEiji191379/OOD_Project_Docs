package content.services;

import content.context.CategoryRequest;
import content.library.validation.conditions.DuplicateNameRule;
import content.repositories.contracts.CategoryRepository;
import content.repositories.contracts.ContentMetaDataRepository;
import content.services.contracts.CategoryService;
import content.services.contracts.ContentService;
import core.library.context.Response;
import core.library.validation.Validator;

public class DefaultCategoryService implements CategoryService {

    private CategoryRepository categoryRepository;
    private ContentMetaDataRepository metaDataRepository;
    private ContentService contentService;
    private Validator validator;

    public DefaultCategoryService() {}

    @Override
    public Response add(CategoryRequest request) {
        DuplicateNameRule rule = new DuplicateNameRule();
        validator.validate(rule);
        return new Response();
    }

    @Override
    public Response edit(CategoryRequest request) {
        return null;
    }

    @Override
    public Response show(CategoryRequest request) {
        contentService.show(metaDataRepository.findByCategoryId(request.getId())[0].getContentId());
        return null;
    }

    @Override
    public Response delete(CategoryRequest request) {
        metaDataRepository.findByCategoryId(request.getId());
        return null;
    }
}
