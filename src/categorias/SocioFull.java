package categorias;

import actividades.Actividad;

//Socio puede realizar cualquier cantidad de actividades
public class SocioFull extends Socio {

  public SocioFull(int id, String nombre) {
    super(id, nombre);
  }

  @Override
  public boolean validarActividad(Actividad actividad) {
    return true;
  }
}
