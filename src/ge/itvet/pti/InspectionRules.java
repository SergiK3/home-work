package ge.itvet.pti;

import java.util.Map;
import java.util.Random;

public class InspectionRules {
//ველები

//brakingEfficiencyMinRequirement - დამუხრუჭების დასაშვები ეფექტურობა (ქვედა ზღვარი პროცენტებში)
//minivanEmissionImmunity - მინივენების დასაშვები მავნე აირების გამონაბოლქვი, რომელიც აღემატება შეაბასმისი ძრავის დასაშვები მავნე აირების გამონაბოლქვს minivanEmissionImmunity-ით. მიანიჭეთ შემთხვევითი(random) რიცხვი, 0.5-დან 2.0-მდე შაულედში.
//შენიშვნა: petrolEngineMaxEmission,dieselEngineMaxEmission,hybridEngineMaxEmission- ის ნაცვლად შეგიძლიათ გამოიყენოთ მხოლოდ ერთი Map<EngineType,Double> ტიპის ველი engineMaxEmission
//
//მეთოდები
//getter, setter-ები
//toString

    private final static Random RANDOM = new Random();
    private final Map<EngineType,Double> engineMaxEmission;
    private final int brakingEfficiencyMinRequirement;
    private final double minivanEmissionImmunity = RANDOM.nextInt((16) + 5) / 10d;

    public InspectionRules(Map<EngineType, Double> engineMaxEmission, int brakingEfficiencyMinRequirement) {
        this.engineMaxEmission = engineMaxEmission;
        this.brakingEfficiencyMinRequirement = brakingEfficiencyMinRequirement;
    }

    public void putEngineMaxEmission(EngineType type,Double maxEmission) {
        if (!(type.hasEmission())) {
            throw new IllegalArgumentException("Cant put Electric Here");
        }
        this.engineMaxEmission.put(type,maxEmission);
    }

    public Map<EngineType, Double> getEngineMaxEmission() {
        return engineMaxEmission;
    }

    public int getBrakingEfficiencyMinRequirement() {
        return brakingEfficiencyMinRequirement;
    }

    public double getMinivanEmissionImmunity() {
        return minivanEmissionImmunity;
    }

    @Override
    public String toString() {
        return "InspectionRules{" +
                "engineMaxEmission=" + engineMaxEmission +
                ", brakingEfficiencyMinRequirement=" + brakingEfficiencyMinRequirement +
                ", minivanEmissionImmunity=" + minivanEmissionImmunity +
                '}';
    }
}
