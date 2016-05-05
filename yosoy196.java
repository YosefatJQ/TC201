import javax.swing.*;

public class yosoy196 {
	
	int low, up, p=0, nL=0, L=0;
		
	public yosoy196(int a, int z){
		this.low=a;
		this.up=z;
	}

	void operations(){
		String palindromo="";
		String invertido="";
		long p1, p2, sum, j;
		
		System.out.println("Results:\n");
		System.out.println("Search range: "+ low + " to " + up);
		
		for(int i=low; i<=up; i++){
			palindromo= ""+i;
			invertido= new StringBuilder(palindromo).reverse().toString();
		
			if(palindromo.equals(invertido)){
			p++;
			continue;
			}
		
			for(j=0; j<30; j++){
				p1=Long.parseLong(palindromo);
				p2=Long.parseLong(invertido);
				sum=p1+p2;
				palindromo="" +sum;
				invertido= new StringBuilder(palindromo).reverse().toString();
			
				if(palindromo.equals(invertido)){
				nL++;
				break;
				}
			}
		
			if(j==30){
				L++;
			}
		}
		
		System.out.println();
		System.out.println("Lycherel numbers found: "+ L);
		System.out.println("Non-Lycherels found: " + L);
		System.out.println("Natural Palindromes found: " + p);
		
	}
	
	public static void main(String[] args){
		int low= Integer.parseInt(JOptionPane.showInputDialog("Give me the lower bound")),
			up= Integer.parseInt(JOptionPane.showInputDialog("Give me the upper bound"));
			yosoy196 r= new yosoy196(low,up);
			r.operations();
				
	}
}
