package Pojo.Practice3;

import java.util.List;

public class RemotePolicy {
    private boolean allowed;
    private List<String> days;

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

}
