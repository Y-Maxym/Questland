package com.questland.filter.game.stages;

import com.questland.filter.game.Player;

import java.util.HashMap;

public class StageThree extends Stage {
    public StageThree(Player player, String localization) {
        super(player, localization);
        isEnd = false;
    }

    @Override
    public String getText() {
        if (localization.equals("ukr")) {
            return "Стадія 3";
        }
        return "Stage 3";
    }
}
