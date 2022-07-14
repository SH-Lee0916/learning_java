package BasicSyntax.CodewarsFundmental;

// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/
public class Mumbling {
    public String accum(String s) {
        String[] result = new String[s.length()];
        for (int i = 0; i < s.length(); i ++) {
            String tmpResult = "";
            tmpResult  += Character.toUpperCase(s.charAt(i));
            for (int j = 0; j < i; j++) tmpResult += Character.toLowerCase(s.charAt(i));
            result[i] = tmpResult;
        }
        return String.join("-", result);
    }

    public static void main(String[] args) {
        Mumbling mum = new Mumbling();
        System.out.println(mum.accum("ZpglnRxqenU") + " / " + "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        System.out.println(mum.accum("NyffsGeyylB") + " / " + "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        System.out.println(mum.accum("MjtkuBovqrU") + " / " + "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        System.out.println(mum.accum("EvidjUnokmM") + " / " + "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        System.out.println(mum.accum("HbideVbxncC") + " / " + "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }
}
