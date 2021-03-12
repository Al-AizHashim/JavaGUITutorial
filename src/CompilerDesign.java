import java.util.Scanner;

public class CompilerDesign {

    public static void main(String[] args) {
        String str="";
        Scanner input = new Scanner(System.in);
        System.out.println("The grammar (a|b)* ab");
        System.out.println("Please Enter the string to be checked:");
         str=input.nextLine();
        int count=0;
        int outOfString=0;
        System.out.println("The grammar (a|b)* ab");
        if (str.endsWith("ab")){
            for (int i = 0; i <str.length(); i++){
                if (str.charAt(i) == 'a' || str.charAt(i) == 'b'){
                    count++;
                }else{
                    outOfString++;
                }
            }
            if (outOfString==0){
                System.out.println("Accepted ^-^");
            }else{
                System.out.println("Does not Accepted");
            }
        }else{
            System.out.println("Does not Accepted");
        }

    }
}

