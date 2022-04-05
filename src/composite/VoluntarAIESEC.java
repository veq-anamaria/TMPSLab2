package composite;

import java.util.ArrayList;
import java.util.List;

public class VoluntarAIESEC {
    private String name;
    private String department;
    private List<VoluntarAIESEC> members;

    public VoluntarAIESEC(String name, String department) {
        this.name = name;
        this.department = department;
        members = new ArrayList<VoluntarAIESEC>();
    }

    public void add(VoluntarAIESEC e){
        members.add(e);
    }

    public void remove(VoluntarAIESEC e){
        members.remove(e);
    }

    public List<VoluntarAIESEC> getMembers(){
        return members;
    }

    @Override
    public String toString() {
        return "VoluntarAIESEC{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", members=" + members +
                '}';
    }
}
