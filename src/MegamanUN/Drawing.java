package MegamanUN;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Drawing extends JPanel implements Runnable {
    private Map level;

    public Drawing(Map level) {
        super.setBackground(Color.WHITE);
        this.level = level;
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.level.draw(graphics);
    }
    
    public void run(){
        this.level.run();
        while(true){
            this.notifyAll();
            this.level.gravity();
            this.repaint();            
            try {
                this.wait(40);
            } catch (Exception ex) { }
        }
    }
}