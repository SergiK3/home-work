package ge.itvet.pti;

public enum EngineType {
    PETROL(true),
    DIESEL(true),
    ELECTRIC(false),
    HYBRID(true);

    private final boolean emission;

    EngineType(boolean emission) {
        this.emission = emission;
    }

    public boolean hasEmission() {
        return this.emission;
    }
}
