public class B_StringBuilder{
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        StringBuilder sb = new StringBuilder("animals");
        System.out.println(sb.indexOf("a") +"" + sb.indexOf("al"));
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        sb.append("-").append(true);
        System.out.println(sb);  //animals-true

        sb.insert(7, "-");                   // sb = animals-
        sb.insert(0, "-");                   // sb = -animals-
        sb.insert(4, "-");                   // sb = -ani-mals-
        System.out.println(sb);

        StringBuilder sb3 = new StringBuilder("abcdef");
        sb3.delete(1, 3);                  // sb = adef

        sb.reverse();
        System.out.println(sb);

        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder);  // pigsty dirty

        sb.reverse();
        System.out.println(sb);
    }
}