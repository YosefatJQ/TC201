import javax.swing.JOptionPane;

public class Babylonian {
	
			public static void babylonianmethod(double a){
				double primer = a/2;
				double segundo = a+1;
				while(primer!=segundo){
					double tercer = a / primer;
					segundo = primer;
					primer= (primer+tercer)/2;
				}
			System.out.print("La raiz cuadrada de es: ");
			System.out.println(primer);
			}
	public static void main(String[] args) {
		
				String firstnum = JOptionPane.showInputDialog("Dame un numero:");
				double primer = Double.parseDouble(firstnum);
				babylonianmethod(primer);
			}
		}

