
public class Paso_referencia {

    public static void main(String[] args) {
        // paso por refrencia
        persona p = new persona();
        p.cambiarnombre("Adrian");
        imprimirnombre(p); //Imprime adrian
        modificarpersona(p);
        imprimirnombre(p);//imprime juan

    }

    public static void modificarpersona(persona arg) {
        arg.cambiarnombre("juan");
    }
//Se hacen cambios al objeto, ya que estan siendo referenciados por la misma variable
    
    public static void imprimirnombre(persona p) {
        System.out.println("valor recibido : " + p.obtenernombre());
    }

}
