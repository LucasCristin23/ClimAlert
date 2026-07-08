package ar.edu.utn.edu.lucas_cristin.sistema_climalert.scheduler;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.MedicionService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ObtenerInformacionScheduler {
    private final MedicionService medicionService;

    public ObtenerInformacionScheduler(MedicionService medicionService) {
        this.medicionService = medicionService;
    }

    @Scheduled(fixedRate = 1000)
    public void obtenerInformacion() {
        medicionService.consultarMedicion();
    }
}
