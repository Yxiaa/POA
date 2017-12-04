public interface Visitor {

    void visit(Univers u);
    void visit(Piece p);
    void visit(Vetement v);
    void visit(Lit l);
    void visit(Lamp l);
    void visit(GardeRobe gr);
    void visit(CollectionDeLivres cdl);
    void visit(Bureau b);
    void visit();


}
