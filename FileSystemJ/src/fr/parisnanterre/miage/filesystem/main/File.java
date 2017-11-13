package fr.parisnanterre.miage.filesystem.main;

public interface File {

        public String read();
        public void append(String text);
        public void write(String text);
        public int getId();
        public String getName();
        public User getOwner();
}
