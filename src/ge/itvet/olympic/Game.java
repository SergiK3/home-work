package ge.itvet.olympic;

import ge.itvet.exception.OlympicGameException;
import ge.itvet.exception.OlympicGameFutureException;
import ge.itvet.exception.OlympicGameYearException;

import java.time.LocalDate;
import java.util.Objects;

public class Game {
    //ge.itvet.olympic package-ში შექმენით კლასი Game (თამაში)
    //
    //ველები:
    //olympicGame - თამაში
    //year - წელი
    //კონსტრუქტორი
    //all-args კოსნტრუქტორი - თუ olympicGame არ შეესაბამება წელს გაისვრის OlympicGameYearException შეცდომას.
    //შესაბამის წლის გამოთვლისას გაითვალისწინეთ:
    //თუ წელი > წლევანდელ წელზე გაისროლეთ OlympicGameFutureException.
    //4-ის ჯერადი წლები რომელიც > 1896. და ამ დროს olympicGame-ს სეზონი უნდა იყოს ზაფხული
    //ყველა 2-ის ჯერადი წელი რომელიც არაა 4-ის ჯერადი, ასევე ეს წელი > 1924 და ამ დროს olympicGame-ს სეზონი უნდა იყოს ზამთარი.
    //სხვა შემთხვევაში გაისვრის OlympicGameYearException-ს
    //მეთოდები
    //getter მეთოდები
    //toString
    //hashCode
    //equals

    private final OlympicGame game;
    private final int year;

    //construktorshi amdeni ragac maxinjobaa?
    public Game(OlympicGame game, int year) throws OlympicGameException {

        if (year > LocalDate.now().getYear()) {
            throw new OlympicGameFutureException(year);
        }

        if ((game.getSeason() == OlympicGameSeason.SUMMER) && (year % 4 == 0) && (year > 1896)) {
            this.year = year;
        } else if ((game.getSeason() == OlympicGameSeason.WINTER) && year > 1924 && (year % 2 == 0) && (year % 4 != 0)) {
            this.year = year;
        } else {
            throw new OlympicGameYearException(year);
        }

        this.game = game;

    }

    public OlympicGame getGame() {
        return game;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game1 = (Game) o;
        return year == game1.year && game == game1.game;
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, year);
    }

    @Override
    public String toString() {
        return "Game{" +
                "game=" + game +
                ", year=" + year +
                '}';
    }
}

