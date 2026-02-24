package com.myname.game.screens.gamescreen.physic;

import static com.myname.game.screens.gamescreen.utils.Constants.*;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;

public class ObjectCreator {

    public enum ShapeType
    {
        Rectangle,
        Circle,
        Polygon
    }

    public static void createBody(BodyDef.BodyType bodyType, World world, Vector2 pos,Vector2 mes, ShapeType shapeType)
    {
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = bodyType;
        bodyDef.position.set(pos.x + mes.x/2,pos.y + mes.y/2);

        Body body = world.createBody(bodyDef);

        Shape shape = null;
        FixtureDef fdef = new FixtureDef();

        switch (shapeType)
        {
            case Circle -> {
                shape = new CircleShape();
                shape.setRadius(mes.x * PPM);

                fdef.shape = shape;
            }
            case Rectangle -> {
                shape = new PolygonShape();
                PolygonShape polygonShape = (PolygonShape) shape;
                polygonShape.setAsBox(mes.x/2,mes.y/2);

                fdef.shape = polygonShape;
            }
        }

        Fixture fixture = body.createFixture(fdef);

        assert shape != null : "Shape error !";
        shape.dispose();
    }

}
