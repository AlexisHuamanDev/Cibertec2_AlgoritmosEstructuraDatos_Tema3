package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidad.Factura;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_3_1 extends JFrame implements ActionListener {
	
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
					Problema_3_1 frame = new Problema_3_1();
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
	public Problema_3_1() {
		setTitle("Problema_3_1");
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
		
		//Declare, cree e inicialice tres objetos de tipo Factura (con datos fijos) haciendo uso de los tres constructores.
		Factura f1 = new Factura("1265478564545","BULTEC SRL.",10,25.0);
		Factura f2 = new Factura("1234546367677","LINSANPLAST SAC");
		Factura f3 = new Factura();
		
		//Invoque a un método listado que reciba (como parámetro) la referencia a un objeto de tipo
		listado(f1);
		listado(f2);
		listado(f3);
		
		//Muestre el valor de la constante, la cantidad de objetos creados y
		//la suma de los importes facturados.
		
		imprimir("-------------------------------------------------");
		imprimir("Entidad : "+Factura.ENTIDAD);
		imprimir("Cantidad de objetos : "+Factura.getCantObjFactura());
		imprimir("Suma total de importes: "+Factura.getSumaImportesFacturados());
		imprimir("-------------------------------------------------");
	}
	private void listado(Factura f) {
		imprimir("DirMem: "+f);
		imprimir("RUC: "+f.getRuc());
		imprimir("Empresa : "+ f.getUnidades());
		imprimir("Precio : "+ f.getPrecioUnitario());
		imprimir("Importe total : "+f.importeFacturado());
		imprimir();
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