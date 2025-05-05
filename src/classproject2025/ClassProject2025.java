/** Required package class namespace */
package classproject2025;


/*
 * ClassProject2025 - description
 * 
 * @author Mr. Wachs
 * @since Mar 6, 2025
*/
public class ClassProject2025
{

    /**
     * Main method for the project
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //char is converted to its decimal via ascii table
        char test = '{';
        //System.out.println((int)test); //97 - 122
        
        //theres of course a difference between lowercase and uppercase
        char test2 = 'A';
        //System.out.println((int)test2); //65 - 90
        
        
        String input = "abcdz"; //placeholder for now
        //System.out.println(input);
        
        output(rot13(input));
    }

    private static String rot13(String input) {
        String output = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ex = input.charAt(i);
            char nChar;
            int val = (int)ex + 13;
            
            if (val > 122) {
                System.out.println("greater");
                
            }
            
            System.out.println((char)val);
        }
        
        
        return output;
    }

    private static void output(String rot13) {
        System.out.println(rot13);
    }

    
    
    

}
