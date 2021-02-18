package entity;

import java.io.Serializable;

public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath() {
        System.out.println("creature breath");
    }

    public void eat() {
        System.out.println("creature eat");
    }
}
