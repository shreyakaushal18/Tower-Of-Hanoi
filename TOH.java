import java.util.Scanner;

public class TOH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        towerOfHanoi(n, "S", "H", "D");
        int totalSteps = (int)Math.pow(2, n) - 1;
        System.out.println(totalSteps);
    }

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if(n == 1){
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
}
