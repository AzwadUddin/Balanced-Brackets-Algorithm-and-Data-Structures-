import java.util.Scanner;

public class BracketBalancer {
    public static String checkBrackets(String input){
        Stack stack = new Stack();
        String validCharacters = "{}[]()0123456789+-*/";
        char recentOpenBracket;

        for(char c: input.toCharArray()){
            if(validCharacters.indexOf(c) == -1){
                return("Invalid character");
            }
            else{
                if(c == '{' || c == '[' || c == '('){
                    stack.push(c);
                }
            
                else if (c =='}'|| c == ']' || c ==')'){
                    if(stack.isEmpty()){
                        return "Unbalanced: More closing brackets";
                    }
    
                    recentOpenBracket = (char) stack.pop();
    
                    if((recentOpenBracket == '{' && c != '}') || (recentOpenBracket == '[' && c != ']') || (recentOpenBracket == '(' && c != ')')){
                        return("Mismatched brackets");
                    }
                }
            }
        }

        if(stack.isEmpty()){
            return("Balanced");
        }

        else{
            return("Unbalanced");
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();

        scnr.close();

        System.out.println(checkBrackets(input));
    }
}
