public class IncreDecre01 {
    public static void main(String[] args) {
        int x = 10;
        int y;
        y = --x; // y = 9
        System.out.println("Post increment "+ y);
        y = x--; // y = 9
        System.out.println("Post increment "+ y);

        y = ++x; // y = 9
        System.out.println("Post increment "+ y);
        y = x++; // y =9
        System.out.println("Post increment "+ y);

    }
}
