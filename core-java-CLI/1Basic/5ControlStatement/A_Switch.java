//For versions of Java prior to JDK 7, expression must resolve to type byte, short, int, char, or an enumeration. (Enumerations are described in Chapter 12.) Beginning with JDK 7, expression can also be of type String

public class A_Switch{
        //A switch statement is usually more efficient than a set of nested ifs. When it compiles a switch statement, the Java compiler will inspect each of the case constants and create a “jump table” that it will use for selecting the path of execution depending on the value of the expression. Therefore, if you need to select among a large group of values, a switch statement will run much faster than the equivalent logic coded using a sequence of if-elses.
        public static void main (String args[]){
            //If break is nnot there all senarios will be executed
            for (int i=0; i<6;i++){
                switch(i){
                    case 0:
                        System.out.println("0 "+i);
                        break;
                    case 1:
                        System.out.println("1 "+i);
                        break;
                    case 2:
                        System.out.println("3 "+i);
                        break;
                    default:
                        System.out.println("This s default" +i);
                }
            }
            //As mentioned, beginning with JDK 7, you can use a string to control a switch statement. For example,

            String str = "abc";
            switch(str){
                    case "abc":
                        System.out.println("0 "+str);
                        break;
                    case "efg":
                        System.out.println("1 "+str);
                        break;
                    case "xyz":
                        System.out.println("3 "+str);
                        break;
                    default:
                        System.out.println("This s default" +str);
                }
        }

        // using a string-based switch is an improvement over using the equivalent sequence of if/else statements. However, switching on strings can be more expensive than switching on integers. Therefore, it is best to switch on strings only in cases in which the controlling data is already in string form. In other words, don’t use strings in a switch unnecessarily.
}