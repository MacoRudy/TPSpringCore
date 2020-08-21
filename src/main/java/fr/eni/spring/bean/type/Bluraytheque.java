package fr.eni.spring.bean.type;

import org.springframework.stereotype.Component;

@Component
public class Bluraytheque extends  TypeTheque{
    public Bluraytheque(String nom, String media) {
        super("Bluraytheque", "bluray");
    }

    public Bluraytheque() {
    }
}
