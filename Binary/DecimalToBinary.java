import java.util.Scanner;

class DecToBin {

public static void main(String[] args) {

    int input;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter number to convert to binary: ");
    input = scan.nextInt();
    convert(input);
    
    /*
    Integer.toString(n,8) // decimal to octal
    Integer.toString(n,2) // decimal to binary
    Integer.toString(n,16) //decimal to Hex
    */

}

public static void convert(int num) {
    if (num>0) {
        convert(num/2);
        System.out.print(num%2 + " ");
    }
}

}