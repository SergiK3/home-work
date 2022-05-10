package ge.itvet.pti;

public enum EngineType {
    PETROL,
    DIESEL,
    ELECTRIC,
    HYBRID;

    public boolean hasEmission() {
        if (this == ELECTRIC) {
            return false;
        }
        return true;
    }

}