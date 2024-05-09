package zoo;

/**
 * Es la clase Tiburon  que hereda de la clase Pez en el paquete zoo
 * @author anaru
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     * es un constructor que hereda de la clase pez con sus parametros 
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * es un constructor parametrizado 
     * @param especie : la especie de tiburon
     * @param peligroso : si es peligroso
     * @param velocidadMaxNatacion : si la velocidad maxima de la natacion 
     * @param tipo : tipo que animal es
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * constructor parametrizado 
     * @param especie : la clase de especio
     * @param peligroso : si el animal es peligroso 
     * @param velocidadMaxNatacion : si la velocidad del tiburon es maxima 
     * @param tipo : su tipo que es  
     * @param habitat : su habita de tiburon 
     * @param comida : la comida que come 
     * @param longevidad : la longitud 
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * metodo que dice el desplazamiento del animal
     */ 
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * metodo que dice lo que come
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * sobreescribir de metodo finalizar el numero de tiburones que hay hereda de la clase pez con una expecion
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
