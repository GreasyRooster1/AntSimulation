package main;

public class Ant extends Entity{
    public Team team;
    public boolean inside;

    Ant(float _x, float _y, Team _team) {
        super(_x, _y, 10, 10);
        team = _team;
        inside = false;
    }

    public void draw(){
        Main.app.fill(team.getColor());
        Main.app.ellipse(x,y,w,h);
    }

    public void move(){

    }
}
