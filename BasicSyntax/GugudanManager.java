package BasicSyntax;
import java.util.Scanner;

public class GugudanManager {
    public static void main(String[] args) {
        // Gugudan guguManager = new Gugudan();

        // for (int i = 2; i < 10; i++) {
        //     int[] result = GuguManager.calculate(i);
        //     GuguManager.print(result);
        // }

        // // Req. 1
        // Req1 req1 = new Req1();
        // System.out.println("Enter Times number: ");
        // Scanner scan = new Scanner(System.in);
        // int times = scan.nextInt();
        // scan.close();
        // int[][] result = req1.calculate(times);
        // req1.print(result);

        // Req. 2
        Req2 req2 = new Req2();
        Scanner scan = new Scanner(System.in);
        String inVal = scan.nextLine();

        String[] splitVal = inVal.split(", ");
        int first = Integer.parseInt(splitVal[0]);
        int second = Integer.parseInt(splitVal[1]);

        req2.print(first, second);
        scan.close();
    }
}
