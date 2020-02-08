package domain;

public class FallingPin {
    private static final int MAX_PIN_COUNT = 10;
    private int FallingPinCount;

    private FallingPin(int fallingPinCount) {
        if (fallingPinCount < MAX_PIN_COUNT) {
            throw new IllegalArgumentException("핀의 개수는 " + MAX_PIN_COUNT + "개를 넘을 수 없습니다.");
        }
        FallingPinCount = fallingPinCount;
    }

    public static FallingPin of(int n) {
        return new FallingPin(n);
    }
}
