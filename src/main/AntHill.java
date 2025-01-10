package main;

public class AntHill extends Entity {
    public Team team;
    public Ant[] ant;
    public int countInside=0;
    public int countOutside=0;

    AntHill(float _x,float _y,Team _team){
        super(_x,_y,50,50);
        team = _team;
    }
    public void update(){
        move();
        updateAnts();
        draw();

    }
    public void draw(){
        Main.app.fill(team.getColor());
        Main.app.ellipse(x,y,w,h);
    }
    public void updateAnts(){
        countInside=0;
        countOutside=0;
        for(Ant a : ant){
            if(a.inside) {
                countInside++;
                continue;
            }
            countOutside++;
            a.update();
        }
    }
}
