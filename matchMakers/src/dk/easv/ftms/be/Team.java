package dk.easv.ftms.be;

import java.util.UUID;

/**
 *
 * @author Masoud
 */
public class Team {
    
    private String name;
    private UUID id;
    
    public Team(String name){
        
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
