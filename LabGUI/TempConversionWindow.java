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
	 cel.addActionListener(this);
	 cel.setActionCommand("cel");
	 JButton far = new JButton("toF");
	 far.addActionListener(this);
	 far.setActionCommand("far");

	 t = new JTextField(10);

	 j = new JLabel("Answer");
	 pane.add(t);
	 pane.add(cel);
	 pane.add(far);
	 pane.add(j);
    }
    
     public static double CtoF(double t){
	return t * (9.0/5.0) + 32;
    }

    public static double FtoC(double t){
	return (t - 32.0) * (5.0 / 9.0);
    }


    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("cel")){
	    double n = FtoC(Integer.parseInt(t))
	    String s = t;
	    s += "-0101000";
	    j.setText(s);
}


	if(event.equals("far")){
	    //j.setText("Fish");
  
	}
    }
}









    
