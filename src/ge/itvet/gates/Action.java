package ge.itvet.gates;

import java.util.Objects;

public class Action {
    private final int idNum;
    private final EntranceAction action;

    public Action(int idNum,EntranceAction action) {
        this.idNum = idNum;
        this.action = action;
    }

    public int getIdNum() {
        return idNum;
    }

    public EntranceAction getAction() {
        return action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action1 = (Action) o;
        return idNum == action1.idNum && action == action1.action;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNum, action);
    }

    @Override
    public String toString() {
        return "Action{" +
                "idNum=" + idNum +
                ", action=" + action +
                '}';
    }
}
