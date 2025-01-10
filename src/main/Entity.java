package main;

import static processing.core.PApplet.append;

public class Entity {
    public float x,y,w,h;
    Entity(float _x,float _y,float _w,float _h){
        x=_x;
        y=_y;
        w=_w;
        h=_h;
    }
    public void update(){
        draw();
        move();
    }
    public void draw(){
    }
    public void move(){

    }

    public static void addEntity(Entity e){
        Main.app.entities = (Entity[]) append(Main.app.entities,e);
    }
}
