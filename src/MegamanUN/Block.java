package MegamanUN;
import java.awt.*;

public class Block extends Alpha {
    
    public Block(int x,int y,int width,int height){
        super(x,y,width,height);
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
