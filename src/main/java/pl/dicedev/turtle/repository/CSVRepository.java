package pl.dicedev.turtle.repository;

import pl.dicedev.turtle.dto.Card;
import pl.dicedev.turtle.enums.CardValue;
import pl.dicedev.turtle.enums.TurtleColor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVRepository implements Repository {

    public List<Card> readCards() {
        List<Card> cards = new ArrayList<>();
        try {
            InputStream inputStream = CSVRepository.class.getClassLoader().getResourceAsStream("cards.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 2) {
                    Card card = new Card(
                            CardValue.valueOf(parts[0].replaceAll("\\s+", "")),
                            TurtleColor.valueOf(parts[1].replaceAll("\\s+", ""))
                    );
                    cards.add(card);
                }
            }
        } catch (IOException e) {
            System.out.println("Problem z odczytem pliku");
        }

        return cards;
    }

}
