public class VisiteurTwo implements Visitor {

    int value = 0;

    @Override
    public void visit(Univers u) {

        for(Piece p : u.pieces)
            p.accept(this);

    }

    @Override
    public void visit(Piece p) {
        for(Truc t : p.trucs)
            t.accept(this);
    }

    @Override
    public void visit(Vetement v) {
        value++;
    }

    @Override
    public void visit(Lit l) {
        value++;
    }

    @Override
    public void visit(Lamp l) {
        value++;
    }

    @Override
    public void visit(GardeRobe gr) {
        for(Vetement v : gr.vetements)
            v.accept(this);
    }

    @Override
    public void visit(CollectionDeLivres cdl) {

        value++;

    }

    @Override
    public void visit(Bureau b) {
        for(Truc t : b.trucs)
            t.accept(this);
    }

    @Override
    public void visit() {

    }

    public int value() {
        return value;
    }

}
