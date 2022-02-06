import java.util.Arrays;
public class B_ArrayMethods {

    public static void main (String args[]){
        //Sorting
        int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

        //Searching
        int[] numb = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numb, 2)); // 0
        System.out.println(Arrays.binarySearch(numb, 4)); // 1
        System.out.println(Arrays.binarySearch(numb, 1)); // -1
        System.out.println(Arrays.binarySearch(numb, 3)); // -2

        //searching works on sorted array only below will give random results
        int[] numbers1 = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers1, 2));
        System.out.println(Arrays.binarySearch(numbers1, 3));
        System.out.println("<---------------------------->");
        //Compare
        int[] arr1 = {0,1};
        int[] arr2 = {0,1};
        System.out.println(Arrays.compare(arr1,arr2));
        arr1[1] = 2;
        System.out.println(Arrays.compare(arr1,arr2));
        arr2[1] = 3;
        System.out.println(Arrays.compare(arr1,arr2));
        int[] arr3 = {0,0,0};
        System.out.println(Arrays.compare(arr1,arr3));
        int[] arr4 = {0,2,0};
        System.out.println(Arrays.compare(arr1,arr4));


        
    }
}