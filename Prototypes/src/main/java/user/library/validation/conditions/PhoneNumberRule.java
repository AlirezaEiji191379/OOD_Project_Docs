package user.library.validation.conditions;

import core.library.validation.Rule;

public class PhoneNumberRule implements Rule {

    private String phoneNumber;

    public PhoneNumberRule(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean apply() {
        return false;
    }
}
