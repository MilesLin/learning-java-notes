public interface MyABC{
//    void printA();
//
     void printA() ;
// Abstract method (to be implemented by implementing classes)
//    void abstractMethod();

    // Default method with a default implementation
    default void defaultMethod() {
        System.out.println("Default implementation of defaultMethod");
    }

    private void exec(){

    }
    static void AA(){

    }
}