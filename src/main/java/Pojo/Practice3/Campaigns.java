package Pojo.Practice3;

import java.util.List;

public class Campaigns {
    private String campaign_id;
    private String name;
    private boolean active;
    private double budget;
    private List<String> channels;

    public String getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(String campaign_id) {
        this.campaign_id = campaign_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }


}
