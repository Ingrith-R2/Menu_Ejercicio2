package conicas2;

public class hiperbole {
    private double a_hip;
    private double b_hip;
    private double c_hip;
    private double Lr_hip;

    public hiperbole(double a, double b) {
        this.a_hip = a;
        this.b_hip = b;
    }

    public void setA(double a) {
        this.a_hip = a;
    }

    public void setB(double b) {
        this.b_hip = b;
    }

    public boolean variables() {
        this.a_hip = Math.sqrt(this.a_hip);
        this.b_hip = Math.sqrt(this.b_hip);
        this.c_hip = Math.sqrt(this.a_hip * this.a_hip + this.b_hip * this.b_hip);
        this.Lr_hip = 2.0 * this.b_hip * this.b_hip / this.a_hip;
        System.out.println("Se toma en cuenta el centro (0,0)");
        System.out.println("En el eje Y tanto hacia arriba y abajo: " + this.a_hip);
        System.out.println("En el eje x tanto hacia derecha e izquierda: " + this.b_hip);
        System.out.println("Con estas coordenadas se dibuja un rectangulo donde se generan las asintotas al momento de trazar una cruz entre los vertices contrarios");
        double var10001 = this.Lr_hip / 2.0;
        System.out.println("Se traza una linea horizontal desde el punto (-" + var10001 + "," + this.c_hip + ") hasta (" + this.Lr_hip / 2.0 + "," + this.c_hip + ")");
        return false;
    }
}
