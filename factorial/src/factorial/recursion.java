package factorial;

public class recursion {
int p;
	public int factorial(int x){
	if(x==0){
		return 1;
	}
	
	p=x*factorial(x-1);
	return p;
}
}
