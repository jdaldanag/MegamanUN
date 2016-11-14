package MegamanUN;
import java.awt.*;

public class Bullet extends Alpha {
    private int damage;
    private int direction;
    
    public Bullet(int x, int y, int width, int height, int damage, int direction){
        super(x,y,width,height);
        this.damage = damage;
        this.direction = direction;
    }
    
    public void movement(){
        this.moveX(direction);
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
