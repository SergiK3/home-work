package ge.itvet.main;


import ge.itvet.exception.OlympicGameException;
import ge.itvet.olympic.*;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws OlympicGameException {

        Set<Medal> medalSet = OlympicGameGenerator.generateOlympicMedalsForYear
                (2000,2002,2004,2006,2008,2010,2012,2014,2016,2018,2020,2022);

        var result = medalSet.stream()
                .filter(medal -> medal.getMedal() == MedalType.BRONZE)
                .collect(Collectors.summarizingInt(medal -> medal.getMedal().ordinal()));

        System.out.println(result);

        var result1 = medalSet.stream()
                .filter(medal -> medal.getMedal() == MedalType.SILVER)
                .collect(Collectors.summarizingInt(medal -> medal.getMedal().ordinal()));
        System.out.println(result1);

        var result2 = medalSet.stream()
                .filter(medal -> medal.getMedal() == MedalType.GOLD)
                .collect(Collectors.summarizingInt(medal -> medal.getMedal().ordinal()));
        System.out.println(result2);

        medalSet.stream()
                .filter(country -> country.getCountry() == Country.GEORGIA)

                .forEachOrdered(System.out::println);

    }



}
