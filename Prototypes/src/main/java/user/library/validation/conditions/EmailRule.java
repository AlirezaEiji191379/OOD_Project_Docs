package user.library.validation.conditions;

import core.library.validation.Rule;

public class EmailRule implements Rule {

    private String email;

    public EmailRule(String email) {
        this.email = email;
    }

    @Override
    public boolean apply() {
        return false;
    }
}
