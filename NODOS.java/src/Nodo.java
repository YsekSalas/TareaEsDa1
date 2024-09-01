import java.util.HashSet;
import java.util.Set;

public class Nodo {

    //*ATRIBUTOS*//
    private int numero;
    private Nodo sig;

    //*METODOS*//

    public Nodo(int numero) {
        this.numero = numero;
        this.sig = null;
    }

    public Nodo(int numero, Nodo sig) {
        this.numero = numero;
        this.sig = sig;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Nodo getSig() {
        return sig;
    }
    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public void enlazar (Nodo siguienteNodo){
        this.sig = siguienteNodo;
    }
    public void desenlazar(){
        this.sig = null;
    }

    /*public String info(){
        String resultado = "";
        if (this.sig != null) {   
            resultado = "(" + this.numero + ")->(" + this.sig.numero + ")";
        }
        else {
            resultado = "(" + this.numero + ")-> null ";    
        }
        return resultado;
    }*/
    
    public String info() {
        return info(new HashSet<>());
    }

    private String info(Set<Nodo> visitados) {
        // Verificar si este nodo ya ha sido visitado
        if (visitados.contains(this)) {
            return "("+ this.numero + "  -ciclo detectado - )";
        }

        // Agregar este nodo al conjunto de visitados
        visitados.add(this);

        String res = "(" + this.numero + ")";

        if (this.sig != null) {
            res += "->" + this.sig.info(visitados);  // Llamada recursiva con el conjunto de visitados
        } else {
            res += "-> NULL";
        }
        return res;
    }





    


}
