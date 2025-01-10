package main;

public class Food extends Entity{

    Food(float _x, float _y) {
        super(_x, _y, 10, 10);
    }

    public void draw(){
        Main.app.fill(175,125,0);
        Main.app.ellipse(x,y,w,h);
    }

    public void move(){

    }
}
