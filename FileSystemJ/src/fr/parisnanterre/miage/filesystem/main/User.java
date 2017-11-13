package fr.parisnanterre.miage.filesystem.main;

import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<File> ownerOf;

    public User(String name) {
        this.name = name;
        this.ownerOf = new ArrayList<File>();
    }


    public void addFile(File f) {
        ownerOf.add(f);
    }

    public String getName() {
        return name;
    }
}
