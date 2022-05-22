package ge.itvet.olympic;

import ge.itvet.exception.OlympicGameException;

import java.time.LocalDate;
import java.util.*;

public class OlympicGameGenerator {

    private static final Random random = new Random();
    private static final List<Country> countryArrayList = new ArrayList<>();

    static {
        //metodshi yovel gamodzaxebaze ro ar sheqmniliyo aq gavitane da swori midgomaa?
        for (Country country : Country.values()) {
            countryArrayList.add(country);
        }

    }

    public static Set<Game> generateGamesForYear(int year) throws OlympicGameException {
        Set<Game> gameSet = new HashSet<>();

        if ((year > 1896) && (year <= LocalDate.now().getYear()) && (year % 4 == 0)) {
            for (OlympicGame game : OlympicGame.values()) {
                if (game.getSeason() == OlympicGameSeason.SUMMER)
                    gameSet.add(new Game(game, year));
            }
            return gameSet;
        }

        if ((year > 1924) && (year <= LocalDate.now().getYear()) && (year % 2 == 0) && (year % 4 != 0)) {
            for (OlympicGame game : OlympicGame.values()) {
                if (game.getSeason() == OlympicGameSeason.WINTER)
                    gameSet.add(new Game(game, year));
            }
            return gameSet;
        }

        throw new OlympicGameException("provided incorrect year");

    }

    public static Set<Medal> generateMedalsForGames(Collection<Game> collection, MedalType medalType) {

        Set<Medal> medalSet = new HashSet<>();

        for (Game game : collection) {
            medalSet.add(new Medal(game, medalType, countryArrayList.get(random.nextInt(205))));

        }

        return medalSet;
    }

    public static Set<Medal> generateOlympicMedalsForYear(int... years) throws OlympicGameException {

        Set<Medal> finalMedalSet = new HashSet<>();

        for (int year:years) {
            finalMedalSet.addAll(generateMedalsForGames(generateGamesForYear(year),MedalType.GOLD));
            finalMedalSet.addAll(generateMedalsForGames(generateGamesForYear(year),MedalType.SILVER));
            finalMedalSet.addAll(generateMedalsForGames(generateGamesForYear(year),MedalType.BRONZE));
        }

        return finalMedalSet;
    }
}
