package usuario.modelo;

public class Tarjeta extends MetodosP{
    private String numero;

    public Tarjeta(String titular, double limite, String numero) {
        super(titular, limite);
        this.numero = numero;
    }
    @Override
    public double calcularComision(double monto){
      return monto/(monto*0.05);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()+"Titular: "+getTitular()+"numero"+numero;
    }
}
