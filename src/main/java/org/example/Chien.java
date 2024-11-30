package org.example;

public class Chien extends Animal {
    private final String pelage;
    private final String cri;

    public Chien(String pelage, String cri) {
        super(pelage, cri);
        this.pelage = pelage;
        this.cri = cri;
    }

}
