import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(triangle(a,b,c));
    }

    public static String triangle(int a, int b, int c) {
        if(a==b && b==c)
            return "Equilateral";

        else if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
            return "Not a triangle";

        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
            return "Isosceles";

        else if(a!=b && b!=c && c!=a)
            return "Scalene";
        return null;
    }
}