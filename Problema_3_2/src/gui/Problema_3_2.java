package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entidad.Empleado;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_3_2 extends JFrame implements ActionListener {
	
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
					Problema_3_2 frame = new Problema_3_2();
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
	public Problema_3_2() {
		setTitle("Problema_3_2");
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

		//Declare, cree e inicialice tres objetos de tipo Movil (con datos fijos) 
		//haciendo uso de los tres constructores.
		
		Empleado e1 = new Empleado (1212,"Alexis",0,988333222);
		Empleado e2 = new Empleado (1515,"Pedro");
		Empleado e3 = new Empleado();
		
		listado(e1);
		listado(e2);
		listado(e3);
		
		imprimir("-------------------------------------------");
		imprimir("Descuento "+Empleado.DESCUENTO);
		imprimir("Suma de sueldos netos: "+Empleado.getSumaTotalSueldosNeto());
		imprimir("Cantidad de objetos creados: "+Empleado.getCantObjEmpleado());
		
		
	}
	private void listado(Empleado e) {
		imprimir("DirMem: "+e);
		imprimir("Codigo: "+e.getCodigo());
		imprimir("Nombre: "+e.getNombre());
		imprimir("Numero Movil: "+e.getNumCelular());
		imprimir("Categoria: "+e.getCategoria());
		imprimir("Sueldo bruto: "+e.sueldoBruto());
		imprimir("Descuento: "+e.importeDescuento());
		imprimir("Sueldo neto: "+e.sueldoNeto());
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