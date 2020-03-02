package org.certificatic.tarjetaDigital.Repository;
import java.util.List;

import org.certificatic.tarjetaDigital.Model.Tarjeta;

public interface TarjetaRepository {
	
	/**
	 * Metodo para crear una tarjeta nueva.
	 * @param tarjeta
	 * @return tarjeta creada
	 */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/**
	 * Metodo para obtener todas las tarjetas
	 * @return 
	 */
	List<Tarjeta> obtenerTodas();
	
	
	
}
