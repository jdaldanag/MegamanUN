package MegamanUN;
import java.awt.*;

public class SpikeBot extends Unit {
    
    public SpikeBot(int x,int y,int life,int damage){
        super(x,y,life,damage);
        this.setHeigh(50);
        this.setWidth(80);
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.RED);
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
}
