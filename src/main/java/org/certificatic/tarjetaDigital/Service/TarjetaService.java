package org.certificatic.tarjetaDigital.Service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.Model.Tarjeta;

@WebService
public interface TarjetaService {
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
