import javax.swing.JFrame;

public class Main {
    
    public Main() {
         frame = new JFrame();
        Gamepanel gamepanel = new Gamepanel();
        
        frame.add(gamepanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SnakenFruit");
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);     
        
    }
    public static void main(String[] args) {
        new Main();
    }
}

