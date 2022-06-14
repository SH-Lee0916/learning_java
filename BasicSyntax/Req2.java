package BasicSyntax;

public class Req2 {
    public void print(int first, int second) {
        for (int i = 2; i < first + 1; i++) {
            for (int j = 1; j < second + 1; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
