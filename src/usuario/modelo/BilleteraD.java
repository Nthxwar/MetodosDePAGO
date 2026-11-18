package usuario.modelo;

public class BilleteraD extends MetodosP{
    private String prooveedor;

    public BilleteraD(String titular, double limite, String proovedor) {
        super(titular, limite);
        this.prooveedor = proovedor;
    }
    @Override
    public double calcularComision(double monto){
        return monto/(monto*0.12);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()+"Titular: "+getTitular()+" Proveedor"+prooveedor;
    }
}
