import javax.swing.*;

public class GCD {
	
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Give me a number: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Give me a second number: "));
		int c=0;
		
		if(a > b)
			c = b;
		else
			c = a;
		while((a % c != 0)||(b % c != 0)){
			c-1;
		}
		System.out.println("The GCD for "+a+" and "+b+" is: "+c);
	}

}
