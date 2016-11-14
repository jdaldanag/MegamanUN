package MegamanUN;
import java.awt.*;

public class SpikeBot extends Unit{
    
    public SpikeBot(int x,int y,int width,int height,int life,int damage){
        super(x,y,width,height,life,damage);    
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
