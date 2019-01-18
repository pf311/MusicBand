package fr.wcs.musicband;

public class JoinGroupModel {

    private String name = "";
    private String type = "";
    private int members = 1;
    private String newMembers = "";

    public JoinGroupModel(){


    }

    public JoinGroupModel(String name, String type, int members,String newMembers) {
        this.name = name;
        this.type = type;
        this.members = members;
        this.newMembers = newMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public String getNewMembers() {
        return newMembers;
    }

    public void setNewMembers(String newMembers) {
        this.newMembers = newMembers;
    }
}

