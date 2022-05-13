package ge.itvet.security;

import java.util.Arrays;
import java.util.UUID;

//ველები
//name - სახელი;
//identNo - საიდენტიფიკაციო კოდი (სტრიქონი უნიკალურობის განსაზღვრისთვის.)
//
//კონსტრუქტორი
//მხოლოდ პარამეტრიანი კონსტრუქტორი, სადაც gates მიანიჭებთ მნიშვნელობას.
//
//მეთოდები
//getGateByIndex - რომელსაც პარამეტრად გადაეცემა კარის ინდექსი, და დააბრუნებს კარს შესაბამის ინდექსზე.
public class Hospital extends Building {
    private String name;
    private final String identNo;

    public Hospital(Gate[] gates, String name) {
        super(BuildingType.INSTITUTIONAL, gates);
        this.name = name;
        this.identNo = UUID.randomUUID().toString();

    }

    public Gate getGateByIndex(int index) {
        return gates[index];
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", identNo='" + identNo + '\'' +
                ", type=" + type +
                ", gates=" + Arrays.toString(gates) +
                ", amountOfPeopleInTheBuilding=" + gate.getAmountOfPeopleInTheBuilding() +
                '}';
    }
}
