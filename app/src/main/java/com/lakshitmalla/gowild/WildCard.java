package com.lakshitmalla.gowild;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public static WildCard createCard(String animal){
        WildCard card = new WildCard();
        card.setName(animal);
        return card;
    }

    public static List<String> getNamesOfCard(List<WildCard> wcards){
        List<String> names = new ArrayList<>();
        for (WildCard card:wcards){
            names.add(card.name);
        }
        return names;
    }
}
