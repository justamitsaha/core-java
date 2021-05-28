public class DataType
 {
    short cat = 'a';
    short bird = 16000;
    char mammal = (short) 83;
    public static void main(String[] args) {
        DataType dt = new DataType();
        System.out.println(dt.cat);
        System.out.println(dt.bird);
        System.out.println(dt.mammal);
    }
}
