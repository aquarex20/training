public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ExpressionReader exprRead= new ExpressionReader("12+");
        System.out.println("Valeur de calcul: "+exprRead.calculer());
        exprRead.calculer();

    }
}