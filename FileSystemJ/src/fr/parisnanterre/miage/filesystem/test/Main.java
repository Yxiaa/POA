package fr.parisnanterre.miage.filesystem.test;

import fr.parisnanterre.miage.filesystem.main.File;
import fr.parisnanterre.miage.filesystem.main.FileFactory;
import fr.parisnanterre.miage.filesystem.main.Repository;
import fr.parisnanterre.miage.filesystem.main.User;

public class Main {

    public static void main(String [ ] args)
    {
        User jean = new User("Jean");
        Repository f = (Repository) FileFactory.getInstance().createRepository("Mon répertoire", jean);
        f.append("fichier.txt");
        f.append("fichier.xls");
        System.out.println(f.read());



    }

}
