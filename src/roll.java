import javax.swing.JOptionPane;

public class roll {
public static void main(String[] args) {

	String slip = JOptionPane.showInputDialog(null, "How tall is u in inches bro");
	int j = Integer.parseInt(slip);
	if(j>47) { 
	JOptionPane.showMessageDialog(null, "OK you can ride, try not to fall out!");
	
	}
	else {
		JOptionPane.showMessageDialog(null, "No, bro!  U cannae ride this here contraption it might be dangerobulous n such!");
	
	}
	
	
	
	
	
	
	
	
	
}
}
