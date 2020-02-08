package input;

import domain.FallingPin;
import domain.PlayerName;

import java.util.Scanner;

public class ConsoleBollingGameInput implements BollingGameInput {

    private Scanner scanner = new Scanner(System.in);

    public FallingPin getFallingPint(int frameCount) {
        System.out.println(frameCount + "프레임 투구 : ");
        return FallingPin.of(scanner.nextInt());
    }

    public PlayerName getPlayerName() {
        System.out.println("플레이어 이름은(3 english letters)?: ");
        return new PlayerName(scanner.nextLine());
    }
}
