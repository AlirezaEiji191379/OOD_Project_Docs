package user.library.validation;

import core.library.validation.Rule;
import core.library.validation.Validator;

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
