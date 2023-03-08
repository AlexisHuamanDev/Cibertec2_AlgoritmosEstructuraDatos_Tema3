package entidad;

public class Factura {
	//atributos privados
	private String ruc;
	private String empresa;
	private int unidades;
	private double precioUnitario;
	
	//Una variable privada de clase que cuente la cantidad de objetos tipo Factura creadas (int).
	private static int cantObjFactura;
	//Una variable privada de clase que acumule la suma de los importes facturados (double).
	private static double sumaImportesFacturados;
	//Una constante pública de clase (String).
	public static final String ENTIDAD;
	//Un bloque de inicialización static para asignarle a la constante el texto “Sunat” e inicializar con
	//cero las variables privadas de clase.
	static {
		ENTIDAD = "SUNAT";
		cantObjFactura = 0;
		sumaImportesFacturados = 0.0;
			}
	
	//constructores
	public Factura(String ruc, String empresa, int unidades,
			double precioUnitario) {
		
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnitario = precioUnitario;
		//cuente la cantidad de objetos facturados
		cantObjFactura ++;
		//acumule los importes facturados
		sumaImportesFacturados +=importeFacturado();
	}

	public Factura(String ruc, String empresa) {
		this(ruc, empresa, 10,50.0);		
	}
	
	public Factura() {
		this("11111111111","MN-Global SRL");
	}

	//Metodos get/set
	
	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	//Metodos de acceso para variables privadas de clase 
	public static int getCantObjFactura() {
		return cantObjFactura;
	}

	public static void setCantObjFactura(int cantObjFactura) {
		Factura.cantObjFactura = cantObjFactura;
	}


	public static double getSumaImportesFacturados() {
		return sumaImportesFacturados;
	}

	public static void setSumaImportesFacturados(double sumaImportesFacturados) {
		Factura.sumaImportesFacturados = sumaImportesFacturados;
	}
	
	//operaciones publicas 
	//Un método que retorne el importe facturado (unidades * precio unitario).

	public double importeFacturado() {
		return unidades * precioUnitario;
	}
			
	
	
	
	
	
	
	
	
	
	
	
}