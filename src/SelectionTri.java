public class SelectionTri<AnyType> {
    public static int[] trier(int[] tableau){

        for (int i = 0; i <tableau.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <tableau.length; j++) {
                if (tableau[j]<tableau[min]){
                    min=j;
                }
            }
            int copie=tableau[i];
            tableau[i]=tableau[min];
            tableau[min]=copie;
        }
        return tableau;

    }
}
