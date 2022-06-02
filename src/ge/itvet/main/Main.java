package ge.itvet.main;

import ge.itvet.pti.EngineType;

public class Main {
    public static void main(String[] args) {

        EngineType hybrid = EngineType.ELECTRIC;
        System.out.println(hybrid.hasEmission());
    }
}
