package org.example.user.library.validation;

import org.example.user.library.validation.contracts.Rule;
import org.example.user.library.validation.contracts.Validator;

public class DefaultValidator implements Validator {
    public boolean validate(Rule...rules) {
        for (Rule rule: rules) {
            if (!rule.apply()) {
                return false;
            }
        }
        return true;
    }
}
