package a.basic.A_blocks;

public class OrderOfExecution {

    public OrderOfExecution() {
    	System.out.println(number);
        number = 5;
        System.out.println(number);
    }

    public static void main(String[] args) {
        OrderOfExecution orderOfExecution = new OrderOfExecution();
        orderOfExecution.number =8;
        System.out.println(orderOfExecution.number);
    }

    private int number = 3;
    {
        number = 4;
        System.out.println(number);
    }
}
//Fields and blocks are run first in order, setting number to 3 and then 4. Then the constructor runs, setting number to 5