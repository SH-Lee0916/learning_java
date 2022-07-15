// https://www.codewars.com/kata/554e4a2f232cdd87d9000038/
package BasicSyntax.CodewarsFundmental;

import java.util.List;
import java.util.stream.Stream;

public class ComplementaryDNA {
    public String makeComplement(String dna) {
        String resultStr = "";

        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'A') resultStr += 'T';
            if (dna.charAt(i) == 'G') resultStr += 'C';
            if (dna.charAt(i) == 'C') resultStr += 'G';
            if (dna.charAt(i) == 'T') resultStr += 'A';
        }

        return resultStr;

    }


    public static void main(String[] args) {
        
    }
}
