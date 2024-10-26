// two type: 
// 1. pre incement / Decrement - 1st incement value;
// 2. post incement / Decrement - 1st call variable, then if again get same variable then increment it. 


public class IncreDecre {
    public static void main(String[] args) {
        int x = 10;
        int y;
        y = x++; // post increment
        System.out.println("Post increment "+ y);
        y = x;
        System.out.println("Post increment "+ y);

        System.out.println();

        int a = 10;
        int b;
        b = ++a; // pre increment
        System.out.println("Pre increment "+ b);
        b = a;
        System.out.println("Pre increment "+ b);
    }
} 