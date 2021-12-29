package com.example.gestion_des_notes;

public class Bulletin {
    private String Module;
    private Double Note;

    public Bulletin(){

    }

    public Bulletin(double note, String module) {
        Module = module;
        Note = note;
    }


    public Double getNote(){
        return Note;
    }

    public void setNote(Double note){
        Note = note;
    }

    public String getModule(){
        return Module;
    }

    public void setModule(String module){
        Module=module;
    }

    @Override
    public String toString() {
        return ( getModule()+ "        " + getNote()+ "  ");
    }

}


