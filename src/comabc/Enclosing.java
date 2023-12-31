package comabc;

public class Enclosing {

    private static final int AA = 10;
    private final int BB;
    public Enclosing(){
        this.BB = 20;
        System.out.println(Nested.CC);
    }

    public class Nested {
        private static final int CC = 2033;
        public void Exec(){
            System.out.println(AA);
        }
    }
}
