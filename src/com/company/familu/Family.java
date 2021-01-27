package com.company.familu;

import java.util.ArrayList;

public class Family {
    private ArrayList<String> members;
    private AbstractHouse homeAddresse;

    public Family(ArrayList<String> members, AbstractHouse homeadresse) {
        this.members = members;
        this.homeAddresse = homeadresse;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void live(){
        System.out.println(homeAddresse);
    }

    public int getFamilyMembersNumber(){
        return members.size();
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    public AbstractHouse getHomeadresse() {
        return homeAddresse;
    }

    public void setHomeadresse(AbstractHouse homeadresse) {
        this.homeAddresse = homeadresse;
    }
}
