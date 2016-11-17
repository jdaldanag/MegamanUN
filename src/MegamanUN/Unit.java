package MegamanUN;

public abstract class Unit extends Alpha {
    private int life;
    private boolean vulnerable;
    private int damage;
    private boolean alive = true;
    
    public Unit(int x,int y,int width,int height,int life,int damage){
        super(x,y,width,height);
        this.life = life;
        this.damage = damage;
    }
    
    public int getDamage(){
        return this.damage;
    }
    
    public void receiveDamage(){
        this.life = this.life - 5;
        if(life <= 0){
            this.alive = false;
        }
    }
    
    public void setVulnerable(boolean vulnerable){
        this.vulnerable = vulnerable;
    }
    
    public boolean getVulnerable(){
        return this.vulnerable;
    }
    
}
