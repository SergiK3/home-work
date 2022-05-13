package ge.itvet.security;

public enum BuildingType {
    RESIDENTIAL("საცხოვრებელი"),
    EDUCATIONAL("სასწავლები"),
    INSTITUTIONAL("ინსტიტუციური"),
    INDUSTRIAL("ინდუსტრიული");

    public final String geoName;


    BuildingType(String geoName) {
        this.geoName = geoName;
    }


}
