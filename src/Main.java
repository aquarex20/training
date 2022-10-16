public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ExpressionReader exprRead= new ExpressionReader(new char[]{'1','2','+','5','7','-','*'});
        ExpressionReader exprRead2= new ExpressionReader(new char[]{'(','(','1','2',')','+','5','7','-','*',')'});
        ExpressionReader exprRead3= new ExpressionReader(new char[]{'5','(','1','2',')','+','5','7','-','*',')'});

        /*exprRead.calculer();
        exprRead2.calculer();
        exprRead3.calculer();
        /*
         */

        int[] trie=SelectionTri.trier(new int[]{6,1,2,10,-1,7,3,5});
        for (int j : trie) {
            System.out.println(j);
        }
        System.out.println("Séparation");
        int[] trie2=TriEnBulles.trier(new int[]{6,1,2,10,-1,7,3,5});
        for (int j : trie2) {
            System.out.println(j);
        }
        System.out.println("Séparation");
        int[] trie3=TriParInsertion.trier(new int[]{6,1,2,10,-1,7,3,5});
        for (int j : trie3) {
            System.out.println(j);
        }
        System.out.println(Math.floor(2.1));
        System.out.println(Math.ceil(2.1));

        System.out.println("Séparation");
        int[] trie4=MergeSort.trier(new int[]{6,1,2,10,-1,7,3,5}, 0, 7);
        for (int i = 0; i < trie4.length ; i++) {
            System.out.println(trie4[i]);
        }




    }


    }
