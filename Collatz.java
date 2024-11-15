// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    
		int number= Integer.parseInt(args[0]);
		String mode= args[1];
		int result;
		int count=0;


		for (int i=1; i<=number;i++)
		{
			result=i;
			count=1;
			while (result!=1 || i==1)
			{
				if(mode.charAt(0)=='v')
				{
					System.out.print(result+ " ");
				}
			
				if (result%2==0)
				{
					result=result/2;
					count++;
				}
				else
				{
					result=(result*3)+1;
					count++;
				}
				if (result==1)
				{
					if(mode.charAt(0)=='v')	
						{
							System.out.print(result+ " ");
						}
					break;
				}
				}

				if(mode.charAt(0)=='v')	
				{
					System.out.println("(" + count + ")");
				
				}

		}
		
			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");

		
	}	
}

