
package pe.edu.upeu.syscenterlife.persistencia;

import pe.edu.upeu.syscenterlife.logica.Duenio;
import pe.edu.upeu.syscenterlife.logica.Mascota;


public class ControladoraPersistencia {
    
    DuenioJpaController dueniojpa = new DuenioJpaController();
    MascotaJpaController mascojpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //crear en la BD Dueño
        dueniojpa.create(duenio);
        
        //crear en la BD la mascota
        mascojpa.create(masco);
        
    }
}
