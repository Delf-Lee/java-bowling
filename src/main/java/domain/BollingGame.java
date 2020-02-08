package domain;

import output.BollingScorePresentable;

public class BollingGame {
    public final int MAX_FRAME;

    private final Players players;
    private int frameCount;

    public BollingGame(final int maxFrame, final Players players) {
        this.MAX_FRAME = maxFrame;
        this.players = players;
    }

    public Player nextPlayer() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

    public void printScore(BollingScorePresentable printer) {
        printer.show(this);
    }

    public int nowFrameCount() {
        return frameCount;
    }
}
