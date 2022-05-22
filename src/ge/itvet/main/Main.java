package ge.itvet.main;


import ge.itvet.exception.OlympicGameException;
import ge.itvet.olympic.*;


public class Main {
    public static void main(String[] args) throws OlympicGameException {

        Game basket = new Game(OlympicGame.ALPINE_SKIING,1938);
        System.out.println(basket.hashCode());

        Medal medal = new Medal(basket, MedalType.GOLD, Country.GEORGIA);

    }


}
