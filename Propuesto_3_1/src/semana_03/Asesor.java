package semana_03;

public class Asesor {
		private String nombreAsesor;
		private int asesorDNI;
		private int codigo;
		private double remunDolares;
		
		private static int cantObjAsesor;
		private static double sumaRemun;
		public static final String NOMBREINSTITUCION;
		
		// Bloque inicializacion
		static {
			NOMBREINSTITUCION = "Cibertec";
			cantObjAsesor = 0;
			sumaRemun = 0.0;
		}

		//Constructores 
		public Asesor(String nombreAsesor, int asesorDNI, int codigo,
				double remunDolares) {
			super();
			this.nombreAsesor = nombreAsesor;
			this.asesorDNI = asesorDNI;
			this.codigo = codigo;
			this.remunDolares = remunDolares;
			
			cantObjAsesor++;
			sumaRemun+= getRemunDolares();
		}

		public Asesor(String nombreAsesor, int asesorDNI) {
			this(nombreAsesor, asesorDNI, 55555, 2000);
			
		}
		
		public Asesor() {
			this("N N", 88888888);
		}
		
		//Metodos get/set
		public String getNombreAsesor() {
			return nombreAsesor;
		}

		public void setNombreAsesor(String nombreAsesor) {
			this.nombreAsesor = nombreAsesor;
		}

		public int getAsesorDNI() {
			return asesorDNI;
		}

		public void setAsesorDNI(int asesorDNI) {
			this.asesorDNI = asesorDNI;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public double getRemunDolares() {
			return remunDolares;
		}

		public void setRemunDolares(double remunDolares) {
			this.remunDolares = remunDolares;
		}

		
		//Metodos get/set para variables de clase
		public static int getCantObjAsesor() {
			return cantObjAsesor;
		}

		public static void setCantObjAsesor(int cantObjAsesor) {
			Asesor.cantObjAsesor = cantObjAsesor;
		}

		public static double getSumaRemun() {
			return sumaRemun;
		}

		public static void setSumaRemun(double sumaRemun) {
			Asesor.sumaRemun = sumaRemun;
		}
		
		
		
		
		
		
		
		
}
