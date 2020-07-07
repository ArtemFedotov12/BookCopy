package com.start.examples.test39Equal;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
public class Jpo {
    @NonNull
    private String name;
    @NonNull
    private int age;
    private Item item;

    @Override
    public boolean equals(Object o) {
        System.out.println("Equal from Jpo!!!!!!!!!!");
        if (this == o) return true;
        if (!(o instanceof Jpo)) return false;
        Jpo jpo = (Jpo) o;
        return age == jpo.age &&
                Objects.equals(name, jpo.name) &&
                Objects.equals(item, jpo.item);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashhh from Jpo!!!!!!!!!!!");
        return Objects.hash(name, age, item);
    }

// System.out.println("Hashhh from Jpo!!!!!!!!!!!");
    //System.out.println("Equal from Jpo!!!!!!!!!!");
}
