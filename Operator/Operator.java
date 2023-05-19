/* 
Java Left Shift Operator Example
public class Operator {
    public static void main(String[] args) {
        System.out.println(10<<2); // 10*2^2 = 10*4 = 40
        System.out.println(10<<3); // 10*2^3 = 10*8 =80
        System.out.println(20<<2); // 20*2^2 = 20*4 =80
        System.out.println(15<<4); // 15*2^4 = 15*16 =240
    }
} */

/* Java Right Shift Operator
public class Operator {
    public static void main(String[] args) {
        System.out.println(10>>2); // 10/2^2 = 10/4= 2
        System.out.println(20>>2); // 20/2^2 = 20/4= 5
        System.out.println(30>>2); // 30/2^3 = 30/8= 2
    }
} */

/*
Java AND Operator Example: Logical && and Bitwise &
The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.
The bitwise & operator always checks both conditions whether first condition is true or false.

public class Operator{
    public static void main(String[] args) {
        int a =10;
        int b=5;
        int c=20;
        System.out.println(a<b && a++<c); //false && true = false
        System.out.println(a<b & a<c); // false & true = false
    }
} 

public class Operator{
    public static void main(String[] args) {
        int a =10;
        int b=5;
        int c=20;
        System.out.println(a<b && a++<c); //false && true = false
        System.out.println(a);
        System.out.println(a<b & a++<c); // false & true = false
        System.out.println(a);
    }
} */

/*
Java OR Operator Example: Logical || and Bitwise |
public class Operator{
    public static void main(String[] args) {
        int a=10;  
        int b=5;  
        int c=20;  
        System.out.println(a>b||a<c);//true || true = true  
        System.out.println(a>b|a<c);//true | true = true  
        System.out.println(a>b||a++<c);//true || true = true  
        System.out.println(a);//10 because second condition is not checked  
        System.out.println(a>b|a++<c);//true | true = true  
        System.out.println(a);//11 because second condition is checked 
    }
}  */