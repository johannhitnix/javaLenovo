package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Respuesta extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	static Eva5 form = new Eva5();
	
	static private JLabel l1, l2, l4, l3, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22;
	static private JButton btn;
	public Respuesta() {
//		------DATOS------
		btn = new JButton("Ok");
		btn.setBounds(240, 400, 120, 30);
		add(btn);
		btn.addActionListener(this);
		
		l1 = new JLabel("REPORTE CONSULTA");
		l1.setBounds(150, 50, 200, 30);
		add(l1);	
		
		l3 = new JLabel("REPORTE CONSULTA");
		l3.setBounds(150, 50, 200, 30);
		add(l3);
		
		l4 = new JLabel ("Nombres y Apellidos");
		l4.setBounds(30,130,300,30);
		add(l4);
		
		l5 = new JLabel ("programa de formacion");
		l5.setBounds(30,160,300,30);
		add(l5);
		
		l6 = new JLabel("Semestre");
		l6.setBounds(30, 190, 300, 30);		
		add(l6);
		
		l7 = new JLabel ("Materia1");
		l7.setBounds(30,220,300,30);		
		add(l7);
		
		l8 = new JLabel("Materia2");
		l8.setBounds(30, 250, 300, 30);
		add(l8);
		
		l9 = new JLabel("Materia3");
		l9.setBounds(30, 280, 300, 30);
		add(l9);
		
		l10 = new JLabel("Materia4");
		l10.setBounds(30, 310, 300, 30);
		add(l10);		

		l11 = new JLabel("promedio:");
		l11.setBounds(30, 340, 300, 30);
		add(l11);

//		------------------------
		
		l12 = new JLabel("Identificacion");
		l12.setBounds(30, 100, 300, 30);
		add(l12);
		
		
//		-------RESPUESTAS-------
		
//		id
		l13 = new JLabel();
		l13.setBounds(240, 100, 300, 30);
		add(l13);
		
//		nombres
		l14 = new JLabel();
		l14.setBounds(240, 130, 300, 30);
		add(l14);
		
//		programa
		l15 = new JLabel();
		l15.setBounds(240, 160, 300, 30);
		add(l15);
		
//		semestre
		l16 = new JLabel();
		l16.setBounds(240, 190, 300, 30);
		add(l16);
		
//		materia1
		l17 = new JLabel();
		l17.setBounds(240, 220, 300, 30);
		add(l17);
		
//		materia2
		l18 = new JLabel();
		l18.setBounds(240, 250, 300, 30);
		add(l18);
		
//		materia3
		l19 = new JLabel();
		l19.setBounds(240, 280, 300, 30);
		add(l19);
		
//		materia4
		l20 = new JLabel();
		l20.setBounds(240, 310, 300, 30);
		add(l20);
		
//		promedio
		l21 = new JLabel();
		l21.setBounds(240, 340, 300, 30);
		add(l21);
		
//		palabras
		l22 = new JLabel();
		l22.setBounds(240, 370, 300, 30);
		add(l22);
		
//		hack
		l2 = new JLabel();
		l2.setBounds(240, 300, 300, 30);
		add(l2);
		
	}
	
	public void setR(String e13, String e14, String e15, String e16, String e17, String e18, String e19, String e20, String e21, String e22){
		l13.setText(e13);
		l14.setText(e14);
		l15.setText(e15);
		l16.setText(e16);
		l17.setText(e17);
		l18.setText(e18);
		l19.setText(e19);
		l20.setText(e20);
		l21.setText(e21);
		l22.setText(e22);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn){
			this.setVisible(false);
			Eva5.aparece();
		}

		
	}
}
