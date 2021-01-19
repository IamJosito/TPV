package tpv;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

public class button extends JButton{
    
    protected void myButton(){
        
        Color color1 = new Color(60,56,58);
        Color color2 = new Color(229,229,229);
        
        this.setBackground(color1);
        this.setForeground(color2);
        
        this.setSize(new Dimension(210,80));
        
        
    }
    
    
}
