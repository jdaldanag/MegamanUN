package MegamanUN;
import java.awt.*;

public class Bullet extends Alpha {
    private int damage;
    private int direction;
    
    public Bullet(int x, int y, int damage, int direction){
        super(x,y);
        this.damage = damage;
        this.direction = direction;
        this.setHeight(40);
        this.setWidth(40);
    }
    
    public void movement(){
        this.moveX(direction * 2);
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
    public boolean enemy(){
        return false;
    }
}
