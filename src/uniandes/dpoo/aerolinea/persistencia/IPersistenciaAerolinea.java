package uniandes.dpoo.aerolinea.persistencia;
import java.io.IOException;

import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public class IPersistenciaAerolinea {
	
	public void cargarTiquetes( String archivo, Aerolinea aerolinea ) throws IOException, InformacionInconsistenteException;
	
	public void salvarTiquetes( String archivo, Aerolinea aerolinea ) throws IOException;
	
}
