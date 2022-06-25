package BasicSyntax.codewars_fundmental;

public class GetTheMiddleCharacter {
    public String getMiddle(String word) {
        int len = word.length();
        String result = "";
        if (len % 2 == 0) {
            result += word.charAt(len / 2 - 1);
            result += word.charAt(len / 2);
        } else {
            result += word.charAt(len / 2);
        }
        return result;
    }

    public static void main(String[] args) {
        GetTheMiddleCharacter gtmc = new GetTheMiddleCharacter();

        System.out.println("es" + " / " + gtmc.getMiddle("test"));
        System.out.println("dd" + " / " + gtmc.getMiddle("middle"));
        System.out.println("t" + " / " + gtmc.getMiddle("testing"));
        System.out.println("A" + " / " + gtmc.getMiddle("A"));
    }
}
