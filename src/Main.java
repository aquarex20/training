public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ExpressionReader exprRead= new ExpressionReader(new char[]{'1','2','+'});
        exprRead.calculer();

    }
}