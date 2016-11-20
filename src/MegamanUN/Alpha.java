package MegamanUN;
import java.awt.*;

public abstract class Alpha {
    private int w;
    private int h;
    private int x;
    private int y;
    
    public Alpha(int x,int y){
        this.x = x;
        this.y = y;
    }
       
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getWidth(){
        return this.w;
    }
    
    public void setWidth(int width){
        this.w = width;
    }
    
    public void setHeigh(int heigh){
        this.h = heigh;
    }
    
    public int getHeight(){
        return this.h;
    }
    
    public boolean Occupied(int x,int y){
        if(this.x == x && this.y == y){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void moveX(int mx){
        this.x = this.x + mx;
    }
    
    public void moveY(int my){
        this.y = this.y + my;
    }
        
    public abstract void draw(Graphics graphics);

}