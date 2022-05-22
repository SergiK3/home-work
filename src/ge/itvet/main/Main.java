package ge.itvet.main;


import ge.itvet.exception.OlympicGameException;
import ge.itvet.olympic.*;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws OlympicGameException {

        Set <Game> array = OlympicGameGenerator.generateGamesForYear(1900);
        System.out.println(array);








    }


}
