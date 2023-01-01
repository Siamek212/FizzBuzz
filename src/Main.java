public class Main {
    public static void main(String[] args) {
        for (int y = 1; y <= 1000; y++) {
            if (y % 5 == 0 && y % 3 == 0) {
                System.out.println(y+" fizzbuz");
            } else if (y%3==0) {
                System.out.println(y+" fizz");

            } else if (y%5==0) {
                System.out.println(y+" buzz");

            }else System.out.println(y);
        }
    }
    
}