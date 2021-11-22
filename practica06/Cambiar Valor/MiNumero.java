public class MiNumero {

private int Valor;
private int camValor;

public MiNumero() {         //Constructor sin parametros
    this.camValor = 0;      //Asignando valor de 0
}

public MiNumero(int numero) {    //Constructor con parametros
    this.camValor = numero;      //camValor recibe el valor del parametro numero
}

public int getCamValor() {
    return camValor;
}

public void setCamValor(int camValor) {
    this.camValor = camValor;
}

public int getValor() {
    return Valor;
}

public void setValor(int Valor) {
    this.Valor = Valor;
}

public int cambiaNumero(int camValor) {
    return Valor = camValor;
}}