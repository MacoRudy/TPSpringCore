package fr.eni.spring.bean;

import fr.eni.spring.bean.type.TypeTheque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component(value = "mediatheque")
public class Mediatheque {
@Autowired(required = false)
@Qualifier("bibliotheque")
    private TypeTheque type;
    private List<Media> collection;

    public Mediatheque(TypeTheque type, List<Media> collection) {
        this.type = type;
        this.collection = collection;
    }

    public Mediatheque() {
        this.collection = new ArrayList<>();
    }

    public TypeTheque getType() {
        return type;
    }

    public void setType(TypeTheque type) {
        this.type = type;
    }

    public List<Media> getCollection() {
        return collection;
    }

    public void setCollection(List<Media> collection) {
        this.collection = collection;
    }
}
