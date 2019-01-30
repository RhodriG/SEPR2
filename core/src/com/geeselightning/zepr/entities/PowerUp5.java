package com.geeselightning.zepr.entities;

import com.badlogic.gdx.graphics.Texture;
import com.geeselightning.zepr.Constant;
import com.geeselightning.zepr.levels.Level;

public class PowerUp5 extends PowerUp {

    public float timeRemaining = Constant.SPEEDUPTIME;

    public PowerUp5(Level currentLevel) {
        super(2, new Texture("speed.png"), currentLevel);
    }

    @Override
    public void activate() {
        super.activate();
        super.player.attackDamage += 10;
        this.getTexture().dispose();
    }

    @Override
    public void deactivate() {
        super.deactivate();
        super.player.attackDamage -= 10;
    }

    @Override
    public void update(float delta) {
        if (active) {
            timeRemaining -= delta;
        }
        if (timeRemaining < 0) {
            deactivate();
        }
    }
}
