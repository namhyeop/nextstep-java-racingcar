package racing;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public int getCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return getNumberInput();
    }

    public int getRetryCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return getNumberInput();
    }

    private int getNumberInput() {
        return scanner.nextInt();
    }
}
