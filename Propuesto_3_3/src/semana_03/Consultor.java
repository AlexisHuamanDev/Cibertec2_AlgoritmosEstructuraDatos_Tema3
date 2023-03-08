package semana_03;

public class Consultor {
	private int codigo;
	private String nombre;
	private int horasTrabajadas;
	private double tarifaHora;
	
	private static int cantObjConsultor;
	private static double sueldoNetos;
	
	public static final double AFP;
	public static final double EPS;
	
	static {
		AFP = 0.10;
		EPS = 0.05;
		cantObjConsultor = 0;
		sueldoNetos =0.0;
		}

	//Constructor
	public Consultor(int codigo, String nombre, int horasTrabajadas,
			double tarifaHora) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
		
		cantObjConsultor++;
		sueldoNetos += sueldoNeto();
	}

	public Consultor(int codigo, String nombre, int horasTrabajadas) {
		this(codigo, nombre, horasTrabajadas, 65.0);
		
	}

	public Consultor() {
		this(333, "Juan", 30);
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

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}
	
		
	//Metodos  get/set para variables de clase
	
	public static int getCantObjConsultor() {
		return cantObjConsultor;
	}

	public static void setCantObjConsultor(int cantObjConsultor) {
		Consultor.cantObjConsultor = cantObjConsultor;
	}

	public static double getSueldoNetos() {
		return sueldoNetos;
	}

	public static void setSueldoNetos(double sueldoNetos) {
		Consultor.sueldoNetos = sueldoNetos;
	}
	
	//Operaciones publicas

	public double sueldoBruto() {
		return horasTrabajadas*tarifaHora;
	}
	
	public double descuentoAFP() {
		return sueldoBruto()*AFP;
	}
	
	public double descuentoEPS() {
		return sueldoBruto()*EPS;
	}
	
	public double sueldoNeto() {
		return sueldoBruto() - descuentoAFP() - descuentoEPS();
	}
	
		
	
	
}
