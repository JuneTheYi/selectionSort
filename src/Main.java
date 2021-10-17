import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(1500, 800);
    }

    public void setup() {

    }

    public void draw() {
        float x = random(25,50);
        ellipse(300, 300, 60, 60);
        line(100, 50, 600, 50);
        rect(x, 50, 75, 550);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
