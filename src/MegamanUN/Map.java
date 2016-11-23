package MegamanUN;
import java.awt.*;
import java.util.*;

public class Map {
    private int width;
    private int height;
    private Alpha[][] grid;
    private Player player;
    //private Clock timer;
    private ArrayList<Unit> units;
    
    public Map(int width, int height,Player player){
        this.width = width;
        this.height = height;
        this.player = player;
        //this.timer = timer;
        units = new ArrayList<Unit>();
    }
    
    public void add(Alpha object){
        grid[object.getGridY()][object.getGridX()] = object;
        if(object.enemy()){
            units.add((Unit)object);
        }
    }
       
    public void jump(){
        if(!this.collisionUp()){
            this.player.moveY(-2);
        }
    }
    
    public void shoot(){
        Bullet fire = new Bullet(this.player.getX() + (this.player.getWidth()/2), this.player.getY(), this.player.getDamage(), 1);
    }
    
    public boolean collisionRight(){
        try {
            if(grid[this.player.getTopY()/80][(this.player.getRightX() + 1)/80].Occupied()||grid[this.player.getBotY()/80][(this.player.getRightX() + 1)/80].Occupied()){
                return true;
            }
        } catch(Exception e){ }
        return false;
    }
    
    public boolean collisionUp(){
        try {
            if(grid[(this.player.getTopY() - 1)/80][this.player.getLeftX()/80].Occupied()||grid[(this.player.getTopY() - 1)/80][this.player.getRightX()/80].Occupied()){
                return true;
            }
        } catch(Exception e){ }
        return false;
    }
    
    public boolean collisionDown(){
        try {
            if(grid[(this.player.getBotY() + 1)/80][this.player.getLeftX()/80].Occupied()||grid[(this.player.getBotY() + 1)/80][this.player.getRightX()/80].Occupied()){
                return true;
            }
        } catch(Exception e){ }
        return false;
    }
    
    public void moveRight(){
        if(!this.collisionRight()){
            this.player.moveX(2);
            for(int i = 0; i < this.height; i++){
                for(int j = 0; j < this.width; j++){
                    try {
                        grid[i][j].moveX(-2);
                    } catch(Exception e){ }
                }
            }
        }
    }
    
    public void gravity(){
        if(!this.collisionDown()){
            this.player.moveY(1);
        }
    }
    
    public void run(){
        for(Unit x : units){
            x.run();
        }
        //this.timer.run();
    }
    
    public void draw(Graphics graphics){
        for(int i = 0; i < this.height; i++){
            for(int j = 0; j < this.width; j++){
                try {
                    grid[i][j].draw(graphics);
                }
                catch(Exception e){
                }
            }
        }        
    }
}
