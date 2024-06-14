package pl.dicedev.turtle;


import pl.dicedev.turtle.repository.CardRepository;
import pl.dicedev.turtle.repository.Repository;

//@SpringBootApplication
public class TurtleApplication {

    public static void main(String[] args) {
        Repository repository = new CardRepository();

        System.out.println(repository.readCards());

    }

//	public static void main(String[] args) {
//		SpringApplication.run(TurtleApplication.class, args);
//	}

}
