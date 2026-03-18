import model.Cuenta;
import model.CuentaAhorros;
import model.CuentaCorriente;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cuenta juan = new Cuenta();
        CuentaAhorros pedro = new CuentaAhorros();
        CuentaCorriente luis = new CuentaCorriente();

        pedro.consultarSaldo();
        luis.consultarSaldo();
        juan.consultarSaldo();


    }
}
