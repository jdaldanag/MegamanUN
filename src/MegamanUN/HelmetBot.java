package MegamanUN;
import java.awt.*;

public class HelmetBot extends Unit implements Runnable {
    
    public HelmetBot(int x,int y,int width,int height,int life,int damage){
        super(x,y,width,height,life,damage);    
    }
    
    public void shoot(){
        Bullet fire = new Bullet(this.getX() - 1,this.getY(), 40, 50, this.getDamage(), -1);
    }
    
    public void shield(){
        if(this.getVulnerable()){
            super.setVulnerable(false);
        }
        else {
            super.setVulnerable(true);
        }
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
    public void run(){
        this.shoot();
        try{
            this.wait(1000);
        }
        catch(InterruptedException x){            
        }
        this.shield();
        try{
            this.wait(3000);
        }
        catch(InterruptedException x){            
        }
        this.shield();
        try{
            this.wait(1000);
        }
        catch(InterruptedException x){            
        }
    }
}
