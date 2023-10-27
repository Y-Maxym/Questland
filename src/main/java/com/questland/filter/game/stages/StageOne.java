package com.questland.filter.game.stages;

import com.questland.filter.game.Player;

import java.util.HashMap;
import java.util.Map;

public class StageOne extends Stage {
    public StageOne(Player player, String localization) {
        super(player, localization);
        isEnd = false;
        stages = new HashMap<>() {{
            put("Наліво", new StageTwo(player, localization));
            put("Направо", new StageThree(player, localization));
        }};
    }

    @Override
    public String getText() {
        if (localization.equals("ukr")) {
            return "Ти з'явився на острові";
        }
        return "You are born";
    }
}
