package semana_03;

public class Balon {
	
		private String marca;
		private double peso;
		private double presion;
		private double diametro;
		private double precio;
		
		private static int cantObjBalon;
		private static double importePagar;
		
		public static final double PI;
		public static final double DESCUENTO;
		
		static {
			PI = 3.1416;
			DESCUENTO = 0.05;
				}
		
		//CONSTRUCTORES
		public Balon(String marca, double peso, double presion, double diametro,
				double precio) {
			super();
			this.marca = marca;
			this.peso = peso;
			this.presion = presion;
			this.diametro = diametro;
			this.precio = precio;
			
			cantObjBalon++;
			importePagar +=importeAPagar();
		}

		public Balon(String marca, double peso, double presion) {
			this(marca, peso, presion, 18.5, 100.0);
			}

		public Balon() {
			this("Adidas", 1.5, 4.8);
		}

		//Metodos get/set
		
		public String getMarca() {
			return marca;
		}

		
		public void setMarca(String marca) {
			this.marca = marca;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public double getPresion() {
			return presion;
		}

		public void setPresion(double presion) {
			this.presion = presion;
		}

		public double getDiametro() {
			return diametro;
		}

		public void setDiametro(double diametro) {
			this.diametro = diametro;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		//Metodos de aceseso get/set atributos privados

		public static int getCantObjBalon() {
			return cantObjBalon;
		}

		public static void setCantObjBalon(int cantObjBalon) {
			Balon.cantObjBalon = cantObjBalon;
		}

		public static double getImportePagar() {
			return importePagar;
		}

		public static void setImportePagar(double importePagar) {
			Balon.importePagar = importePagar;
		}
		
		//Operaciones publicas
		
		public double radio() {
			return diametro/2;
		}
		
		public double volumen() {
			return (radio()*radio()*radio()*4*PI/3);
		}
		
		public double descuento() {
			return precio*DESCUENTO;
		}
		
		public double importeAPagar () {
			return precio- descuento();
		}
		
		
}
