package MegamanUN;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(280,430,40,10);
        Map level = new Map(30,7,player);
        SpikeBot enemy2 = new SpikeBot(1480,455,100,5);
        HelmetBot enemy1 = new HelmetBot(1080,210,10,5);
        
        Block x;
        
        level.add(x = new Block(40,520));
        level.add(x = new Block(120,520));
        level.add(x = new Block(200,520));
        level.add(x = new Block(280,520));
        level.add(x = new Block(360,520));
        level.add(x = new Block(440,520));
        level.add(x = new Block(520,520));
        level.add(x = new Block(600,520));
        level.add(x = new Block(680,520));
        level.add(x = new Block(760,520));
        level.add(x = new Block(680,440));
        level.add(x = new Block(760,440));
        
        level.add(x = new Block(1000,280));
        level.add(x = new Block(1080,280));
        level.add(x = new Block(1160,280));
        
        level.add(x = new Block(1320,520));
        level.add(x = new Block(1400,520));
        level.add(x = new Block(1480,520));
        level.add(x = new Block(1560,520));
        level.add(x = new Block(1640,520));
        level.add(x = new Block(1720,520));
        level.add(x = new Block(1800,520));
        level.add(x = new Block(1320,440));
        level.add(x = new Block(1400,440));
        level.add(x = new Block(1720,440));
        level.add(x = new Block(1800,440));
        
        level.add(x = new Block(2120,520));
        level.add(x = new Block(2200,520));
        level.add(x = new Block(2280,520));
        
        
        level.add(enemy2);
        level.add(enemy1);

        //Interface ui = new Interface(level);
        //SwingUtilities.invokeLater(ui);
    }
}
