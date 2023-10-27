package com.questland.filter.game.stages;

import com.questland.filter.game.Player;

public class StageTwo extends Stage {
    public StageTwo(Player player, String localization) {
        super(player, localization);
        isEnd = false;
    }

    @Override
    public String getText() {
        if (localization.equals("ukr")) {
            return "Стадія 2";
        }
        return "Stage 2";
    }
}
