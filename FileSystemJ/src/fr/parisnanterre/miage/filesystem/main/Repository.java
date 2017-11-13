package fr.parisnanterre.miage.filesystem.main;

import java.util.ArrayList;

public class Repository extends AbstractFile{

    public ArrayList<File> files;
    private int id;
    private String name;
    private User propertyOf;
    private static int id_Fichiers = 1;


    public Repository(String name, User user) {
        super(name, user);
        this.id = getId();

        //user.addFile(this);
        files=  new ArrayList<File>();
    }

    public void addFile(File f) {
        files.add(f);
    }

    public void removeFile(int id) {
        for (File f : files)
            if(f.getId()==id)
                files.remove(f);
    }

    @Override
    public String read() {
        String str = "Liste Fichiers :\n";

        for(File f : files)
            str = str + f.getName() + "\n";

        return str;

    }

    public int size() {
        return files.size();
    }

    @Override
    public void append(String text) {
        this.addFile(new OrdinaryFile(text, propertyOf));
    }

    @Override
    public void write(String text) {
        files.clear();
        id_Fichiers = 1;
        this.addFile(new OrdinaryFile(text, propertyOf));
    }


}
