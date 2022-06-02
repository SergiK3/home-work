package ge.itvet.pti;

import java.util.Objects;
import java.util.Random;

public class Engine {
    //ველები
    //type - EngineType-ს ტიპის
    //volumeInCC - ძრავის მოცულობა კუბურ სანტიმეტრებში. - მთელი რიცხვი.
    //emission - მავნე აირების გამონაბოლქვი. მიანიჭეთ შემთხვევითი(random) რიცხვი, 0.1-დან 10.0-მდე შაულედში.

    private final EngineType type;
    private final Integer volumeInCC;
    private final Double emission;
    private final static Random random;

    static {
        random = new Random();
    }

    public Engine () {
        this(EngineType.values()[(int) (Math.random() * EngineType.values().length)]);
    }

    public Engine(EngineType type) {
        this.type = type;
        if(this.type.hasEmission() == true) {
            this.emission = random.nextInt((100) + 1) / 10d;
            this.volumeInCC = random.nextInt(6000) + 1000;
        } else {
            this.emission = null;
            this.volumeInCC = null;
        }
    }

    public EngineType getType() {
        return type;
    }

    public Integer getVolumeInCC() {
        return volumeInCC;
    }

    public Double getEmission() {
        return emission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return type == engine.type && volumeInCC.equals(engine.volumeInCC) && emission.equals(engine.emission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, volumeInCC, emission);
    }
}
