
import javax.swing.JOptionPane;

public class Principal1 {

public static void main(String[] args) {
    MiNumero miNumero = new MiNumero(); //Aqui se le asigna el valor de 0 a camValor        

    int num = Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor"));
    
    MiNumero miNumero2 = new MiNumero(num);//Aqui se le asigna el valor de num a el constructor con parametro

    int nuevoNumero = Integer.parseInt(JOptionPane.showInputDialog("Escriba el nuevo valor"));
    miNumero.setCamValor(nuevoNumero);//se le envia el valor del nuevo numero a camValor

}
}