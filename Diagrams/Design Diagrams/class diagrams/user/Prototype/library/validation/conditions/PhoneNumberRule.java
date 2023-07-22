package org.example.user.library.validation.conditions;

import org.example.user.library.validation.contracts.Rule;

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
