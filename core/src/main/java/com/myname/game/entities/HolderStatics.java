package com.myname.game.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.objects.TiledMapTileMapObject;
import com.badlogic.gdx.utils.Array;

public class HolderStatics {

    private Array<StaticEntity> statics;

    public HolderStatics(TiledMap map)
    {
        statics = new Array<>();
        setStatics(map,"Objects");
    }

    private void setStatics(TiledMap map,String mapLayer)
    {
        MapLayer layer = map.getLayers().get(mapLayer);

        for(TiledMapTileMapObject mapObject : layer.getObjects().getByType(TiledMapTileMapObject.class))
        {
            StaticEntity staticEntity = new StaticEntity(mapObject);
            statics.add(staticEntity);
        }
    }

    public void draw(SpriteBatch batch)
    {
        for(StaticEntity entity : statics)
        {
            entity.draw(batch);
        }
    }

}
