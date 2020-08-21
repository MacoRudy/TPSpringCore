package fr.eni.spring.bean.type;

import org.springframework.stereotype.Component;

@Component(value = "bibliotheque")
public class Bibliotheque extends TypeTheque{

    public Bibliotheque() {
        super("Bibliotheque", "livre");
    }
}
