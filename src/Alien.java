import java.awt.*;

public class Alien {

    public String name;
    public Image pic;
    public int xpos;
    public int ypos;
    public int dx = 1;
    public int dy = 2;
    public int width;
    public int height;
    public int isAlive;
    public Rectangle hitbox;


    public Alien () {
        hitbox = new Rectangle(xpos, ypos, width, height);
    }

    public Alien (int paramXpos, int paramYpos,
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
