public class Quadrado extends FiguraGeometrica
{
    private double base;
    private double altura;

    public Quadrado (double b, double h)
    {
        this.base = b;
        this.altura = h;
    }

    public double calcularArea()
    {
        return Math.pow(this.base, 2);
    }

    public double calcularPerimetro()
    {
        return 2 * this.base + 2* this.altura;
    }

    @Override
    public String toString()
    {
        String s = "Quadrado\nÁrea: "+this.calcularArea() + "\nPerímetro: "+this.calcularPerimetro()+"\n";
        return s;
    }
}