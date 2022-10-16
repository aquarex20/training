public class TriParInsertion
{
    public static int[] trier(int[] tableau) {
        int j=0;

        for (int i = 1; i <tableau.length ; i++) {
            int temp=tableau[i];

            for (j=i; j>0 && temp<tableau[j-1] ; j--) {
                tableau[j] = tableau[j - 1];
            }
            tableau[j]=temp;
        }
        return  tableau;
    }

    }
