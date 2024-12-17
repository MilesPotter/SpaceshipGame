import java.awt.*;

public class fighter1 {

    public String name;
    public Image pic;
    public int xpos;
    public int ypos;
    public int dx = -3;
    public int dy = 1;
    public int width;
    public int height;
    public int isAlive;
    public Rectangle hitbox;


    public fighter1() {
        hitbox = new Rectangle(xpos, ypos, width, height);
    }
    public fighter1(int paramXpos, int paramYpos,
                     int paramDx, int paramDy, int paramWidth, int paramHeight) {
        xpos = paramXpos;
        ypos = paramYpos;
        dx = paramDx;
        dy = paramDy;
        width = paramWidth;
        height = paramHeight;
        hitbox = new Rectangle(xpos, ypos, width, height);


    }
}


