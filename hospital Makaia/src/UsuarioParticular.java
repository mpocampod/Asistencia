public class UsuarioParticular extends Usuario {

    // Se toman los datos del usuario del metodo padre
    public UsuarioParticular(String nombre, String apellido, int cedula, String correo) {
        super(nombre, apellido, cedula, correo);
    }

    // método hijo que va a sobreescribir el obtener el tipo de usuario
    @Override
    public String obtenerTipo() {
        return "Particular";
    }

}
