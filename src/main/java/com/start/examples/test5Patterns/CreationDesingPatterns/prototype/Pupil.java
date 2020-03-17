package com.start.examples.test5Patterns.CreationDesingPatterns.prototype;

import lombok.*;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Pupil implements Cloneable {

    @NonNull
    private Book book;
    @NonNull
    private String name;
    @NonNull
    private int money;

    @Override
    protected Pupil clone() throws CloneNotSupportedException {
        Pupil pupil = (Pupil) super.clone();
        pupil.setBook(this.getBook().clone());

        return pupil;
    }
}
