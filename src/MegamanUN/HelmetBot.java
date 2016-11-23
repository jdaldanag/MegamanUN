package MegamanUN;
import java.awt.*;

public class HelmetBot extends Unit implements Runnable {
    
    public HelmetBot(int x,int y,int life,int damage){
        super(x,y,life,damage);
        this.setWidth(60);
        this.setHeight(60);
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
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
    public void run(){
        while (true){
            this.shield();
            for(int i = 0; i < 120; i++){
                try {
                    this.wait();
                } catch(Exception e){ }    
            }        
        }
    }    
    
    public boolean enemy(){
        return true;
    }
}
