package semana_03;

public class Movil {
	private int numeroMovil;
	private String cliente;
	private int segConsumidos;
	private double precioSegundo;
	
	private static int cantObjMovil;
	private static int sumaImportePagar;
	public static final double IGV;
	
	static {
		IGV = 0.18;
		cantObjMovil = 0;
		sumaImportePagar = 0 ;
		}

	//Constructores
	
	public Movil(int numeroMovil, String cliente, int segConsumidos,
			double precioSegundo) {
		
		this.numeroMovil = numeroMovil;
		this.cliente = cliente;
		this.segConsumidos = segConsumidos;
		this.precioSegundo = precioSegundo;
		
		cantObjMovil ++;
		sumaImportePagar += importePagar();
	}

	public Movil(int numeroMovil, String cliente) {
		this(numeroMovil, cliente, 75, 0.28);
	}
	
	public Movil() {
		this(987656789, "Juan");
	}
	
	//Metodos get/set
	public int getNumeroMovil() {
		return numeroMovil;
	}

	public void setNumeroMovil(int numeroMovil) {
		this.numeroMovil = numeroMovil;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getSegConsumidos() {
		return segConsumidos;
	}

	public void setSegConsumidos(int segConsumidos) {
		this.segConsumidos = segConsumidos;
	}

	public double getPrecioSegundo() {
		return precioSegundo;
	}

	public void setPrecioSegundo(double precioSegundo) {
		this.precioSegundo = precioSegundo;
	}

	//Metodos get/set para variables privadas de clase 
	
	public static int getCantObjMovil() {
		return cantObjMovil;
	}

	public static void setCantObjMovil(int cantObjMovil) {
		Movil.cantObjMovil = cantObjMovil;
	}

	public static int getSumaImportePagar() {
		return sumaImportePagar;
	}

	public static void setSumaImportePagar(int sumaImportePagar) {
		Movil.sumaImportePagar = sumaImportePagar;
	}
	
	//Operaciones publicas
	
	public double costoConsumo () {
		return segConsumidos*precioSegundo;
	}
	
	public double impuestoIGV() {
		return costoConsumo()*IGV;
	}
	
	public double importePagar() {
		return costoConsumo()+impuestoIGV();
	}
	
	

	
	
	
}
