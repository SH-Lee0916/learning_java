package BasicSyntax;

import java.util.ArrayList;

// Practice ArrayList
public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Object> ObjList = new ArrayList<Object>(); // Object로 사용
        ArrayList<Integer> intList = new ArrayList<Integer>(3); // Integer list
        ArrayList<ArrayTest> testList = new ArrayList<ArrayTest>(2); // 초기 용량 셋팅
        ArrayList<String> strList = new ArrayList<String>();

        // ArrayList add(int index, Object) or add(Object)
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(0, 4);

        strList.add("Hello");
        strList.add("World");
        strList.add("Hello");

        System.out.println(intList);
        System.out.println(strList);

        // ArrayList set(int index, Object)
        intList.set(0, 0);
        
        strList.set(2, "!!");

        System.out.println(intList);
        System.out.println(strList);

        // ArrayList remove(object), remove(int index)
        intList.remove(1);
        intList.remove(2);

        strList.remove("World");
        strList.remove(1);

        System.out.println(intList);
        System.out.println(strList);

        // clear()
        intList.clear();

        System.out.println(intList);
        
        // ArrayList size()
        System.out.println(intList.size());
        System.out.println(strList.size());

        // ArrayList get(int index)
        System.out.println(strList.get(0));

        // ArrayList contains(object), indexOf(object)
        System.out.println(intList.contains(1));
        intList.add(0);
        System.out.println(intList.contains(0));

        System.out.println(strList.contains("World"));
        System.out.println(strList.indexOf("Hello"));
    }
}