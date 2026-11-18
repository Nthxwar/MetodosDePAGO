package usuario.modelo;

public class MetodosP {
    private String titular;
    private double limite;

    public MetodosP(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
    }

    public double calcularComision(double monto){
        return monto/(monto*0.10);
    }

    public String mostrarInformacion(){
      return "Titular"+titular+"limite"+limite;
    }

    public String getTitular() {
        return titular;
    }
}
