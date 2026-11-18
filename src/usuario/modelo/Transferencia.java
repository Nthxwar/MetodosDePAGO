package usuario.modelo;

public class Transferencia extends MetodosP{
    private String banco;

    public Transferencia(String titular, double limite, String banco) {
        super(titular, limite);
        this.banco = banco;
    }
    @Override
    public double calcularComision(double monto){
      return monto/(monto*0.16);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()+"Titular: "+getTitular()+"banco"+banco;
    }
}
