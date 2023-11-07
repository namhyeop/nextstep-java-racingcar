package study.carracing.ui;

import java.util.Scanner;

public class ScannerInputView implements InputView {

    private static final Scanner sc = new Scanner(System.in);

    @Override
    public int inputCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return sc.nextInt();
    }

    @Override
    public int inputTryCount() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return sc.nextInt();
    }
}
