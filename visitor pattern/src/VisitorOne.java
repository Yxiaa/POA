public class VisitorOne implements Visitor {
    @Override
    public void visit(Univers u) {
        System.out.println("Je suis un univers");
        for(Piece p : u.pieces)
        {
            p.accept(this);
        }
    }

    @Override
    public void visit(Piece p) {
        System.out.println("Je suis une piece");
        for(Truc t : p.trucs)
            t.accept(this);
    }

    @Override
    public void visit(Vetement v) {
        System.out.println("Je suis une vetement");
    }

    @Override
    public void visit(Lit l) {
        System.out.println("Je suis un lit");
    }

    @Override
    public void visit(Lamp l) {
        System.out.println("Je suis une lampe");
    }

    @Override
    public void visit(GardeRobe gr) {
        System.out.println("Je suis une garde robe");
        for(Vetement v : gr.vetements)
            v.accept(this);

    }

    @Override
    public void visit(CollectionDeLivres cdl) {
        System.out.println("Je suis une collection de livre");
    }

    @Override
    public void visit(Bureau b) {
        System.out.println("Je suis un bureau");
        for(Truc t : b.trucs)
            t.accept(this);
    }

    @Override
    public void visit() {

    }
}
