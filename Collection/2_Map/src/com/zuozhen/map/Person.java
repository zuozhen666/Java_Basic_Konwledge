package com.zuozhen.map;

import java.util.Objects;

public class Person implements Comparable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            int compare = -this.name.compareTo(person.name);
            if (compare == 0) {
                return Integer.compare(this.age, person.age);
            } else {
                return compare;
            }
        } else {
            throw new RuntimeException("输入类型不匹配");
        }
    }
}
