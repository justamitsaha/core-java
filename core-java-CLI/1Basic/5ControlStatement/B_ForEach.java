public class B_ForEach{
        public static void main (String args[]){
            int intArr[] = {1,2,3,4,5,6,7,8,9};

            for (int x :intArr){
                if(x>4){
                    break;
                }
                System.out.println(x);
            }
        }
}