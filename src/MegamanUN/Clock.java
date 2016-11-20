package MegamanUN;

public class Clock implements Runnable {
    private int minute;
    private int second;
    
    public Clock (){
        this.minute = 0;
        this.second = 0;
    }
    
    private void minuteUp(){
        this.second = 0;
        this.minute ++;
    }
    
    public void run(){
        while(this.second<60){
            try{
                this.wait(1000);
            }
            catch(InterruptedException x){            
            }
            this.second ++;
        }
        this.minuteUp();
    }
    
}
