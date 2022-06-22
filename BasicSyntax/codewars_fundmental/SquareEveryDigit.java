package BasicSyntax.codewars_fundmental;

public class SquareEveryDigit {
    public int squareDigits(int n) {
        String number = Integer.toString(n);
        String result = "";
        for (int i = 0; i < number.length(); i++) {
            result += Integer.toString((int)Math.pow(number.charAt(i) - '0', 2));
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {

        SquareEveryDigit sqd = new SquareEveryDigit();
        System.out.printf("%d, %d \n", 811181, sqd.squareDigits(9119));
        System.out.printf("%d, %d \n", 0, sqd.squareDigits(0));

    }
}
