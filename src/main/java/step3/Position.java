package step3;

import java.util.Objects;

public class Position {

    private int position;

    public Position(int position) {
        if(position < 0) {
            throw new IllegalArgumentException("0 미만의 정수를 넣을 수 없습니다.");
        }
        this.position = position;
    }

    public void advancedPosition() {
        this.position ++;
    }

    public int currentPosition() {
        return this.position;
    }

    public String compare(Position previous) {
        if(this.position > previous.currentPosition()) {
            return "bigger";
        }
        if(this.position > previous.currentPosition()) {
            return "equals";
        }
        return "small";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
