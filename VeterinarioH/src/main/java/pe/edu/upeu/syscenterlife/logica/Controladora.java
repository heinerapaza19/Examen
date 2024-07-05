
package pe.edu.upeu.syscenterlife.logica;

import pe.edu.upeu.syscenterlife.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, 
            String observaciones, String alergico, String atenEsp, String nombreDuenio, 
            String nroCelular, String tipoMasco) {
        
        //Creamos el dueño y asigna los valores
        Duenio duenio = new Duenio();
        duenio.setId_duenio(0);
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(nroCelular);
        
        //Creamos la mascota y asigna los valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setTipoMascota(tipoMasco);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);
        
        
    }
}
