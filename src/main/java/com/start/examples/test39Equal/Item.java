package com.start.examples.test39Equal;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class Item {
   private String name;
   private float weight;

    @Override
    public boolean equals(Object o) {
        System.out.println("Equal from Item");
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Float.compare(item.weight, weight) == 0 &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode from Item");
        return Objects.hash(name, weight);
    }
}
