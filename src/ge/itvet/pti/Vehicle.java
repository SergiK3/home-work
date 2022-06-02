package ge.itvet.pti;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Vehicle {
    //ველები
    //vin - ავტომობილის საიდენტიფიკაციო ნომენი (უნიკალური). მიანიჭეთ UUID სტრიქონი.
    //engine - ძრავი.
    //seats - რამდენი დასაჯდომი ადგილი აქვს.
    //brakingEfficiency - დამუხრუჭების ეფექტურობა პროცენტებში.

    private final UUID uuid = UUID.randomUUID();
    private final Engine engine;
    private final int seats;
    private final int brakingEfficiency;
    private final static Random RANDOM = new Random();


    //არასტატიკური ინიციალიზაციის ბლოკი.
    //ძრავს მიანიჭეთ მნიშვნელობა;
    //seats - მიანიჭეთ შემთხვევითი რიცხვი (Random) 2-დან 10-მდე შუალდედში; თუ ძრავის მოცულობა <=2200 მაშინ მიანიჭეთ 2-დან 5-მდე შუალედში მნიშვნელობა
    //brakingEfficiency - მიანიჭეთ შემთხვევითი რიცხვი (Random) 0-დან 100-მდე შუალდედში.

    {
        this.engine = new Engine();

        if (engine.getType() == EngineType.ELECTRIC) {
            this.seats = RANDOM.nextInt(9) + 2;
        } else if (engine.getVolumeInCC() <= 2200) {
            this.seats = RANDOM.nextInt(4) + 2;
        } else {
            this.seats = RANDOM.nextInt(9) + 2;
        }
        this.brakingEfficiency = RANDOM.nextInt(100);
    }

    public UUID getUuid() {
        return uuid;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public int getBrakingEfficiency() {
        return brakingEfficiency;
    }

    public boolean isMinivan() {
        return seats > 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return seats == vehicle.seats && brakingEfficiency == vehicle.brakingEfficiency && uuid.equals(vehicle.uuid) && engine.equals(vehicle.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, engine, seats, brakingEfficiency);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "uuid=" + uuid +
                ", engine=" + engine +
                ", seats=" + seats +
                ", brakingEfficiency=" + brakingEfficiency +
                '}';
    }
}
