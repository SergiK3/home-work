package ge.itvet.olympic;


import java.util.Objects;

public class Medal {
    private Game game;
    private MedalType medal;
    private Country country;


    public Medal(Game game, MedalType medal, Country country) {
        this.game = game;
        this.medal = medal;
        this.country = country;
    }

    public Game getGame() {
        return game;
    }

    public MedalType getMedal() {
        return medal;
    }

    public Country getCountry() {
        return country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medal medal1 = (Medal) o;
        return game.equals(medal1.game) && medal == medal1.medal && country == medal1.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, medal, country);
    }

    @Override
    public String toString() {
        return "Medal{" +
                "game=" + game +
                ", medal=" + medal +
                ", country=" + country +
                '}';
    }


}
