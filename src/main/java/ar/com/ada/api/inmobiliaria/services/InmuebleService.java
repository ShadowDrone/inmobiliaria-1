package ar.com.ada.api.inmobiliaria.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.inmobiliaria.entities.Inmueble;
import ar.com.ada.api.inmobiliaria.entities.Locador;
import ar.com.ada.api.inmobiliaria.repo.InmuebleRepository;

/**
 * InmuebleService
 */
@Service
public class InmuebleService {
    @Autowired
    InmuebleRepository inmuebleRepo;

    @Autowired
    LocadorService locadorService;

    public Inmueble CrearInmueble(int locadorId, String tipoInmueble, int cantAmb, String direccion, int superficie,
            int cantDormitorio, boolean aptoProf, String disposicion, int cantBanios, int antiguedadAnios) {

        Locador loc = locadorService.buscarPorId(locadorId);
        Inmueble inm = new Inmueble();

        inm.setTipoInmueble(tipoInmueble);
        inm.setCantAmb(cantAmb);
        inm.setDireccion(direccion);
        // falta agregar reservado boolean
        inm.setSuperficie(superficie);
        inm.setCantDormitorio(cantDormitorio);
        inm.setAptoProf(aptoProf);
        inm.setDisposicion(disposicion);
        inm.setCantBanios(cantBanios);
        inm.setAntiguedadAnios(antiguedadAnios);

        // falta agregar union con usuario
        loc.agregarInmueble(inm);
        inmuebleRepo.save(inm);
        return inm;

    }

}