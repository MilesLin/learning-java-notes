public class CusExceptionException extends Exception {
    public CusExceptionException(String msg){
        super(msg);
    }
    public CusExceptionException(String msg, Exception ex){
        // chain exception
        super(msg, ex);
    }
}
