// https://www.codewars.com/kata/5467e4d82edf8bbf40000155/java
package BasicSyntax.CodewarsFundmental;
import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        char[] tmpNum = Integer.toString(num).toCharArray();
        Arrays.sort(tmpNum);
        char[] descNum = new char[tmpNum.length];
        for (int i = 0; i < tmpNum.length; i++) {
            descNum[i] = tmpNum[tmpNum.length - 1 - i];
        }
        return Integer.parseInt(new String(descNum));
    }

    public static void main(String[] args) {
        System.out.printf("%d, %d\n", 0, DescendingOrder.sortDesc(0));
        System.out.printf("%d, %d\n", 51, DescendingOrder.sortDesc(15));
        System.out.printf("%d, %d\n", 987654321, DescendingOrder.sortDesc(123456789));
    }
}
