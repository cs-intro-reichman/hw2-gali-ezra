// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String string = args[0];
            String upperCaseString= string.toUpperCase();
            int number = Integer.parseInt(args[1]);
            String letters = "AEFHXLMNSORI";
            
            for(int i=0;i<string.length(); i++)
            {
                if (letters.indexOf(upperCaseString.charAt(i))!= -1)
                {
                        System.out.println("Give me an " + upperCaseString.charAt(i)+ ": "+ upperCaseString.charAt(i)+"!");
                }
                else
                {
                        System.out.println("Give me a  " + upperCaseString.charAt(i)+ ": "+ upperCaseString.charAt(i)+"!");
                }
            }
            System.out.println("What does that spell?");
            for (int i=0; i<number; i++)
            {
                System.out.println(upperCaseString + "!!!");
            }
        }
}
