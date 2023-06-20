
package conicas2;
public class circunferencia_grupo2 {
    private float radio_cir;
    private float angulo_central;
    private double pi = 3.1416;

    public circunferencia_grupo2(float radio_cir, float angulo_central) {
        this.radio_cir = radio_cir;
        this.angulo_central = angulo_central;
    }

    private float getAngulo_central() {
        return this.angulo_central;
    }

    public void setAngulo_central(float angulo_central) {
        this.angulo_central = angulo_central;
    }

    private float getRadio_cir() {
        return this.radio_cir;
    }

    private void setRadio_cir(float radio_cir) {
        this.radio_cir = radio_cir;
    }

    public double perimetro_cir() {
        double aux = this.pi * 2.0;
        return aux * (double)this.getRadio_cir();
    }

    public double area_cir() {
        double aux = (double)(this.getRadio_cir() * this.getRadio_cir());
        return this.pi * aux;
    }

    public double angulo_inscrito_cir() {
        return (double)(this.getAngulo_central() / 2.0F);
    }
}
