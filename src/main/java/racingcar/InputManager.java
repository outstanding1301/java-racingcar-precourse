package racingcar;

import java.util.Scanner;

public class InputManager {
    private Scanner scanner;

    public InputManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public String[] getNames() {
        System.out.print("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분) > ");
        String[] carNames = scanner.nextLine().split(",");
        System.out.println();

        if (!isNameValid(carNames)) {
            System.out.println("[ERROR] 이름은 5자 이하만 가능합니다.");
            return null;
        }
        return carNames;
    }

    public Integer getTrial() {
        System.out.print("시도할 회수 > ");
        Integer trial;

        try {
            trial = Integer.parseInt(scanner.nextLine());
            System.out.println();
        }
        catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요.");
            return null;
        }

        return trial;
    }

    private boolean isNameValid(String[] names) {
        for (String name : names) {
            if (name.length() > 5) return false;
        }
        return true;
    }
}
