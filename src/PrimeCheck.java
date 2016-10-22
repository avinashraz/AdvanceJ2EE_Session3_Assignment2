import java.util.Scanner;

public class PrimeCheck {
Scanner scanner = new Scanner(System.in);
public boolean isPrimeNumber(){
	int i = scanner.nextInt();
	for(int j=2;j<=i/2;j++){
	if(i%j==0){
		
	return false;
	//not a prime number
}
	}
	
	return true;
	// its a prime number
	}
public static void main(String[] args){
	PrimeCheck pc = new PrimeCheck();
	System.out.println("Enter the number: ");
	System.out.println();
	System.out.println("The number is : "+pc.isPrimeNumber());
	System.out.println();
	System.out.println("Note:");
	System.out.println("true - Its a Prime Number");
	System.out.println("false - Its not a Prime Number");
}
}