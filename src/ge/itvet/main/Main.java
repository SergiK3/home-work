package ge.itvet.main;


import ge.itvet.exception.OlympicGameException;
import ge.itvet.olympic.*;

import java.util.*;


public class Main {
    public static void main(String[] args) throws OlympicGameException {

        Set<Game> gameSet = OlympicGameGenerator.generateGamesForYear(1936);
        System.out.println(gameSet);

        Set<Medal> medalSet = OlympicGameGenerator.generateMedalsForGames(gameSet,MedalType.GOLD);
        System.out.println(medalSet);

        Set<Medal> medalSet1 = OlympicGameGenerator.generateOlympicMedalsForYear(2004,2002);
        System.out.println(medalSet1);
    }


}
