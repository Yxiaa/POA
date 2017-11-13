package fr.parisnanterre.miage.filesystem;

public class FileFactory {
    private static FileFactory ourInstance = new FileFactory();

    public static FileFactory getInstance() {
        return ourInstance;
    }

    private FileFactory() {
    }

    public File createRepository(String name, User user) {
        return new Repository(name, user);
    }

    public File createOrdinaryFile(String name, User user) {
        return new OrdinaryFile(name, user);
    }

}
