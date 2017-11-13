package fr.parisnanterre.miage.filesystem.main;

public class OrdinaryFile extends AbstractFile {

    private int id;
    private String name;
    private String text;
    private User propertyOf;

    public OrdinaryFile(String name, User user) {
        super(name, user);

        this.propertyOf = getOwner();
        this.text = "hello !";

        //user.addFile(this);
    }

    @Override
    public String read() {
        return text;
    }

    @Override
    public void append(String text) {
        this.text = this.text + text;
    }

    @Override
    public void write(String text) {
        this.text = text;
    }


}
