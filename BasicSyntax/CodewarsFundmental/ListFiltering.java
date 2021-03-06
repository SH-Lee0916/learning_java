package BasicSyntax.CodewarsFundmental;

import java.util.List;
import java.util.ArrayList;

// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/
public class ListFiltering {
    public List<Object> filterList(final List<Object> list) {
        List<Object> resultList = new ArrayList<Object>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        ListFiltering Kata = new ListFiltering();

        System.out.println(Kata.filterList(List.of(1, 2, "a", "b")) + "For input: [1, 2, \"a\", \"b\"]");
        System.out.println(Kata.filterList(List.of(1, "a", "b", 0, 15)) + "For input: [1, \"a\", \"b\", 0, 15]");
        System.out.println(Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)) + "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}
