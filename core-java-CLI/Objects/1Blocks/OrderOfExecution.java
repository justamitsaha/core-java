public class OrderOfExecution {

    //Then this
    public OrderOfExecution() {
        number = 5;
    }

    public static void main(String[] args) {
        OrderOfExecution orderOfExecution = new OrderOfExecution();
        System.out.println(orderOfExecution.number);
    }

    //First this runs
    private int number = 3;
    {
        number = 4;
    }
}
//Fields and blocks are run first in order, setting number to 3 and then 4. Then the constructor runs, setting number to 5