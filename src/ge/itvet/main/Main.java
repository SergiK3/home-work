package ge.itvet.main;


import ge.itvet.exception.OlympicGameException;
import ge.itvet.olympic.*;

import java.util.*;


public class Main {
    public static void main(String[] args) throws OlympicGameException {

        Set<Medal> medalSet = OlympicGameGenerator.generateOlympicMedalsForYear
                (2000,2002,2004,2006,2008,2010,2012,2014,2016,2018,2020,2022);


    }


}
