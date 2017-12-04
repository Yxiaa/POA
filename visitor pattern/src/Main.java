public class Main {

        public static void main(String[] args) {

            Vetement veste = new Vetement();
            Vetement pantalon = new Vetement();

            GardeRobe gr = new GardeRobe();
            gr.ajouter(veste);
            gr.ajouter(pantalon);

            Piece room1 = new Piece("Salle de vetements");
            room1.ajouter(gr);

            Lamp lamp = new Lamp();
            Bureau bureau = new Bureau();
            bureau.ajouter(lamp);

            Piece room2 = new Piece("Un petit bureau à la cool");
            room2.ajouter(bureau);

            Univers leTout = new Univers();
            leTout.ajouter(room1);
            leTout.ajouter(room2);
            //avec vsisteur
            VisitorOne vo = new VisitorOne();

            leTout.accept(vo);


        }

}

