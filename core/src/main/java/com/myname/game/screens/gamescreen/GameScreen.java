package com.myname.game.screens.gamescreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.myname.game.screens.gamescreen.physic.PhysicWorld;
import com.myname.game.screens.gamescreen.tools.MapCamManager;

public class GameScreen implements Screen {

    private MapCamManager manager;
    private PhysicWorld physicWorld;

    private AssetManager assetManager;

    private SpriteBatch batch;

    public GameScreen(AssetManager assetManager)
    {
        this.assetManager = assetManager;
        batch = new SpriteBatch();

        manager = new MapCamManager(assetManager,batch);
        physicWorld = new PhysicWorld(manager);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        ScreenUtils.clear(Color.GRAY);

        manager.render(delta);
        physicWorld.render(delta);

        batch.setProjectionMatrix(manager.getCamera().combined);
        batch.begin();

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
        manager.getViewport().update(width, height, true);
    }



    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}
}
