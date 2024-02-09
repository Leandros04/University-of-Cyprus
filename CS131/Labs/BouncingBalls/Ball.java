import java.awt.*;
public class Ball {
    private double rx, ry;
    private double vx, vy;
    private double radius;

    private Color color;
    public Ball() {
        rx = ry = 0.5;
        vx = 0.015 - Math.random() * 0.03;
        vy = 0.015 - Math.random() * 0.03;
        radius = 0.01 + Math.random() * 0.01;
        color = new Color((int) (Math.random() * 256),
                (int) (Math.random() * 256),
                (int) (Math.random() * 256));
    }
    public void move() {
        if ((rx + vx > 1.0) || (rx + vx < 0.0)) vx = -vx;
        if ((ry + vy > 1.0) || (ry + vy < 0.0)) vy = -vy;
        rx = rx + vx;
        ry = ry + vy;
    }

    public boolean collisionMove(Ball[] bs, int n){
        boolean collision = false;
        for (int i = 0; i < bs.length; i++){
            if (i != n)
                if (rx == bs[i].rx && ry == bs[i].ry){
                    vx = -vx; vy = -vy; rx = rx + vx; ry = ry + vy;
                    collision = true;
                }
        }
        return collision;
    }
    public void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(rx, ry, radius);
    }
}