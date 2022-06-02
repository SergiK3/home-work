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

    private Map<EngineType,Double> engineMaxEmission;
    private int brakingEfficiencyMinRequirement;
    private int minivanEmissionImmunity = RANDOM.nextInt();
    private final static Random RANDOM = new Random();



    public Map<EngineType, Double> getEngineMaxEmission() {
        return engineMaxEmission;
    }

    public void setEngineMaxEmission(Map<EngineType, Double> engineMaxEmission) {
        this.engineMaxEmission = engineMaxEmission;
    }

    public int getBrakingEfficiencyMinRequirement() {
        return brakingEfficiencyMinRequirement;
    }

    public void setBrakingEfficiencyMinRequirement(int brakingEfficiencyMinRequirement) {
        this.brakingEfficiencyMinRequirement = brakingEfficiencyMinRequirement;
    }

    public int getMinivanEmissionImmunity() {
        return minivanEmissionImmunity;
    }

    public void setMinivanEmissionImmunity(int minivanEmissionImmunity) {
        this.minivanEmissionImmunity = minivanEmissionImmunity;
    }
}
