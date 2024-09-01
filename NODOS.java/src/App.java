public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Prueba1");
        Nodo nodo1 = new Nodo(20);
        System.out.println(nodo1.info());
        System.out.println("Prueba2");
        Nodo nodo2 = new Nodo(18);
        Nodo nodo3 = new Nodo(23);
        Nodo nodo4 = new Nodo(34);
        nodo4.enlazar(nodo2);
        nodo2.enlazar(nodo4);
        System.out.println("nodo 18: " + nodo2.info());
        System.out.println("nodo 23: " + nodo3.info());
        System.out.println("nodo 34: " + nodo4.info());
        System.out.println("Prueba3");
        Nodo nodo5 = new Nodo(16);
        Nodo nodo6 =new Nodo(27);
        nodo5.enlazar(nodo6);
        nodo6.enlazar(nodo5);
        System.out.println(nodo5.info());
        System.out.println(nodo6.info());
        nodo6.setNumero(16);
        nodo5.setNumero(27);
        System.out.println(nodo5.info());
        System.out.println(nodo6.info());
        nodo5.desenlazar();
        nodo6.desenlazar();
        System.out.println(nodo5.info());
        System.out.println(nodo6.info());
    }
        
    
}
