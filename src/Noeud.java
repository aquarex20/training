public class Noeud {
    int element;
    Noeud left;
    Noeud right;
    public void insert(Noeud noeud, Noeud location){

        if (noeud.element==location.element)
            return;
        if (noeud.element<location.element){
            if (location.left==null){
                location.left=noeud;
                return;
            }
            else
                insert(noeud, location.left);
        }
        else if (location.right==null){
            location.right=noeud;
            return;
            }
            else {
            insert(noeud, location.right);
        }
    }
}
