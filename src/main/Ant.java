package main;

import static processing.core.PConstants.PI;

public class Ant extends Entity{
    public Team team;
    public boolean inside;
    public float dir = 0;

    Ant(float _x, float _y, Team _team) {
        super(_x, _y, 10, 10);
        team = _team;
        dir = Main.app.random(0,2*PI);
    }

    public void draw(){
        Main.app.fill(team.getColor());
        Main.app.ellipse(x,y,w,h);
    }

    public void move(){

    }

}
