//Fields and instance initializer blocks are run in the order in which they appear in the file.
//The constructor runs after all fields and instance initializer blocks have run.
public class Chick {
   private String name = "Fluffy";
   {
      //This will print first
      System.out.println("setting field");
   }

   public Chick() {
      name = "Tiny";
      //Then this
      System.out.println("setting constructor");
   }

   public static void main(String[] args) {
      Chick chick = new Chick();
      //This one in the end
      System.out.println(chick.name);
   }
}
