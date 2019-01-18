package fr.wcs.musicband;

import java.util.ArrayList;

public class GroupeModel {

    private String name = "";
    private String desciption = "";
    private ArrayList<GroupeModel> groupeModels = new ArrayList<>();


    public GroupeModel(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<GroupeModel> getGroupeModels() {
        return groupeModels;
    }

    public void setGroupeModels(ArrayList<GroupeModel> groupeModels) {
        this.groupeModels = groupeModels;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public GroupeModel(String name, String desciption){
        this.name = name;
        this.desciption = desciption;
    }


}
