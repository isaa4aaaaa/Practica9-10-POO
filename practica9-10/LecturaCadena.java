package mx.unam.fi.poo.g1.p910;

/**
 * Clase LectuaCadena
 * Se define la funcionalidad para la revisión
 * @author Campos Cortés Isaac Jareth
 * @version Octubre 2024
 */
public class LecturaCadena {
    private String palabra;
    static int cont;
    static char[] vocales = {'a','e','i','o','u'};

    /**
     * Constructor para la clase
     * @param palabra -> Para definir la palabra a revisar.
     */
    public LecturaCadena(String palabra){
        setPalabra(palabra);
    }

    /**
     * Método set del atributo palabra
     * @param palabra -> Para modificar palabra
     */
    public void setPalabra(String palabra){
        this.palabra = palabra;
    }

    /**
     * Método get del atributo palabra
     * @return this.palabra -> Retorna palabra
     */
    public String getPalabra(){
        return this.palabra;
    }

    /**
     * Método para la revisión de las vocales en la palabra
     * @throws ExcepcionNoVocales si la palabra revisada no contiene vocales
     */
    public void revisarVocales() throws ExcepcionNoVocales{
        String palabra = getPalabra();

        for (char v : vocales) {
            if(palabra.lastIndexOf(v) == -1){
                cont += 1;
                if(cont == 5){
                    throw new ExcepcionNoVocales("La palabra no contiene ninguna vocal!");
                }        
            }
        }
    }
}
