
public class Conta {

    int numero;
    String dono;
    double saldo;
    double limite;
    int saca;
    int deposita;

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    boolean saca(double valor) {

        if (this.saldo < valor) {
            return false;
        } else {
            //
            this.saldo = this.saldo - valor;
            return true;
        }
    }

}
