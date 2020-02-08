package domain;

import java.util.regex.Pattern;

public class PlayerName {
    static final int DEFAULT_PLAYER_NAME_MAX_SIZE = 3;

    public PlayerName(String name) {
        if(!Pattern.matches("^[a-zA-Z]{3}", name)) {
            throw new IllegalArgumentException("이름제한: 영문 " + DEFAULT_PLAYER_NAME_MAX_SIZE + "자");
        }
    }
}
