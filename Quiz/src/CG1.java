
import java.util.Scanner;

public class CG1 {

		  public static void main(String[] args) {
	         Scanner in = new Scanner(System.in);
	            int n = in.nextInt();
	            int m = in.nextInt();
	            printPrime(n);
		        if(m<n){
		            int z=m;
		            	m=n;
		            	n=z;
		        }
		        for (int i=n;i<=m;i++) {
		            if(printPrime(i)){
		                System.out.println(i);
		            }
	            }
	        }
		
            static boolean printPrime(int n) {
        		if(n==2||n==3) return true;
        		if(n%2==0) return false;
        		int i;
        		for(i=3;i<=n/2;i+=2)
        		if(n%i==0) return false;
        		return true;
		                }
		            
		        }
		       
		    
		    
		
	


