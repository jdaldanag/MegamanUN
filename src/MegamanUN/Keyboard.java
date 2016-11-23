package MegamanUN;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Keyboard implements KeyListener {
    private Component component;
    private Map level;
    private boolean flag;
    
    public Keyboard(Component component,Map level){
        this.component = component;
        this.level = level;
    }
    
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.level.moveRight();
            this.flag = true;
        }
        this.component.repaint();
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.flag = false;
        }
    }

    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if(this.flag){
                for(int i = 0; i < 100; i++){
                    this.level.jump();
                    this.level.moveRight();
                    this.component.repaint();
                }
            }
            else {
                for(int i = 0; i < 80; i++){
                    this.level.jump();
                    this.component.repaint();
                }
            }    
        } //else if (e.getKeyCode() == KeyEvent.VK_A){
            //this.level.shoot();
        //}
        //this.component.repaint();
    }
}
