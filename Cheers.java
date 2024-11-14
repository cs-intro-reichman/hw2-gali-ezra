// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String string = args[0];
            int number = Integer.parseInt(args[1]);
            String letters = "AEFHILMNOR";
            
            for(int i=0;i<string.length(); i++)
            {
                if (letters.indexOf(string.charAt(i))!= -1)
                {
                        System.out.println("Give me an " + string.charAt(i)+ ": "+ string.charAt(i)+"!");
                }
                else
                {
                        System.out.println("Give me a " + string.charAt(i)+ ": "+ string.charAt(i)+"!");
                }
            }
            System.out.println("What does that spell?");
            for (int i=0; i<number; i++)
            {
                System.out.println(string + " ! ! !");
            }
        }
}
