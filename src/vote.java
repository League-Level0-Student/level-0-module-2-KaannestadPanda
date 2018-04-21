import javax.swing.JOptionPane;

public class vote {
public static void main(String[] args) {
	
	
	String slip = JOptionPane.showInputDialog(null, "HOW OLD");
	int j = Integer.parseInt(slip);
	if(j>17) { 
	JOptionPane.showInputDialog(null, "NEXT PREZ IS ME RIGHT");
	
	}
	else {
		JOptionPane.showMessageDialog(null, "NO ONE CARES BRO");
	
	}
	
	
	
	
	
	
	
	
}
}
