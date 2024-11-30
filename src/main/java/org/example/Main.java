package org.example;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat("poil", "miaule");
        Chien chien = new Chien("poil", "aboie");

        System.out.println(chat.caracteristique());
        System.out.println(chien.caracteristique());



    }
}