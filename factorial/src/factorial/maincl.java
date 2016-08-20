package factorial;
import java.util.Scanner;
public class maincl {
public static void main(String args[]){
	System.out.println("enter the number");
	Scanner bucky=new Scanner(System.in);
	int x=bucky.nextInt();
	int p=1;
	for(int c=1;c<=x;c++){
		p=p*c;
		
	}
	System.out.println(p);
	/*
	recursion recursobj=new recursion();
	recursobj.factorial(x);
	System.out.println(recursobj.p);
*/
}

}
