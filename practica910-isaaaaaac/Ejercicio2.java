import java.util.*;

class NumeroDuplicadoException extends Exception{
    public NumeroDuplicadoException(String mensaje){
        super(mensaje);
    }
}

class IngresaUsuario{
    public static List<Integer> leerNumerosUsuario() {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos números deseas ingresar?");
        int cont = scanner.nextInt();

        System.out.println("Ingresa los enteros: ");
        for (int i = 0; i < cont; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }
        scanner.close();
        return numeros;
    }
}


class RevisionDuplicado{
    public static void checarDuplicado(List<Integer> numeros) throws NumeroDuplicadoException{
        Set<Integer> numerosUnicos = new HashSet<>();

        for (int num : numeros) {
            if (numerosUnicos.contains(num)){
                throw new NumeroDuplicadoException("Número duplicado encontrado.");
            }
            numerosUnicos.add(num);
            
        }
    }
}

public class Ejercicio2{
    public static void main(String[] args) {
        try {
            List<Integer> numeros = IngresaUsuario.leerNumerosUsuario();
            RevisionDuplicado.checarDuplicado(numeros);
            System.out.println("¡No hay  números duplicados!");
        } catch (NumeroDuplicadoException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}