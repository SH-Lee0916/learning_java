package BasicSyntax;

public class Req1 {
    public int[][] calculate(int times) {
        int[][] result = new int[times][times];

        for (int left = 0; left < result.length - 1; left++) {
            int[] subResult = new int[times];
            for (int right = 0; right < result[left].length; right++) {
                subResult[right] = (left + 2) * (right + 1);
            }
            result[left] = subResult;
        }

        return result;
    }

    public void print(int[][] result) {
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.println((i + 2) + " X " + (j + 1) + " = " + result[i][j]);
            }
            System.out.println();
        }
    }
}
