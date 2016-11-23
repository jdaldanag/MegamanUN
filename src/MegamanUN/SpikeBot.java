package MegamanUN;
import java.awt.*;

public class SpikeBot extends Unit implements Runnable {
    
    public SpikeBot(int x,int y,int life,int damage){
        super(x,y,life,damage);
        this.setHeight(50);
        this.setWidth(80);
    }
    
    public void run(){
        while(true){
            for(int i = 0; i < 160; i++){
                try {
                    this.wait();
                } catch(Exception e){ }
                this.moveX(1);
            }
            for(int i = 0; i < 160; i++){
                try {
                    this.wait();
                } catch(Exception e){ }
                this.moveX(-1);
            }
        }
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
    public boolean enemy(){
        return true;
    }
}
