
import javax.swing.*;


public class SnakeGame extends JFrame{
           SnakeGame()
           {
           add(new Board());
           pack();
           setLocationRelativeTo(null);
            setTitle("Snake Game");
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
   public static void main(String[] args) {
       new SnakeGame().setVisible(true);
    }
    
}
