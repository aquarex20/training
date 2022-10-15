public class TriEnBulles {
    /*
}
    public int[] trier(int[] tableau){
        boolean nonTrie=true;
        while (nonTrie){
            nonTrie=false;
            for (int i = 0; i <tableau.length-1 ; i++) {
                if (tableau[i+1]<tableau[i]) {
                    nonTrie=true;
                    int temp=tableau[i];
                    tableau[i] = tableau[i+1];
                    tableau[i+1] = temp;
                }

            }

        }
        return tableau;
    }
    */
    public int[] trier(int[] tableau){
        for (int i = 0; i <tableau.length-1 ; i++) {
            for (int j=0; j<tableau.length-1;j++)
            {
                if (tableau[j+1]<tableau[j]) {
                    int temp=tableau[j];
                    tableau[j] = tableau[j+1];
                    tableau[j+1] = temp;
                }

            }

        }
        return tableau;
    }

    }
