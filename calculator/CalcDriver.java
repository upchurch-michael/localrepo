
import javax.swing.JFrame;
public class CalcDriver
{
   public static void main (String[] args)
   {
       JFrame frame = new JFrame ("Calculator");
       frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
       
       frame.add(new CalculatorPanel());
       frame.pack();
       frame.setVisible(true);
    }
       
}
