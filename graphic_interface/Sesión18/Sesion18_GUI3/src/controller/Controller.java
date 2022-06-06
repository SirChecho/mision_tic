package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Agencia;
import view.VentanaPrincipal;

public class Controller implements ActionListener{
	
	public VentanaPrincipal vista;
	public Agencia agencia;
	
	public Controller() {
		vista = new VentanaPrincipal();
		agencia= new Agencia();
		asignarOyentes(); 
	}
	
	public void asignarOyentes() {
		vista.getPdatos().getLista_genero().addActionListener(this);
		//vista.getPdatos().getLista_nombre().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("LISTA1")) {
			vista.getPdatos().getLista_nombre().removeActionListener(this);
			vista.getPdatos().getLista_nombre().removeAllItems();
			int pos = vista.getPdatos().getLista_genero().getSelectedIndex();
			String g = vista.getPdatos().getLista_genero().getItemAt(pos);
			for (int i = 0; i < agencia.getTam(); i++) {
				if(agencia.obtenerPersona(i).getGenero().equals(g)) {
					vista.getPdatos().getLista_nombre().addItem(agencia.obtenerPersona(i).getNombre());
				}
			}
			vista.getPinformacion().getEnombre2().setText("");
			vista.getPinformacion().getEciudad2().setText("");
			vista.getPinformacion().getEtel2().setText("");
			vista.getPinformacion().getEmail2().setText("");
			vista.getPimagen().cambiarImagen("");
			vista.getPdatos().getLista_nombre().addActionListener(this);
		}else if(e.getActionCommand().equals("LISTA2")) {
			
			int pos2 = vista.getPdatos().getLista_nombre().getSelectedIndex();
			String n = vista.getPdatos().getLista_nombre().getItemAt(pos2);
			for (int i = 0; i < agencia.getTam(); i++) {
				if(agencia.obtenerPersona(i).getNombre().equals(n)) {
					String nombre = agencia.obtenerPersona(i).getNombre();
					vista.getPinformacion().getEnombre2().setText(nombre);
					String ciudad = agencia.obtenerPersona(i).getCiudad();
					vista.getPinformacion().getEciudad2().setText(ciudad);
					long tel = agencia.obtenerPersona(i).getTelefono();
					vista.getPinformacion().getEtel2().setText(""+tel);
					String email = agencia.obtenerPersona(i).getEmail();
					vista.getPinformacion().getEmail2().setText(email);
					String elem = agencia.obtenerPersona(i).getNfoto();
					vista.getPimagen().cambiarImagen(elem);
					i = agencia.getTam();
				}
			}
		}
	}
	
}
