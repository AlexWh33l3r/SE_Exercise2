package de.hsaalen;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeApplication extends JFrame {

    public SnakeApplication() {
        
        initUI();
    }
    
    private void initUI()
    {
        
        add(new GamePanel());
               
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
            JFrame ex = new SnakeApplication();
            ex.setVisible(true);
        });
    }
}
