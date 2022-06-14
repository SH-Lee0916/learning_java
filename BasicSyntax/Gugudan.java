package BasicSyntax;

// Class name starts with upper case, method name starts with lower case.
public class Gugudan {
    public int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }

        return result;
    }

    public void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[0] + " X " + (i + 1) + " = " + result[i]);
        }
        System.out.println();
    }
}