package actividades;
public class ActividadPileta extends Actividad{
  private boolean valido;

  public ActividadPileta(int id, String nombre, String profesor, String sala, boolean valido) {
    super(id, nombre, profesor, sala);
    this.valido = valido;
  }
}