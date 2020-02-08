package output;

import domain.BollingGame;

public class ConsoleBollingScorePresenter implements BollingScorePresentable {

    @Override
    public void show(final BollingGame bollingGame) {
        System.out.println("some result about bolling game");
    }
}
