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
        for(int i=0; i<100; i++) {
            Entity.addEntity(new Food(50+random(-20,20),50+random(-20,20)));
        }
    }

    public void draw(){
        background(64);
        for(Entity e : entities){
            e.update();
        }
    }

    public Food getNearestFood(float x,float y){
        float dist = 999999;
        Food food = null;
        for(Entity e : entities){
            if(e instanceof Food){
                if(dist())
            }
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "main.Main" };
        PApplet.main(appletArgs);
    }
}