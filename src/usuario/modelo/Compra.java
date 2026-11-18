package usuario.modelo;

public class Compra {
    private double total;
    private MetodosP metodopago;

    public Compra(double total, MetodosP metodopago) {
        this.total = total;
        this.metodopago = metodopago;
    }
    public double calcularTotalComsioin(){
        return total+metodopago.calcularComision(total);
    }
    public String mostrarInformacion(){
      return metodopago.mostrarInformacion();
    }
}
