import java.util.Scanner;

public class ReverseIntegerNumber {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :: ");
		int num = scan.nextInt();
		int rev = 0;
		int rem;
		while(num!=0) {
			rem = num%10;
			rev = rev*10+ rem;  //0=0*1+5=5
			num= num/10;
			
		}
		System.out.println(rev);
	}
	
	
	
	
	
	
}


