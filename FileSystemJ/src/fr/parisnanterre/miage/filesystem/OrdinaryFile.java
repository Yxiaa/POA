package fr.parisnanterre.miage.filesystem;

public class OrdinaryFile extends AbstractFile {

    private int id;
    private String name;
    private String text;
    private User propertyOf;

    public OrdinaryFile(String name, User user) {
        super(name, user);

        this.propertyOf = getOwner();
        user.addFile(this);
        this.text = "hello !";
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
