package com.start.examples.test5Patterns.CreationDesingPatterns.builder;

public class Big {

    private String name;
    private int age;
    private boolean married;

    public Big(builder builder) {
        this.name=builder.name;
    }

    @Override
    public String toString() {
        return "Big{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }

    public static class builder{

        private String name;
        private int age;
        private boolean married;


        public builder() {
        }

        public builder setName(String name) {
            this.name = name;
            return this;
        }

        public builder setAge(int age) {
            this.age = age;
            return this;
        }

        public builder setMarried(boolean married) {
            this.married = married;
            return this;
        }

        public Big build() {
            return new Big(this);
        }
    }

}
