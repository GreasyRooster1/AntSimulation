package main;

import static processing.core.PApplet.append;

public class AntHill extends Entity {
    public Team team;
    public Ant[] ants = {};
    public int countInside=0;
    public int countOutside=0;

    AntHill(float _x,float _y,Team _team){
        super(_x,_y,50,50);
        team = _team;
        addAnts(50);
    }

    public void addAnts(int count){
        for(int i=0;i<count;i++){
            ants = (Ant[]) append(ants,new Ant(x,y,team));
        }
    }
    public void update(){
        move();
        draw();
        updateAnts();

    }
    public void draw(){
        Main.app.fill(team.getColor());
        Main.app.ellipse(x,y,w,h);
    }
    public void updateAnts(){
        countInside=0;
        countOutside=0;
        for(Ant a : ants){
            if(a.inside) {
                countInside++;
                continue;
            }
            countOutside++;
            a.update();
        }
    }
}
