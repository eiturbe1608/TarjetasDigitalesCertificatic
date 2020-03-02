package org.certificatic.tarjetaDigital.Repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.tarjetaDigital.Model.Tarjeta;

public class TarjetaRepositoryImp implements TarjetaRepository{

	private static List<Tarjeta> tarjetasDigitales= new ArrayList<Tarjeta>();                     
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		System.out.println("Crear Tarjeta::::");
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		System.out.println("::::Obtener todas las tarjetas");
		return tarjetasDigitales;
	}
	
}
