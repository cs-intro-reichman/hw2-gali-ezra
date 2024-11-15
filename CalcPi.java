// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   	int number=Integer.parseInt(args[0]);
	   	double sum=0;
	   	boolean plus=true;
		int i=1;
	   	for(int j=1;j<=number;j++)
		{
				if (plus)
				{
					sum += (1.0/i);
					plus=false;
				}
				else
				{
					sum -= (1.0/i);
					plus=true;
				}
		i+=2;
		}
		

	   double CalcPi = sum*4;
	   System.out.println("pi according to Java: "+ Math.PI);
	   System.out.println("pi, approximated: "+CalcPi );

	}
}
