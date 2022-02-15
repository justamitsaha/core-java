public class G_Final {
    public static void main(String[] args) {
        Abc ab = new Abc();
        System.out.println(ab.CFO);
    }
    
}

class Company{
    final String CEO = "Amit";
    final String CFO;
    final String CTO;

    {
        CFO ="Amit";
    }
    // Without below constructor compilation will fail
    Company(String s) {
        CTO = s;
    }

    //Company() {} Since Final CTO is not initialized it will not compile
}

class Abc extends Company {
    Abc() {
        super(null);
    }
}