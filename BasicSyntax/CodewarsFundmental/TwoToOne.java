import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

public class TwoToOne {
    public String longest (String s1, String s2) {
        TreeSet<Character> set = new TreeSet<Character>();
        
        for (int i = 0; i < s1.length(); i++)
            set.add(s1.charAt(i));
        for (int i = 0; i < s2.length(); i++)
            set.add(s2.charAt(i));

        Iterator iter = set.iterator();
        char[] charArray = new char[set.size()];
        for (int i = 0; i < set.size(); i++) charArray[i] = iter.next().toString().charAt(0);

        return new String(charArray);
    }

    public static void main(String[] args) {
        TwoToOne tto = new TwoToOne();

        System.out.println(tto.longest("abc", "cde"));
    }
}
