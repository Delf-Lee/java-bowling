import domain.*;
import input.BollingGameInput;
import input.ConsoleBollingGameInput;
import output.BollingScorePresentable;
import output.ConsoleBollingScorePresenter;

import java.util.Collections;

public class Application {
    private static final int DEFAULT_BOLLING_MAX_FRAME = 10;

    private static final BollingGameInput bollingInput = new ConsoleBollingGameInput();
    private static final BollingScorePresentable bollingScorePresenter = new ConsoleBollingScorePresenter();

    public static void main(String[] args) {
        Player player = new Player(bollingInput.getPlayerName());
        Players playerList = new Players(Collections.singletonList(player)); // 더미 값
        BollingGame bollingGame = new BollingGame(DEFAULT_BOLLING_MAX_FRAME, playerList);

        while (bollingGame.hasNext()) {
            Player thisTurnPlayer = bollingGame.nextPlayer();
            FallingPin fallingPinCount = bollingInput.getFallingPint(bollingGame.nowFrameCount()); // 더미 값
            thisTurnPlayer.bowl(fallingPinCount);
            bollingGame.printScore(bollingScorePresenter);
        }
    }
}
