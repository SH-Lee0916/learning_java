package BasicSyntax.codewars_fundmental;

// https://www.codewars.com/kata/54c27a33fb7da0db0100040e/
public class YoureaSquare {
    public boolean isSquare(int n) {
        double sq = Math.sqrt(n);
        return (sq - Math.floor(sq) == 0);
    }

    public static void main(String[] args) {
        YoureaSquare test = new YoureaSquare();

        System.out.println(test.isSquare(1));
        System.out.println(test.isSquare(-1));
        System.out.println(test.isSquare(4));
    }

}
