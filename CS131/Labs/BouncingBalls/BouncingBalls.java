import java.awt.*;
import java.awt.Color;
public class BouncingBalls{
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        Ball[] bs = new Ball[N];
        for (int i = 0; i < N; i++)
            bs[i] = new Ball();
        while(true){
            StdDraw.clear(StdDraw.BLACK);
            for (int i = 0; i < N; i++){
                bs[i].move();
                bs[i].draw();
                if (bs[i].collisionMove(bs, i)) bs[i].draw();
            }
            StdDraw.show(50);
        }
    }
}