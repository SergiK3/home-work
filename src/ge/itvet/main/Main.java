package ge.itvet.main;

import ge.itvet.pti.Engine;
import ge.itvet.pti.EngineType;
import ge.itvet.pti.InspectionRules;
import ge.itvet.pti.Vehicle;

import java.util.HashMap;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {


        InspectionRules rules = new InspectionRules(new HashMap<>(),20);


        rules.putEngineMaxEmission(EngineType.DIESEL,5d);
        rules.putEngineMaxEmission(EngineType.HYBRID,5d);
        rules.putEngineMaxEmission(EngineType.PETROL,5d);

        System.out.println(rules.getEngineMaxEmission());

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle);

    }
}
