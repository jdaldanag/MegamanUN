package MegamanUN;
import java.awt.*;

public class Player extends Unit {
    
    public Player(int x,int y,int width,int height,int life,int damage){
        super(x,y,width,height,life,damage);    
    }
    
    public void jump(){
        super.moveY(1);
    }
    
    public void shoot(){
        Bullet fire = new Bullet(this.getX() - 1, this.getY(), 40, 50, this.getDamage(), -1);
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
}
