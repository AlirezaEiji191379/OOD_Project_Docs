package org.example.user.library.validation.conditions;

import org.example.user.library.validation.contracts.Rule;

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
