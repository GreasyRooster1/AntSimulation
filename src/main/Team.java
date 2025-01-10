package main;

public enum Team {
    Red(255,0,0),
    Green(0,255,0),
    Blue(0,0,255);

    float r,g,b;

    Team(float _r,float _g,float _b) {
        r=_r;
        g=_g;
        b=_b;
    }

    int getColor(){
        return Main.app.color(r,g,b);
    }
}
