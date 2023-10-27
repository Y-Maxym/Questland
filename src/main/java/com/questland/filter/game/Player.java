package com.questland.filter.game;

import com.questland.filter.game.stages.Stage;
import com.questland.filter.game.stages.StageOne;

public class Player {

    private Stage stage;

    public Player(String localization) {
        stage = new StageOne(this, localization);
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
