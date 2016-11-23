package MegamanUN;
import java.awt.*;

public class Player extends Unit implements Runnable {
    private int topY;
    private int botY;
    private int leftX;
    private int rightX;
    
    public Player(int x,int y,int life,int damage){
        super(x,y,life,damage);    
        this.setWidth(60);
        this.setHeight(100);
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.CYAN);
        graphics.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
    
    public boolean enemy(){
        return false;
    }
    
    public int getTopY(){
        this.topY = this.getY() + (this.getHeight() / 2);
        return this.topY;
    }

    public int getBotY(){
        this.botY = this.getY() - (this.getHeight() / 2);
        return this.botY;
    }
    
    public int getRightX(){
        this.rightX = this.getX() + (this.getWidth() / 2);
        return this.rightX;
    }
    
    public int getLeftX(){               
        this.leftX = this.getX() - (this.getWidth() / 2);
        return this.leftX;
    }
    
    public void run(){ }
}
