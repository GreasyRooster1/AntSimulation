package main;

public class AntHill extends Entity {
    public Team team;
    AntHill(float _x,float _y,Team _team){
        super(_x,_y,50,50);
        team = _team;
    }
    public void draw(){
        Main.app.fill(team.getColor());
        Main.app.ellipse(x,y,w,h);
    }
    public void move(){

    }
}
