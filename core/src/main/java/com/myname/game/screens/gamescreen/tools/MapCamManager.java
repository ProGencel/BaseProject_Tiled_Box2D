package com.myname.game.screens.gamescreen.tools;

import static com.myname.game.screens.gamescreen.utils.Constants.*;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MapCamManager {

    private TiledMap tiledMap;
    private OrthographicCamera camera;
    private Viewport viewport;
    private OrthogonalTiledMapRenderer tiledMapRenderer;

    public MapCamManager(AssetManager manager)
    {
        tiledMap = manager.get("World/world.tmx");
        camera = new OrthographicCamera();
        viewport = new FitViewport(BASIC_SCREEN_WIDTH*PPM,BASIC_SCREEN_HEIGHT*PPM,camera);
        tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap,PPM);
    }

    public void render(float dt)
    {
        tiledMapRenderer.render();

        tiledMapRenderer.setView(camera);

        camera.update();
    }

    public void dispose()
    {
        tiledMapRenderer.dispose();
    }

    public TiledMap getTiledMap()
    {
        return tiledMap;
    }

    public OrthographicCamera getCamera()
    {
        return camera;
    }

}
