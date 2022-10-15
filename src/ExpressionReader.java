import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ExpressionReader {
    char[] expression;
    ExpressionReader(char[] calcul){
        expression= new char[calcul.length] ;
        expression= calcul.clone();
    }
    ExpressionReader(String calcul){
        expression= calcul.toCharArray();
    }
    public int calculer(char[] expression){
        Stack<Integer> pileArtificielle= new Stack<>();

        for (char c:expression
        ) {
            if (c=='*')
            {
                int val1=pileArtificielle.pop();
                int val2=pileArtificielle.pop();

                pileArtificielle.push(val1 * val2);
            }
            else if (c=='-')
            {
                int val1=pileArtificielle.pop();
                int val2=pileArtificielle.pop();
                pileArtificielle.push(val1-val2);
            }
            else if (c=='+')
            {
                int val1=pileArtificielle.pop();
                int val2=pileArtificielle.pop();
                pileArtificielle.push(val1 + val2);
            }
            else if (c=='/')
            {
                int val1=pileArtificielle.pop();
                int val2=pileArtificielle.pop();

                pileArtificielle.push(val1 / val2);
            }
            else if(c=='('){
                ArrayList<Character> newExpression= new ArrayList<>();
                int compte =0;
                int resultat=0;
                boolean compter=false;
                for (char c1: expression
                     ) {
                    if (c1=='('){
                        compter=true;
                        compte+=1;
                    }
                    if (c1==')'){
                        if (compte==0) {
                            char[] newExpression2= new char[newExpression.size()];
                            for (int i = 0; i <newExpression.size() ; i++) {
                                newExpression2[i]=newExpression.get(i);
                            }
                            resultat=calculer(newExpression2);
                            break;
                        }
                        compte-=1;
                    }
                    if (compter)
                        newExpression.add(c1);
                }
                pileArtificielle.push(resultat);


            }
            else if (c==')'){

            }

            else{
                pileArtificielle.push(Character.getNumericValue(c));
            }

        }
        return pileArtificielle.pop();
    }

    public int calculer(){
        System.out.println("\nExpression recue: ");
        for (char c: expression
        ) {
            System.out.println(c);

        }
        System.out.println("\nValeur de calcul: "+calculer(expression));

        return calculer(expression);
    }

}
