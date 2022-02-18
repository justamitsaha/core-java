
public class CLIClass {

	public static void main(String[] args) {
		new Monkey();

	}

}


class Primate {
	   public Primate() { System.out.println("Primate-");}
	}

	class Ape extends Primate {
	   public Ape(int fur) {System.out.println("Ape1-");}

	   public Ape() {System.out.println("Ape2-");}
	}

	class Monkey extends Ape {
	   private String name = "swimmy";
	   {System.out.println(name);}
	   private static int COUNT = 0;
	   static {System.out.println(COUNT); }
	   {COUNT++;System.out.println(COUNT); }

	   public Monkey() {
	      // System.out.println("Constructor"); Will not compile
	      //super(2);
	      System.out.println("Monkey Constructor");
	 }

}