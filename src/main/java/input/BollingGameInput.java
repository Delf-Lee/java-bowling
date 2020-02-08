package input;

import domain.FallingPin;
import domain.PlayerName;

public interface BollingGameInput {
    PlayerName getPlayerName();
    FallingPin getFallingPint(int frameCount);
}
