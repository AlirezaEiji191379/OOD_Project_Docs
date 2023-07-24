package user.library.validation.conditions;

import core.library.validation.Rule;

public class PasswordRule implements Rule {

    private String password;

    public PasswordRule(String password) {
        this.password = password;
    }

    @Override
    public boolean apply() {
        return false;
    }
}
