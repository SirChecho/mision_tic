
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goku = sc.nextInt();
        int next = distanceNextSphere(goku);
        int time = timeNextSphere(goku, next);
        System.out.format("%d %d %d \n", goku, next, time);
        System.out.println(sphereNumber(time));
                
    }

    public static int distanceNextSphere(int goku_distance) {
        int next_sphere = goku_distance * 2 + 4;
        return next_sphere;
    }

    public static int timeNextSphere(int goku_distance, int next_sphere) {
        int time = (goku_distance + next_sphere) / 5;
        return time;
    }

    public static String sphereNumber(int time) {
        if (time <= 20) {
            return "uno";
        } else if (21 <= time && time <= 30) {
            return "dos";
        } else if (31 <= time && time <= 50) {
            return "tres";
        } else {
            return "cuatro";
        }

    }
}
