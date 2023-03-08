package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_03.Consultor;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_3 extends JFrame implements ActionListener {
	
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
					Propuesto_3_3 frame = new Propuesto_3_3();
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
	public Propuesto_3_3() {
		setTitle("Propuesto_3_3");
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
		
		Consultor c1 = new Consultor(141414, "Pedro", 15	, 10);
		Consultor c2 = new Consultor(121212, "Luis", 100);
		Consultor c3 = new Consultor();
		
		listado(c1);
		listado(c2);
		listado(c3);
		
		imprimir("---------------------------------------");
		imprimir("Cantidad de objetos creados: "+ Consultor.getCantObjConsultor());
		imprimir("Factor de descuento AFP: "+Consultor.AFP);
		imprimir("Factor de descuento EPS: "+Consultor.EPS);
		imprimir("---------------------------------------");
		
	}
	private void listado(Consultor c) {
		
		imprimir("Direccion de memoria: "+c);
		imprimir("Codigo: " + c.getCodigo() );
		imprimir("Nombre: " + c.getNombre());
		imprimir("Horas trabajadas: "+c.getHorasTrabajadas());
		imprimir("Tarifa por hora: "+c.getTarifaHora() );
		imprimir("Sueldo Bruto: "+c.sueldoBruto());
		imprimir("Descuento AFP: "+c.descuentoAFP());
		imprimir("Descuento EPS: "+c.descuentoEPS());
		imprimir("Sueldo neto: "+c.sueldoNeto());
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