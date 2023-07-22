package org.example.user.library.validation.conditions;

import org.example.user.library.validation.contracts.Rule;

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
