package content.services.contracts;

import content.context.CategoryRequest;
import core.library.context.Response;

public interface CategoryService {
    Response add(CategoryRequest request);
    Response edit(CategoryRequest request);
    Response show(CategoryRequest request);
    Response delete(CategoryRequest request);
}
