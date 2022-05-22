package ge.itvet.main;


import ge.itvet.exception.OlympicGameException;
import ge.itvet.olympic.Game;
import ge.itvet.olympic.OlympicGame;




public class Main {
    public static void main(String[] args) throws OlympicGameException {

        Game basket = new Game(OlympicGame.ALPINE_SKIING,1938);
        System.out.println(basket.hashCode());

    }


}
