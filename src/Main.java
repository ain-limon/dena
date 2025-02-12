import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner i= new Scanner(System.in);
        char c =i.next().charAt(0);
        int code = (int)c;
        int prev = code - 1;
        int next = code + 1;
        char pchar = (char)prev;
        char nchar = (char)next;
        if (Character.isLetter(pchar)){
            System.out.print(pchar+ " ");
        }
        if (Character.isLetter(nchar)){
            System.out.print(nchar);
        }
    }
}