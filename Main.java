public class Main 
{
    public static void main(String[] args) 
    {
        Circulo c = new Circulo(7);
        Quadrado q = new Quadrado(8, 8);
        FiguraGeometrica t = new Triangulo(12, 4, 9);

        System.out.println(c.toString());
        System.out.println(q.toString());
        System.out.println(t.toString());   // caso dê NaN, a raiz da área será negativa
    }
}
