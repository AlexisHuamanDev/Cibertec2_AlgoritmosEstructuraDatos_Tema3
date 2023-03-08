package entidad;

public class Empleado {
	//atributos privados
	private int codigo;
	private String nombre;
	private int categoria;
	private int numCelular;
	
	//Variable privadas de clase
	private static int cantObjEmpleado;
	private static double sumaTotalSueldosNeto;
	
	//constante publica
	public static final double DESCUENTO;
	
	//Bloque de inicializacion
	static {
		DESCUENTO = 0.15;
		cantObjEmpleado = 0;
		sumaTotalSueldosNeto = 0.0;
	}
	//constructores
	public Empleado(int codigo, String nombre, int categoria, int numCelular) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.numCelular = numCelular;
		//cuente la cantidad de objetos creados
		cantObjEmpleado ++;
		//acumule los sueldos netos
		sumaTotalSueldosNeto+=sueldoNeto();
	}
	public Empleado(int codigo, String nombre) {
		this(codigo,nombre,2,999999999);
	}
	
	public Empleado() {
		this(444,"Ninguno");
	}
	
	//Metodos get/set 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getNumCelular() {
		return numCelular;
	}
	public void setNumCelular(int numCelular) {
		this.numCelular = numCelular;
	}
	
	//Metodos get/set variables privadas de clase 
	
	public static int getCantObjEmpleado() {
		return cantObjEmpleado;
	}
	public static void setCantObjEmpleado(int cantObjEmpleado) {
		Empleado.cantObjEmpleado = cantObjEmpleado;
	}
	public static double getSumaTotalSueldosNeto() {
		return sumaTotalSueldosNeto;
	}
	public static void setSumaTotalSueldosNeto(double sumaTotalSueldosNeto) {
		Empleado.sumaTotalSueldosNeto = sumaTotalSueldosNeto;
	}
		
	//Operaciones publicas
	
	public double sueldoBruto() {
		switch(categoria) {
			case 0:
				return 7200;
			case 1: 
				return 6300;
			default:
				return 5100;
		}
	}
	
	public double importeDescuento() {
		return sueldoBruto()*DESCUENTO;
	}
	
	public double sueldoNeto() {
		return sueldoBruto()-importeDescuento();
	}
	
	
}
