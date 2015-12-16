import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow(){
	 this.setTitle("Temperature Converter");
	 this.setSize(600,600);
	 this.setLocation(100,100);
	 this.setDefaultCloseOperation(
				       EXIT_ON_CLOSE);
    

	 pane = this.getContentPane();
	 pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	 JButton cel = new JButton("toC");
	 b.addActionListener(this);
	 b.setActionCommand("cel");
	 JButton far = new JButton("toF");
	 b2.addActionListener(this);
	 b2.setActionCommand("far");

	 t = new JTextField(10);

	 j = new JLabel("Answer");
	 pane.add(t);
	 pane.add(cel);
	 pane.add(far);
	 pane.add(j);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("Byte")){
	    String s = t.getText();
	    s += "-0101000";
	    j.setText(s);
}


	if(event.equals("NotByte")){
	    j.setText("Fish");
  
	}
    }
}









    
