package com.myname.game.screens.gamescreen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.myname.game.screens.gamescreen.tools.MapCamManager;

public class GameScreen implements Screen {

    private MapCamManager manager;

    public GameScreen(AssetManager assetManager)
    {
        manager = new MapCamManager(assetManager);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void resize(int width, int height) {

    }






    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}
}
