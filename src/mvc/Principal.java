package mvc;

public class Principal 
{

	public static void main(String[] args)
	{
		Vista objetoVista = new Vista();
		Modelo objetoModelo = new Modelo();
		
		
		
		new Controlador(objetoVista, objetoModelo);

	}

}
