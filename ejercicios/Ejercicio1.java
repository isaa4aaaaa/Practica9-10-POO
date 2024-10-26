
class RaizNegativaException extends Exception{
    public RaizNegativaException(String mensage){
        super(mensage);
    }
}

class OperacionMatematica2{
    public double raizCuadrada(double numero) throws RaizNegativaException{
        if(numero < 0){
            throw new RaizNegativaException("No se puede calcular una raíz negativa...");
        }
        return Math.sqrt(numero);
    }
}

public class Ejercicio1{
    public static void main(String[] args) {
        OperacionMatematica2 operacion = new OperacionMatematica2();

        try {
            double resultado = operacion.raizCuadrada(-9);
            System.out.println("Resultado: "+resultado);
        } catch (RaizNegativaException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}