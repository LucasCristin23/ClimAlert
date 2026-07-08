package ar.edu.utn.edu.lucas_cristin.sistema_climalert.scheduler;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.MedicionService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AnalizarInformacionScheduler {
    private MedicionService medicionService;

    @Scheduled(fixedRate = 5000)
    public void analizarInformacion() {
        medicionService.consultarMedicion();
    }
}
