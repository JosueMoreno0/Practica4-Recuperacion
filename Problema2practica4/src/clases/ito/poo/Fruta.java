package clases.ito.poo;
import java.util.ArrayList;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

public class Fruta {
	
	public Fruta(String nombre, float extension, String tiempoDecosecha, float cosechaportiempo,
			float costoPromedio, float promedioVenta) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tiempoDecosecha = tiempoDecosecha;
		this.cosechaportiempo = cosechaportiempo;
		this.costoPromedio = costoPromedio;
		this.promedioVenta = promedioVenta;
	}
	
	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";

	/**
	 * Description of the property extension.
	 */
	public float extension = 0F;

	/**
	 * Description of the property tiempoDecosecha.
	 */
	public String tiempoDecosecha;

	/**
	 * Description of the property cosechaportiempo.
	 */
	public float cosechaportiempo;

	/**
	 * Description of the property costoPromedio.
	 */
	public float costoPromedio = 0F;

	/**
	 * Description of the property promedioVenta.
	 */
	public float promedioVenta = 0F;

	// Start of user code (user defined attributes for Fruta)
	

	// End of user code

	/**
	 * The constructor.
	 */

	/**
	 * Description of the method agregarPeriodo.
	 * @param periodo 
	 * @param estimacionCant 
	 */
	private ArrayList<String>periodo=new ArrayList<String>();
	private ArrayList <Float>estimacionCant = new ArrayList<Float>();
	
	public void agregarPeriodo(String periodo, float estimacionCant) {
		// Start of user code for method agregarPeriodo
		this.periodo.add(periodo);
		this.estimacionCant.add(estimacionCant);
		// End of user code
	}

	/**
	 * Description of the method borrarPeriodo.
	 * @param i 
	 * @return 
	 */
	public Boolean borrarPeriodo(int i) {
		// Start of user code for method borrarPeriodo
		Boolean borrarPeriodo = false;
		if(i>=0 && i<this.periodo.size()) {
			this.periodo.remove(i);
			this.estimacionCant.remove(i);
			borrarPeriodo=true;
		}
		return borrarPeriodo;
		// End of user code
		
	}

	/**
	 * Description of the method costoPeriodo.
	 * @param i 
	 * @return 
	 */
	public float costoPeriodo(int i) {
		// Start of user code for method costoPeriodo
		float costoPeriodo = 0F;
		if(i>=0 && i<this.periodo.size()) {
			
			costoPeriodo=this.estimacionCant.get (i)*this.costoPromedio;
		}
		return costoPeriodo;
	}

	/**
	 * Description of the method ganancia.
	 * @param i 
	 * @return 
	 */
	public float ganancia(int i) {
		// Start of user code for method ganancia
		float ganancia = 0F;
		if(i>=0&&i<this.periodo.size()) {
			ganancia=this.promedioVenta-(this.estimacionCant.get(i)*this.costoPromedio);
		}
			
			
		return ganancia;
		// End of user code
	}

	// Start of user code (user defined methods for Fruta)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns extension.
	 * @return extension 
	 */
	public float getExtension() {
		return this.extension;
	}

	/**
	 * Sets a value to attribute extension. 
	 * @param newExtension 
	 */
	public void setExtension(float newExtension) {
		this.extension = newExtension;
	}

	/**
	 * Returns tiempoDecosecha.
	 * @return tiempoDecosecha 
	 */
	public String getTiempoDecosecha() {
		return this.tiempoDecosecha;
	}

	/**
	 * Returns cosechaportiempo.
	 * @return cosechaportiempo 
	 */
	public float getCosechaportiempo() {
		return this.cosechaportiempo;
	}

	/**
	 * Returns costoPromedio.
	 * @return costoPromedio 
	 */
	public float getCostoPromedio() {
		return this.costoPromedio;
	}

	/**
	 * Sets a value to attribute costoPromedio. 
	 * @param newCostoPromedio 
	 */
	public void setCostoPromedio(float newCostoPromedio) {
		this.costoPromedio = newCostoPromedio;
	}

	/**
	 * Returns promedioVenta.
	 * @return promedioVenta 
	 */
	public float getpromedioVenta() {
		return this.promedioVenta;
	}

	/**
	 * Sets a value to attribute promedioVenta. 
	 * @param newpromedioVenta 
	 */
	public void setpromedioVenta(float newpromedioVenta) {
		this.promedioVenta = newpromedioVenta;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", extension=" + extension + ", tiempoDecosecha=" + tiempoDecosecha
				+ ", cosechaportiempo=" + cosechaportiempo + ", costoPromedio=" + costoPromedio
				+ ", promedioVenta=" + promedioVenta + ", periodo=" + periodo + ", estimacionCant=" + estimacionCant
				+  "]";
	}

}
