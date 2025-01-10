package main;

import processing.core.PApplet;

public class Main extends PApplet {
    public static Main app;
    public Entity[] entities = {};

    public void settings() {
        size(750, 750);
    }

    public void setup() {
        app =this;
        Entity.addEntity(new AntHill(width/2f, height/2f,Team.Red));
    }

    public void draw(){
        background(64);
        for(Entity e : entities){
            e.update();
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "main.Main" };
        PApplet.main(appletArgs);
    }
}