package org.certificatic.tarjetaDigital.Service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.Model.Tarjeta;
import org.certificatic.tarjetaDigital.Repository.TarjetaRepository;
import org.certificatic.tarjetaDigital.Repository.TarjetaRepositoryImp;

@WebService(endpointInterface = "org.certificatic.tarjetaDigital.Service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService {
	
	TarjetaRepository tarjetaRepository=new TarjetaRepositoryImp();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		return tarjetaRepository.obtenerTodas();
	}

	
	
	
}
