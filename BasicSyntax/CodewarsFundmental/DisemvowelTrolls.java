package BasicSyntax.CodewarsFundmental;

public class DisemvowelTrolls {
    public String disemvowel(String str) {
        return str.replaceAll("a|e|i|o|u|A|E|I|O|U", "");
        // (?i)[aeiou]
    }

    public static void main(String[] args) {
        DisemvowelTrolls Troll = new DisemvowelTrolls();

        System.out.printf("%s\n%s\n\n", "Ths wbst s fr lsrs LL!",Troll.disemvowel("This website is for losers LOL!"));
        System.out.printf("%s\n%s\n\n", "N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.printf("%s\n%s\n\n",  "Wht r y,  cmmnst?", Troll.disemvowel("What are you, a communist?"));

    }
}
