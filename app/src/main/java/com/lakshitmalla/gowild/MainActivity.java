package com.lakshitmalla.gowild;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<WildCard> wildCards, participantHas, computerHas;
    public int numberOfCardsEach = 8;
    ArrayAdapter cadapter, padapter;
    ListView clist, plist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Go Wild Game -
        Zebra - 8
        Wild - 4
        Orangutan - 8
        Cheetah - 8
        Deer - 8
        Moose - 8
        Bullfrog - 8
        Wold - 8
        Screech Owl - 8
        Dolphin - 8
        Monarcg Butterfly -8
        Bat -8
        Koala Bear - 8
        Kangaroo - 8
         */
    }

    @Override
    protected void onResume() {
        super.onResume();
        wildCards = new ArrayList<>();
        wildCards = createList(new String[]{"Wild", "Zebra", "Orangutan", "Cheetah", "Deer", "Moose",
                "Bullfrog", "Wolf", "Screech Owl", "Dolphin", "Monarch Butterfly", "Bat", "Koala Bear", "Kangaroo"});
        Collections.shuffle(wildCards);
        List<WildCard> participant =  new ArrayList<>();
        List<WildCard> computer =  new ArrayList<>();
        for (int i = 1;  i <= wildCards.size(); i++){
            if (i <= (wildCards.size()/2)){
                participant.add(wildCards.get(i));
            }else{
                computer.add(wildCards.get(i));
            }
        }

        for (int i = 0; i<numberOfCardsEach; i++){
            computerHas.add(computer.get(i));
            participantHas.add(participant.get(i));

            computer.remove(computer.get(i));
            participant.remove(participant.get(i));
        }

        cadapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,WildCard.getNamesOfCard(computerHas));
        padapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,WildCard.getNamesOfCard(participantHas));

        clist = findViewById(R.id.clistView);
        plist = findViewById(R.id.plistView);

    }

    private List<WildCard> createList(String[] animals) {
        List<WildCard> wlist = new ArrayList<>();
        for (String animal : animals) {
            for (int i = 0; i < numberOfCardsEach; i++) {
                wlist.add(WildCard.createCard(animal));
            }
        }
        return wlist;
    }

}