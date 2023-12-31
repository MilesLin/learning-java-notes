package comabc;

public enum ED {
    STRING_ONE("title 1"),
    STRING_TWO("title 2");
    private ED(String title){
        this.title = title;
    }
    private int val;
    private String title;
    public String getTitle(){
        return this.title;
    }
    public void exe(){
    }
}

