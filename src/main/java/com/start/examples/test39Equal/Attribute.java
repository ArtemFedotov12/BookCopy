package com.start.examples.test39Equal;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class Attribute {
    private String name;
    private String purpose;

    @Override
    public boolean equals(Object o) {
        System.out.println("Equal from Attribute");
        if (this == o) return true;
        if (!(o instanceof Attribute)) return false;
        Attribute attribute = (Attribute) o;
        return Objects.equals(name, attribute.name) &&
                Objects.equals(purpose, attribute.purpose);
    }

    @Override
    public int hashCode() {
        System.out.println("Hash from Attribute");
        return Objects.hash(name, purpose);
    }
}
