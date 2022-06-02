package ge.itvet.main;

import ge.itvet.pti.Engine;
import ge.itvet.pti.EngineType;

public class Main {
    public static void main(String[] args) {


        Engine engine = new Engine(EngineType.DIESEL);

        System.out.println(engine.toString());

    }
}
