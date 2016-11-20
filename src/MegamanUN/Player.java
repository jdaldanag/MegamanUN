package MegamanUN;
import java.awt.*;

public class Player extends Unit {
    
    public Player(int x,int y,int life,int damage){
        super(x,y,life,damage);    
        this.setWidth(60);
        this.setWidth(90);
    }
    
    public void jump(){
        super.moveY(1);
    }
    
    public void shoot(){
        Bullet fire = new Bullet(this.getX() - 1, this.getY(), this.getDamage(), -1);
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.CYAN);
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
}
