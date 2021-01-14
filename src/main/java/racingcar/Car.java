package racingcar;

import utils.RandomUtils;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        int randInt = RandomUtils.nextInt(0, 9);
        // move forward
        if (randInt >= 4) {
            position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getPositionString() {
        String positionStr = "";
        for (int i=0; i<position; i++) {
            positionStr += "-";
        }
        return positionStr;
    }
}
