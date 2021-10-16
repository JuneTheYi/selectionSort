import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(1500, 800);
    }

    public void setup() {

    }

    public void draw() {
        ellipse(300, 300, 60, 60);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
