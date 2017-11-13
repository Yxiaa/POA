package fr.parisnanterre.miage.filesystem.main;

public abstract class AbstractFile implements File {

    private int id;
    private String name;
    private String text;
    private User propertyOf;
    private static int id_Fichier = 0;

    public AbstractFile(String name, User propertyOf) {
        this.name = name;
        this.text = text;
        this.propertyOf = propertyOf;
        this.id = id_Fichier++;
    }

    @Override
    public abstract String read();

    @Override
    public abstract void append(String text);

    @Override
    public abstract void write(String text);

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public User getOwner() {
        return propertyOf;
    }
}
