package com.start.examples.test5Patterns.CreationDesingPatterns.adapter.wrapper;

import com.start.examples.test5Patterns.CreationDesingPatterns.adapter.SmthWhatCanWahsItself;
import com.start.examples.test5Patterns.CreationDesingPatterns.adapter.phone.Phone;

public class PhoneWrapper implements SmthWhatCanWahsItself {

    private Phone phone;

    public PhoneWrapper(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void wash() {
        this.phone.clean();

    }
}
