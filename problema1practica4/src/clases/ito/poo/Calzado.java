package clases.ito.poo;
import java.util.Arrays;
public class Calzado {

	public Calzado(int clave, String material, String troquel, int cantidaddia, String[] colors) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.cantidaddia = cantidaddia;
		this.colors = colors;
	}


	private int clave;
	private String material;
	private String troquel;
	private int cantidaddia;
	private String[] colors = null;{
		
	
	}


	public int getClave() {
		return clave;
	}


	public void setClave(int clave) {
		this.clave = clave;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getTroquel() {
		return troquel;
	}


	public void setTroquel(String troquel) {
		this.troquel = troquel;
	}


	public int getCantidaddia() {
		return cantidaddia;
	}


	public void setCantidadxDia(int cantidaddia) {
		this.cantidaddia = cantidaddia;
	}


	public String[] getColors() {
		return colors;
	}


	public void setColores(String[] colors) {
		this.colors = colors;
	}


	@Override
	public String toString() {
		return "Calzado [clave=" + clave + ", material=" + material + ", troquel=" + troquel + ", cantidaddia="
				+ cantidaddia + ", colores=" + Arrays.toString(colors) + "]";
	}


	public float costoPorLote(double costoPieza) {
		return (float) (this.cantidaddia*costoPieza);
		
	}
}
