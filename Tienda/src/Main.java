public class Main {
    public static void main(String[] args) {
        Cliente lola=new Cliente("Lola", new int[]{200,300,400,200});
        Cliente pepe=new Cliente("Pepe", new int[]{200,200,500,200,300});

        Dependienta de1=new Dependienta("MARTA");
        Dependienta de2=new Dependienta("LORENA");

        long tiempoInicio=System.currentTimeMillis();

        de1.registrarCompra(lola, tiempoInicio);
        de2.registrarCompra(pepe, tiempoInicio);
    }
}