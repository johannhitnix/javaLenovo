package form;

import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;


public class Eva5 extends JFrame implements ActionListener {
	static Respuesta form2 = new Respuesta();
	
	final static String[][] DB = { 
			{"51662369","Sandra Milena Castellanos Marín","Medicina","VI","3.5","4","3.3","3.5"},
            {"80223220","Luis Andrés Montoya Montoya","Ingeniería de Telecomunicaciones","IV","3","3.3","4.2","4.5"},
            {"79444555","Francisco Martínez Marin","Ingeniería de Alimentos","III","3.4","4.5","4.4","3"},
            {"79001003","Luis Francisco Castañeda Roa","Ingeniería de Sistemas","VIII","3.3","3.4","4.5","4.4"},
            {"79003003","Pedro José Pineda Pineda","Odontología","VI","4","4.1","3.9","4.5"},
            {"52900901","Ruth Paola Mahecha Mahecha","Odontología","VII","3.6","3.6","3.8","3.9"},
            {"26900345","Lucia Valderrama Pineda","Fisioterapia","VIII","4.4","4.5","4.1","3.1"},
            {"35676900","Mariela Lucia Olguín Ramírez","Medicina","V","3","3.1","4.6","3.7"},
            {"27101234","Lucila Peñaranda Peñaranda","Enfermería","II","2.5","4.6","3.4","4.6"},
            {"80231678","Milena Palacios Palacios","Ingeniería Mecánica","III","3.6","3.4","3.5","4.5"},
            {"1030617979","Luis Alberto Castellanos Frias","Odontología","VI","4","4.1","3.9","4.5"},
            {"1019066342","Nercy Aleidis Rengifo Rengifo","Fisioterapia","VII","3.6","3.6","3.8","3.9"},
            {"1014249436","Fabián Raúl Moreno Carvajal","Medicina","VIII","4.4","4.5","4.1","3.1"},
            {"1022380843","Jonathan Mauricio Baez Baez","Enfermería","V","3","3.1","4.6","3.7"},
            {"1012353083","Germán Dario Rodríguez Baez","Ingeniería Mecánica","II","2.5","4.6","3.4","4.6"},
            {"1030630231","Diego Fernando Giraldo Romero","Ingeniería de Petróleo","III","3.6","3.4","3.5","4.5"},
            {"1020765332","Luz Herminda Fonseca Daza","Psicología","VI","4","4.1","3.9","4.5"},
            {"1022357137","Rhonald Dahian Jiménez García","Ingeniería Civil","VI","3.5","4","3.3","3.5"},
            {"52263227","Edgar Andrés Bejarano Pérez","Ingeniería Civil","IV","3","3.3","4.2","4.5"},
            {"1013579638","Diego Fernando Bautista Gómez","Ingeniería Civil","III","3.4","4.5","4.4","3"},
            {"1030617979","Luis Alberto Jaime Hernández","Ingeniería  de Sistemas","II","4","4.1","3.9","4.5"},
            {"1019066342","Zabala Pereira Nercy Aleidys","Ingeniería Mecánica","V","3","3.3","4.2","4.5"},
            {"1014249436","Fabian Raul Duarte Serrano","Medicina","IV","3.6","3.6","3.8","3.9"},
            {"1022380843","Jhonatan Mauricio Rodríguez  C.","Ingeniería de Petróleos","I","3.4","4.5","4.4","3"},
            {"1012353083","German Dario González  Riaño","Ingeniería de Petróleos","III","3.4","4.5","4.4","3"},
            {"96040605441","Michael Duvan Beltran Salcedo","Medicina","IV","3","3.3","4.2","4.5"},
            {"1013641467","Romero Piña Dylan David","Fisioterapia","II","3.6","3.6","3.8","3.9"},
            {"1030632107","Ruben Dario Fuquene C.","Ingeniería Mecánica","V","3","3.3","4.2","4.5"},
            {"53072770","Maryory Cuesta Rodríguez","Ingeniería de Telecomunicaciones","IV","3","3.3","4.2","4.5"},
            {"1014245401","Cristian Camilo Ortiz Ortiz","Ingeniería de Telecomunicaciones","VI","2","3.1","4.8","1.5"},
            {"95070115361","Yuly Katherine Sierra","Ingeniería Mecánica","V","2.7","3.9","4.7","4.5"},
            {"1020796896","Daniel Andres Zapata Bello","Ingeniería Mecánica","IV","3","3.3","4.2","4.5"},
            {"1003819124","José Eitner Montiel  Aldana","Medicina","IV","3","3.3","4.2","4.5"},
            {"1031131906","Luis Guillermo Andrade Cifuentes","Medicina","VIII","3.9","3.8","2.6","4.5"},
            {"1019018284","Jairo Joel Noguera melo","Medicina","VIII","3.7","3.7","4.7","4"},
            {"1014218719","Bryan Andrés Ortegón","Medicina","IV","3","3.3","4.2","4.5"},
            {"1030611565","Mónica Andrea Plaza Bernal","Medicina","IV","3.6","3.8","4.8","4"}
            };
	
