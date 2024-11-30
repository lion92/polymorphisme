package org.example;

public class Chat extends Animal{
    private final String pelage;
    private final String cri;

    public Chat(String pelage, String cri) {
        super(pelage, cri);
        this.pelage = pelage;
        this.cri = cri;
    }

    @Override
    public String caracteristique() {
        return "Chat à "+this.cri;
    }
}
