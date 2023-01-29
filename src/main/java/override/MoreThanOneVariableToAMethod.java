package override;

public class MoreThanOneVariableToAMethod {

	public static void main(String[] args) {
		
		ortalama(1,2,3,4,5);
		System.out.println();
		
	}

		// TODO Auto-generated method stub
		
public static void ortalama(double... not) {
	double s=0;
	for(double n: not) {
		s = s + n;
	}
	
}


}
