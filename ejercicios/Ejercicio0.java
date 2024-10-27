class DivisionPorCeroException extends Exception{
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}


class OperacionMatematica{
    public double dividir(double numerador, double denominador) throws DivisionPorCeroException{
        if(denominador == 0){
            throw new DivisionPorCeroException("No es posible dividir entre cero...");
        }
        return numerador / denominador;
    }
}

public class Ejercicio0{
    public static void main(String[] args) {
        OperacionMatematica operacion = new OperacionMatematica();
        try {
            double resultado = operacion.dividir(10,0);
            System.out.println("Resultado: "+ resultado);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}

