
public class IsThisATriangle {
    public boolean isTriangle(int a, int b, int c) {
        boolean result = false;

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            result = true;
        }

        return result;

    }

    public static void main(String[] args) {
        IsThisATriangle isThisATriangle = new IsThisATriangle();

        System.out.println(isThisATriangle.isTriangle(1, 2, 2));
        System.out.println(isThisATriangle.isTriangle(7, 2, 2));
    }
}
