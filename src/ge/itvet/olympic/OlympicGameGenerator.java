package ge.itvet.olympic;

import ge.itvet.exception.OlympicGameException;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class OlympicGameGenerator {
    //მეთოდები სტატიკური
    //generateGamesForYear რომელსაც გადაეცემა წელი, და დააბრუნებს თამაშების კოლექციას (Set<Game>)
    // რომელიც შესაბამის წელს ჩატარდა. თუ ზამთრის სეზონის წელი იყო,
    // მაშინ ყველა ზამთრის სეზონის OlympicGame-სთვის უნდა დაგენერირდეს თამაში. - შესაბამისად ზაფხულზეც.

    public static Set<Game> generateGamesForYear(int year) throws OlympicGameException {
        Set<Game> gameSet = new HashSet<>();

        if ((year > 1896) && (year < LocalDate.now().getYear()) && (year % 4 == 0)) {
            for (OlympicGame game : OlympicGame.values()) {
                if (game.getSeason() == OlympicGameSeason.SUMMER)
                    gameSet.add(new Game(game, year));
            }
        }

        if ((year > 1924) && (year < LocalDate.now().getYear()) && (year % 2 == 0) && (year % 4 != 0)) {
            for (OlympicGame game : OlympicGame.values()) {
                if (game.getSeason() == OlympicGameSeason.WINTER)
                    gameSet.add(new Game(game, year));
            }
        }


        return gameSet;
    }
}
