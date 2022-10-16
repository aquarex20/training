public class MergeSort {
    public static int[] trier(int[] tableau, int left, int right) {
        int[] partieGauche;
        int[] partieDroite;
        if (right-left==0)
            return new int[] {tableau[right]};
        else if (right-left==1) {
            if (tableau[right]>tableau[left])
                return new int[] {tableau[left], tableau[right]};
            else
                return new int[] {tableau[right], tableau[left]};
        }
        else{
            partieGauche=trier(tableau, left, (left+right)/2);
            partieDroite=trier(tableau, (left+right)/2+1,right);
            int[] nouveauTableau= new int[partieGauche.length+partieDroite.length];
            int i = 0,j=0,k=0;
            for (; j <partieGauche.length&&k<partieDroite.length ;i++) {
                if (partieGauche[j]>partieDroite[k])
                    nouveauTableau[i]=partieDroite[k++];
                else nouveauTableau[i]=partieGauche[j++];
            }
            if (j==partieGauche.length)
                for (;k<partieDroite.length;k++)
                    nouveauTableau[i++]=partieDroite[k];
            else {
                for (; j <partieDroite.length; j++)
                    nouveauTableau[i++] = partieGauche[j];

            }
            return nouveauTableau;

        }
    }
}
