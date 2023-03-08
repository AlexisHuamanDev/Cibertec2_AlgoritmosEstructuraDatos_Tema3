package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Balon;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_2 extends JFrame implements ActionListener {
	
	DecimalFormat df = new DecimalFormat ("0.00");
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_3_2 frame = new Propuesto_3_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Propuesto_3_2() {
		setTitle("Propuesto_3_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
			
		Balon b1 = new Balon ("Nike",100,50,10,300);
		Balon b2 = new Balon ("Marca", 120 , 25);
		Balon b3 = new Balon();
		
		listado(b1);
		listado(b2);
		listado(b3);
		
		imprimir("----------------------------------");
		imprimir("Valor de PI: "+Balon.PI);
		imprimir("Factor de descuento: "+Balon.DESCUENTO);
		imprimir("Cantidad de objetos creados: "+Balon.getCantObjBalon());
		imprimir("Importe a pagar acumulado: S/"+Balon.getImportePagar());
		imprimir("----------------------------------");
	}
	private void listado(Balon b) {
		imprimir("Direccion de memoria: "+b);
		imprimir("Marca: "+ b.getMarca());
		imprimir("Peso: " + b.getPeso());
		imprimir("Presion: " + b.getPresion());
		imprimir("Diametro: "+b.getDiametro());
		imprimir("Precio: "+b.getPrecio());
		imprimir("Volumen del balon: "+ df.format(b.volumen()));
		imprimir("Descuento aplicado: " + b.descuento());
		imprimir("Importe a pagar: S/"+ b.importeAPagar());
		imprimir("");
	}

	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}