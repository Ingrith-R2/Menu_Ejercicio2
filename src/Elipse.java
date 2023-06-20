package conicas2;

public class Elipse {
    private double eje_mayor;
    private double eje_menor;

    public Elipse(double eje_mayor, double eje_menor) {
        this.eje_mayor = eje_mayor;
        this.eje_menor = eje_menor;
    }

    public double getEje_mayor() {
        return this.eje_mayor;
    }

    public void setEje_mayor(double eje_mayor) {
        this.eje_mayor = eje_mayor;
    }

    public double getEje_menor() {
        return this.eje_menor;
    }

    public void setEje_menor(double eje_menor) {
        this.eje_menor = eje_menor;
    }

    public double area_elipse() {
        double area = Math.PI * this.eje_mayor * this.eje_menor;
        return area;
    }

    public double perimetro_elipse() {
        double perimetro = 9.42477796076938 * (this.eje_mayor + this.eje_menor) - Math.sqrt((3.0 * this.eje_mayor + this.eje_menor) * (this.eje_mayor + 3.0 * this.eje_menor));
        return perimetro;
    }
}
