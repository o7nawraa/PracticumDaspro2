import java.util.Scanner;
public class TheTriangle07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput, i=0;
        String s = "";
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (;i < numInput; i++){
            s += " *";
            System.out.println(s);
        }
    }
    
}

// while (i < numInput) {
//     s += " *";
//     System.out.println(s);
//     i++;

// }