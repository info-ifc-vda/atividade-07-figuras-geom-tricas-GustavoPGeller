public class Triangulo extends FiguraGeometrica
{
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo (double a, double b, double c)
    {
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }

    public double calcularArea()
    {
        double sp = (calcularPerimetro()) / 2; //sp = semiperímetro
        return Math.sqrt(sp * (sp - this.ladoA) * (sp - this.ladoB) * (sp - this.ladoC));
    }

    public double calcularPerimetro()
    {
        return this.ladoA + this.ladoB + this.ladoC;
    }

    @Override
    public String toString()
    {
        String s = "Triangulo\nÁrea: "+this.calcularArea() + "\nPerímetro: "+this.calcularPerimetro()+"\n";
        return s;
    }
}
