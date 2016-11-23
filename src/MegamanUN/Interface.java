package MegamanUN;
import java.awt.*;
import javax.swing.*;

public class Interface {
    private JFrame frame;
    private Map level;
    
    public Interface(Map map){
        this.level = map; 
    }
    
    public void run(){
        frame = new JFrame("Megaman Prototype");
        frame.setPreferredSize(new Dimension(560,560));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        Drawing draw = new Drawing(this.level); 
        container.add(draw);
        draw.addKeyListener(new Keyboard(draw,this.level));    
    }    
}
