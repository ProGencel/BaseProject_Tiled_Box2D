package com.myname.game.screens.gamescreen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.myname.game.screens.gamescreen.tools.MapCamManager;

public class GameScreen implements Screen {

    private MapCamManager manager;
    private AssetManager assetManager;

    private SpriteBatch batch;

    public GameScreen(AssetManager assetManager)
    {
        manager = new MapCamManager(assetManager);
        batch = new SpriteBatch();
        this.assetManager = assetManager;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        batch.setProjectionMatrix(manager.getCamera().combined);
        batch.begin();

        manager.render(delta);

        batch.end();
    }

    @Override
    public void dispose() {
        assetManager.dispose();
        manager.dispose();
        batch.dispose();
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