	private JButton btn1, btn2, btn3;
	static private JLabel l1, l2, l3, l4;
	private static JTextField t1;
	static String campo;
	static Eva5 form = new Eva5();
	
	public Eva5(){
		setLayout(null);		

		l1 = new JLabel("BASE DE DATOS ESTUDIANTIL");
		l1.setBounds(150, 50, 200, 30);
		add(l1);		

		l2 = new JLabel("Ingrese su numero de identificacion");
		l2.setBounds(30, 100, 300, 30);
		add(l2);		

		t1 = new JTextField();
		t1.setBounds(260, 100, 120, 30);
		add(t1);		
		
//		------ BOTONES -----
		
		btn1 = new JButton("Buscar");
		btn1.setBounds(390, 100, 100, 30);
		add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("Finalizar");
		btn2.setBounds(390, 150, 100, 30);
		add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("Limpiar");
		btn3.setBounds(280, 150, 100, 30);
		add(btn3);
		btn3.addActionListener(this);
		
//		---------------------

		l3 = new JLabel("Ingrese su numero de identificacion");
		l3.setBounds(30, 100, 300, 30);
		add(l3);	
		
		l4 = new JLabel("BASE DE DATOS ESTUDIANTIL");
		l4.setBounds(150, 50, 200, 30);
		add(l4);
	
	}
	
	public static void escondete(){
		form.setVisible(false);
	}
	
	public static void aparece(){
		form.setVisible(true);
	}
		
	public static String aLetras(String aux, int i) {
		String pal = "";
		switch (aux.charAt(i)) {
		case '1':
			pal += "uno";
			break;
		case '2':
			pal += "dos";
			break;
		case '3':
			pal += "tres";
			break;
		case '4':
			pal += "cuatro";					
			break;
		case '5':
			pal += "cinco";					
			break;
		case '6':
			pal += "seis";	
			break;
		case '7':
			pal += "siete";					
			break;
		case '8':
			pal += "ocho";					
			break;
		case '9':
			pal += "nueve";	
			break;
		case '0':
			pal += "cero";				
			break;
		default:			
			break;
		}
		return pal;
		
	}
	
	public static void limpiar(){
		t1.setText("");
	}
	
	@SuppressWarnings("deprecation")
	public static void core(String id) {
		float pro;		
		boolean encontrado = false;
		for(int i=0;i<37;i++) {
			if (id.equals(DB[i][0])) {
				
				escondete();
				
				form2.setBounds(800, 200, 520, 500);
				form2.setVisible(true);
				form2.setResizable(false);
			
				pro = Float.parseFloat(DB[i][4]) + Float.parseFloat(DB[i][5]) + Float.parseFloat(DB[i][6]) + Float.parseFloat(DB[i][7]);
				pro /= 4;					
			
				String aux = Float.toString(pro);
				String letras = "";
	
				letras += aLetras(aux, 0);												
				letras += " punto ";
				letras += aLetras(aux, 2);
				
				form2.setR(DB[i][0], DB[i][1], DB[i][2], DB[i][3], DB[i][4], DB[i][5], DB[i][6], DB[i][7], aux, letras.toUpperCase());
												
				encontrado = true;
				i = 99;
				
			}
															
		}
		if(!encontrado){
			form.hide();
			JOptionPane.showMessageDialog(null, "EL DOCUMENTO NO EXISTE!!!");
			form.show();
		}
	}
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException, NumberFormatException, NullPointerException {			
		
		form.setBounds(200, 200, 520, 250);
		form.setVisible(true);		
		form.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn2) System.exit(0);
		
		if(e.getSource() == btn1) {
			campo = t1.getText();
			core(campo);
		}
		
		if(e.getSource() == btn3) limpiar();
		
	}
}