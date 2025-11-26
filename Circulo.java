public class Circulo extends FiguraGeometrica
{
    private double raio;

    public Circulo (double r)
    {
        this.raio = r;
    }

    public double calcularPerimetro()
    {
        return 2 * Math.PI * this.raio;
    }

    public double calcularArea()
    {
        return Math.PI * Math.pow(this.raio, 2);
    }

    
    @Override
    public String toString()
    {
        String s = "Círculo\nÁrea: "+this.calcularArea() + "\nPerímetro: "+this.calcularPerimetro()+"\n";
        return s;
    }
}
