package com.vaxi.spring_boot_microservice_1_inmueble.Service;

import com.vaxi.spring_boot_microservice_1_inmueble.Repository.InmuebleRepository;
import com.vaxi.spring_boot_microservice_1_inmueble.model.Inmueble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService {

    @Autowired
    private InmuebleRepository inmuebleRepository;

    @Override
    public Inmueble saveInmueble(Inmueble inmueble){

        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long inmuebleId)
    {
        inmuebleRepository.deleteById(inmuebleId);
    }

    @Override
    public List<Inmueble> findAllInmuebles()
    {
        return inmuebleRepository.findAll();
    }
}
