
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class CalculatorPanel extends JPanel
{
    // instance variables - replace the example below with your own
    private Calculator1 calc;
    private JButton oneButton;
    private JButton plusButton;
    private JButton equalsButton;
    private JTextField regArea;

    public CalculatorPanel()
    {
       calc = new Calculator1();
       oneButton = new JButton ("1");
       plusButton = new JButton ("+");
       equalsButton = new JButton ("=");
       oneButton.addActionListener (new ButtonListener());
       plusButton.addActionListener (new ButtonListener());
       regArea = new JTextField(20);
       plusButton.addActionListener (new ButtonListener());
       //equalsButton.addActionListener (new ButtonListener());
       add(oneButton);
       add(plusButton);
       add(equalsButton);
       add(regArea);
    }
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            if(event.getSource() == oneButton)
            {
                
            String temp = regArea.getText();
            temp = temp = "1";
            regArea.setText(temp);
        }
        if(event.getSource() == plusButton)
        {
            System.out.println("You Pressed +");
        }
        

        }
    }
}

