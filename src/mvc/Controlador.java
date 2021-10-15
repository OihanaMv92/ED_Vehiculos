package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	// Creamos los objetos
	Vista objetoVista = null;
	Modelo objetoModelo = null;


	// Aqui ponemos el constructor con parametros que son las clases de arriba. Siempre vista y modelo.
	public Controlador(Vista objetoVista, Modelo objetoModelo) {
		// Este es el atributo de clase por eso añadimos el this
		this.objetoVista = objetoVista;
		this.objetoModelo = objetoModelo;
		// Utilizamos el obj vista para llamar ala ventana. (FRAME)
		// Añadir el Listener a la ventana
		objetoVista.addWindowListener(this);

		// Añadir Listener al botón
		objetoVista.calcular.addActionListener(this);

	}


	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// llamamos al objetoVista para quitar errores ya que perteneze a la clase vista.
		int presupuesto = 0;

		if (objetoVista.uno.getState() == true) {
			objetoModelo.presupuesto(7000); // Sustituir la linia por que la metimos en el modelo.
		}
		if (objetoVista.dos.getState() == true) {
			objetoModelo.presupuesto(8000);

		}
		if (objetoVista.tres.getState() == true) {
			objetoModelo.presupuesto(9000);
		}
		if (objetoVista.cuatro.getState() == true) {
			objetoModelo.presupuesto(8500);
		}
		if (objetoVista.cinco.getState() == true) {
			objetoModelo.presupuesto(2000);
		}
		if (objetoVista.seis.getState() == true) {
			objetoModelo.presupuesto(3000);
		}
		if (objetoVista.siete.getState() == true) {
			objetoModelo.presupuesto(2500);
		}
		if (objetoVista.ocho.getState() == true) {
			objetoModelo.presupuesto(1500);
		}
		System.out.println(presupuesto + " €");

	}

	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

}
