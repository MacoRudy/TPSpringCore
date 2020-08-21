package fr.eni.spring.bean.type;

import org.springframework.stereotype.Component;

@Component
public class CDTheque extends TypeTheque {
    public CDTheque(String nom, String media) {
        super("CDTheque", "disque");
    }

    public CDTheque() {
    }
}
