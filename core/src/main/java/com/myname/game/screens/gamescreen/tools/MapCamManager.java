package com.myname.game.screens.gamescreen.tools;

import static com.myname.game.screens.gamescreen.utils.Constants.*;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MapCamManager {

    private TiledMap tiledMap;
    private OrthographicCamera camera;
    private Viewport viewport;

    public MapCamManager(AssetManager manager)
    {
        tiledMap = manager.get("World/world.tmx");
        camera = new OrthographicCamera();
        viewport = new FitViewport(BASIC_SCREEN_WIDTH*PPM,BASIC_SCREEN_HEIGHT*PPM,camera);
    }

    public TiledMap getTiledMap()
    {
        return tiledMap;
    }

}
