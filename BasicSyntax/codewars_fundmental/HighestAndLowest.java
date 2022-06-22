package BasicSyntax.codewars_fundmental;
import java.util.Arrays;

public class HighestAndLowest {
    public String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");
        int[] num = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = Integer.parseInt(nums[i]);
        }
        return String.format("%d %d", Arrays.stream(num).max().getAsInt(), Arrays.stream(num).min().getAsInt());
    }

    public static void main(String[] args) {
        HighestAndLowest hal = new HighestAndLowest();


        System.out.println("42 -9" + " | " + hal.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));

    }
}
