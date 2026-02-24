package com.myname.game.entities;

import static com.myname.game.screens.gamescreen.utils.Constants.*;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.objects.TiledMapTileMapObject;
import com.badlogic.gdx.math.Rectangle;

public class StaticEntity extends GameEntity{

    private TextureRegion texture;
    private Rectangle rectangle;

    public StaticEntity(TiledMapTileMapObject mapObject)
    {
        rectangle = new Rectangle();

        rectangle.x = mapObject.getX() * PPM;
        rectangle.y = mapObject.getY() * PPM;
        rectangle.width = mapObject.getTextureRegion().getRegionWidth() * PPM;
        rectangle.height = mapObject.getTextureRegion().getRegionHeight() * PPM;

        texture = mapObject.getTextureRegion();
    }

    public void draw(SpriteBatch batch)
    {
        batch.draw(texture,rectangle.x,rectangle.y,rectangle.width,rectangle.height);
    }

}
