package MegamanUN;
import java.awt.*;

public class HelmetBot extends Unit {
    
    public HelmetBot(int x,int y,int width,int height,int life,int damage){
        super(x,y,width,height,life,damage);    
    }
    
    public void shoot(){
        Bullet fire = new Bullet(this.getX() - 1,this.getY(),this.getWidth(),this.getHeight(),this.getDamage(), -1);
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
