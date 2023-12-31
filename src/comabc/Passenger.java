package comabc;

import java.util.Collections;
import java.util.List;

public record Passenger(int id, String name, List<String> something) {
    public Passenger(int id){
        this(id, null,null);
    }

    public Passenger withName(String name){
        return new Passenger(1, name,null);
    }
}
