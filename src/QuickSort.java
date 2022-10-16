import java.util.Collections;

public class QuickSort {
    public static int[] trier(int[] tableau, int left, int right) {
        int idxPivot=median3(tableau, left, right);
        int pivot=tableau[idxPivot];
        if (right-left==0|| right-left==1){
            return tableau;
        }
        if (right-left==2){
            if (tableau[right]>tableau[left]){
                    return tableau;
            }
            else
                return new int[] {tableau[right], tableau[left]};
        }

        swap(tableau, idxPivot, right);
        int idxSmallLeft=left;
        int idxBiggerRight=right-1;
        while(idxSmallLeft<idxBiggerRight) {
            while (tableau[idxSmallLeft] < pivot && idxSmallLeft++ < right) {
            }
            while (tableau[idxBiggerRight] > pivot && idxBiggerRight-- > left) {

            }
             if (idxSmallLeft<idxBiggerRight) {
                swap(tableau, idxSmallLeft, idxBiggerRight);
            }
        }
        swap(tableau, idxSmallLeft, right);

            tableau=trier(tableau, left,idxSmallLeft-1);
            tableau=trier(tableau,idxSmallLeft, right);



        return tableau;


    }

    private static void swap(int[] tableau, int idxPivot, int right) {
        int tampon=tableau[right];
        tableau[right]=tableau[idxPivot];
        tableau[idxPivot]=tampon;
    }

    private static int median3(int[] tableau, int left, int right) {
        return (left+right)/2;
    }
}
