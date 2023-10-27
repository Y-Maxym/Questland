package com.questland.filter.game.stages;

import com.questland.filter.game.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Stage {

    protected Player player;
    protected boolean isEnd;
    protected String localization;
    protected Map<String, Stage> stages;

    public Stage(Player player, String localization) {
        this.localization = localization;
        this.player = player;
    }

    public boolean isEnd() {
        return isEnd;
    }

    abstract public String getText();

    public List<String> getQuestion() {
        return new ArrayList<>(stages.keySet());
    }

    public Stage nextStage(String answer) {
        Stage stage = stages.get(answer);
        player.setStage(stage);
        return stage;
    }
}
