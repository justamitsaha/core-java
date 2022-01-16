
public class F_Array{
    public static void main (String args[]){
        //Although this declaration establishes the fact that month_days is an array variable, no array actually exists. 
        ////First, you must declare a variable of the desired array type. Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable.
        int month_days[];
        month_days = new int[5];
        //After this statement executes, month_days will refer to an array of 12 integers. Further, all elements in the array will be initialized to zero.
        String string_arr[] = new String[5];
        Boolean bool_arr[] = new Boolean[5];
        //Boolean and String will be initialized to null
        for(int i=0; i<12;i++){
            //Since all elements are initialized to zero so will print zeros
            System.out.println(month_days[i]);
            System.out.println(string_arr[i]);
            System.out.println(bool_arr[i]);
        }
        
        int newArr[] = {1,2,3,4,5};
        

        //Since the array is initialized at 12 assigning value at 13 position will not work
        month_days[6] = 34;
        System.out.print(month_days[13]);
    }
}