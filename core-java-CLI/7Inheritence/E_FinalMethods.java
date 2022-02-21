public class E_FinalMethods extends Master{
    public static void main(String[] args) {}

    //public final void finalMethod1(){}
    //public final void finalMethod2(){}
    public static final void finalMethod3(){}
    private static final void finalMethod4(){}
}

class Master {
    public final void finalMethod1(){}
    public static final void finalMethod2(){}
    private static final void finalMethod3(){}
    private static final void finalMethod4(){}
}

//final methods cannot be overridden however if marked as private can be rewritten