package MegamanUN;
import java.awt.*;

public class Block extends Alpha {
    
    public Block(int x,int y){
        super(x,y);
        this.setHeigh(80);
        this.setWidth(80);
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.LIGHT_GRAY);
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
