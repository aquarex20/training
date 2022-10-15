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

        SelectionTri sel=new SelectionTri();
        int[] trie=sel.trier(new int[]{6,1,2,10,-1,7,3,5});
        for (int i = 0; i < trie.length ; i++) {
            System.out.println(trie[i]);
        }
        }


    }
