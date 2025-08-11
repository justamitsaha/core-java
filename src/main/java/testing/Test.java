package testing;


public class Test {
    static int i = 1000;
    int j = 1000;

    public static void main(String[] args) {
        Test test = new Test();
        int k = 1000;
        System.out.println(i + "<-->" + test.j + "<-->" + k);
        //System.out.printf("Values of i  %d, j %d, k %d", i, test.j, k);
        changeValue(i);
        changeValue(test.j);
        changeValue(k);
        System.out.println(i + "<-->" + test.j + "<-->" + k);  //1000<-->1000<-->1000 no change in value
    }

    static void changeValue(int i) {
        i++;
        System.out.println(i);  //1001
    }
}


class Box {
    int height, breath, length;


}






