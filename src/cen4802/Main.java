package cen4802;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int answer = 0;
        for (int i = n; i <= 40; i+=5) {
            answer = fibonacci(i);
            System.out.println("The "+ i +"th term of the Fibonacci sequence is " + answer);
        }
    }
    public static int fibonacci(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}