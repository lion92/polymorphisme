package org.example;

import java.util.Objects;

public class Animal implements ICaracteristique{

    private String pelage;

    private String cri;

    public Animal(String pelage, String cri) {
        this.pelage = pelage;
        this.cri = cri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(pelage, animal.pelage) && Objects.equals(cri, animal.cri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pelage, cri);
    }

    @Override
    public String caracteristique() {
        return "Cet Animal à :"+this.pelage +"et cri:"+this.cri;
    }
}
