package usuario.interfaz;

import usuario.modelo.Compra;
import usuario.modelo.Tarjeta;
import usuario.modelo.Transferencia;
import usuario.modelo.MetodosP;

public class MainUsuario {
    static void main() {
        MetodosP pago1 = new Tarjeta("Ana", 1000, "****1234");
        MetodosP pago2 = new Transferencia("Luis", 2000, "Banco X");
        Compra compra1 = new Compra(100, pago1);
        Compra compra2 = new Compra(100, pago2);
        System.out.println(compra1.mostrarInformacion());
        System.out.println(compra2.mostrarInformacion());
    }
}
