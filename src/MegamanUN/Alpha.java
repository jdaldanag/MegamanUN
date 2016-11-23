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
    
    public int getGridX(){
        return this.x / 80;
    }
    
    public int getGridY(){
        return this.y / 80;
    }
    
    public int getWidth(){
        return this.w;
    }
    
    public void setWidth(int width){
        this.w = width;
    }
    
    public void setHeight(int heigh){
        this.h = heigh;
    }
    
    public int getHeight(){
        return this.h;
    }
    
    public boolean Occupied(){
        return true;
    }
    
    public void moveX(int mx){
        this.x = this.x + mx;
    }
    
    public void moveY(int my){
        this.y = this.y + my;
    }
    
    public abstract boolean enemy();
        
    public abstract void draw(Graphics graphics);

}