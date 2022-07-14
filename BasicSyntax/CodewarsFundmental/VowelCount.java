// https://www.codewars.com/kata/54ff3102c1bad923760001f3

package BasicSyntax.CodewarsFundmental;

public class VowelCount {
    public int getCount(String str) {
        return str.length() - str.replaceAll("[a|e|i|o|u]", "").length();
    }

    public static void main(String args[]) {
        VowelCount vow = new VowelCount();

        System.out.println(vow.getCount("Nope"));
        System.out.println(vow.getCount("abracadabra"));
    }
}
