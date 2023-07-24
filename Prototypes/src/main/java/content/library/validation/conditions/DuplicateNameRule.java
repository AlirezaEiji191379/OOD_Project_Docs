package content.library.validation.conditions;

import content.repositories.contracts.CategoryRepository;
import core.library.validation.Rule;

public class DuplicateNameRule implements Rule {

    private String name;
    private int channelId;

    private CategoryRepository categoryRepository;

    public DuplicateNameRule() {
    }

    @Override
    public boolean apply() {
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }
}
