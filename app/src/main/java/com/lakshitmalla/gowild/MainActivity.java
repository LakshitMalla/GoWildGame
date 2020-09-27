package com.lakshitmalla.gowild;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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

    int zebra, wild, orangutan, cheetah, deer, moose, bullfrog, wolf, screechOwl, dolphin, monarchButterfly, bat, koalaBear, kangaroo;
    int zebraP, wildP, orangutanP, cheetahP, deerP, mooseP, bullfrogP, wolfP, screechOwlP, dolphinP, monarchButterflyP, batP, koalaBearP, kangarooP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Go Wild Game -
        Zebra - 8]
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
        List<WildCard> participant = new ArrayList<>();
        List<WildCard> computer = new ArrayList<>();

        computerHas = new ArrayList<>();
        participantHas = new ArrayList<>();

        for (int i = 1; i <= wildCards.size(); i++) {
            if (i <= (wildCards.size() / 2)) {
                participant.add(wildCards.get(i - 1));
            } else {
                computer.add(wildCards.get(i - 1));
            }
        }

        for (int i = 0; i < numberOfCardsEach; i++) {
            computerHas.add(computer.get(i));
            participantHas.add(participant.get(i));

            computer.remove(computer.get(i));
            participant.remove(participant.get(i));
        }

        cadapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, WildCard.getNamesOfCard(computerHas));
        padapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, WildCard.getNamesOfCard(participantHas));

        for (WildCard wildCard : computerHas) {
            Log.i("Computer", wildCard.name);
            switch (wildCard.name) {
                case "Zebra":
                    zebra += 1;
                case "Wild":
                    wild += 1;
                case "Orangutan":
                    orangutan += 1;
                case "Cheetah":
                    cheetah += 1;
                case "Deer":
                    deer += 1;
                case "Moose":
                    moose += 1;
                case "Bullfrog":
                    bullfrog += 1;
                case "Wolf":
                    wolf += 1;
                case "Screech Owl":
                    screechOwl += 1;
                case "Dolphin":
                    dolphin += 1;
                case "Monarch Butterfly":
                    monarchButterfly += 1;
                case "Bat":
                    bat += 1;
                case "Koala Bear":
                    koalaBear += 1;
                case "Kangaroo":
                    kangaroo += 1;
            }

        }

        for (WildCard wildCard : participantHas) {
            Log.i("Participant", wildCard.name);

            switch (wildCard.name) {
                case "Zebra":
                    zebraP += 1;
                case "Wild":
                    wildP += 1;
                case "Orangutan":
                    orangutanP += 1;
                case "Cheetah":
                    cheetahP += 1;
                case "Deer":
                    deerP += 1;
                case "Moose":
                    mooseP += 1;
                case "Bullfrog":
                    bullfrogP += 1;
                case "Wolf":
                    wolfP += 1;
                case "Screech Owl":
                    screechOwlP += 1;
                case "Dolphin":
                    dolphinP += 1;
                case "Monarch Butterfly":
                    monarchButterflyP += 1;
                case "Bat":
                    batP += 1;
                case "Koala Bear":
                    koalaBearP += 1;
                case "Kangaroo":
                    kangarooP += 1;
            }
        }

        checkForSets();

        clist = findViewById(R.id.clistView);
        plist = findViewById(R.id.plistView);

        clist.setAdapter(cadapter);
        plist.setAdapter(padapter);

    }

    private void checkForSets() {
        if (zebra > 4) {

            computerHas.add(WildCard.createCard("Zebra Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (wild > 4) {

            computerHas.add(WildCard.createCard("Wild Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (orangutan > 4) {

            computerHas.add(WildCard.createCard("Orangutan Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (cheetah > 4) {

            computerHas.add(WildCard.createCard("Cheetah Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (deer > 4) {

            computerHas.add(WildCard.createCard("Deer Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (moose > 4) {
            computerHas.add(WildCard.createCard("Moose Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (bullfrog > 4) {
            computerHas.add(WildCard.createCard("Bullfrog Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (wolf > 4) {

            computerHas.add(WildCard.createCard("Wolf Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (screechOwl > 4) {
            computerHas.add(WildCard.createCard("Screech Owl Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (dolphin > 4) {

            computerHas.add(WildCard.createCard("Dolphin Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (monarchButterfly > 4) {

            computerHas.add(WildCard.createCard("Monarch Butterfly Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (bat > 4) {

            computerHas.add(WildCard.createCard("Bat Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (koalaBear > 4) {

            computerHas.add(WildCard.createCard("Koala Bear Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        } else if (kangaroo > 4) {

            computerHas.add(WildCard.createCard("Kangaroo Set"));
            cadapter.notifyDataSetChanged();
            clist.setAdapter(cadapter);

        }

        if (zebraP > 4) {

            participantHas.add(WildCard.createCard("Zebra Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (wildP > 4) {

            participantHas.add(WildCard.createCard("Wild Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (orangutanP > 4) {

            participantHas.add(WildCard.createCard("Orangutan Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (cheetahP > 4) {

            participantHas.add(WildCard.createCard("Cheetah Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (deerP > 4) {

            participantHas.add(WildCard.createCard("Deer Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (mooseP > 4) {
            participantHas.add(WildCard.createCard("Moose Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (bullfrogP > 4) {
            participantHas.add(WildCard.createCard("Bullfrog Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (wolfP > 4) {

            participantHas.add(WildCard.createCard("Wolf Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (screechOwlP > 4) {
            participantHas.add(WildCard.createCard("Screech Owl Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (dolphinP > 4) {

            participantHas.add(WildCard.createCard("Dolphin Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (monarchButterflyP > 4) {

            participantHas.add(WildCard.createCard("Monarch Butterfly Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (batP > 4) {

            participantHas.add(WildCard.createCard("Bat Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (koalaBearP > 4) {

            participantHas.add(WildCard.createCard("Koala Bear Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        } else if (kangarooP > 4) {

            participantHas.add(WildCard.createCard("Kangaroo Set"));
            padapter.notifyDataSetChanged();
            plist.setAdapter(padapter);

        }

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