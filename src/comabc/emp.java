package comabc;

public class emp implements IEmp {
    {
        System.out.println("init emp");
    }
    static void Go(){
//        Register();
    }

    @Override
    public String TellTheStory(){

        Go();
        return "over la";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof emp other && other.Register() == 1;
    }

    public int Register(){
        return haha;
    }
}

