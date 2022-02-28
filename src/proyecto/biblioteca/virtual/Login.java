
package proyecto.biblioteca.virtual;

/**
 *
 * @author anyelo
 */
public class Login {
    //  Atributos
    String usuario, password, nombre_usuario, apellido_usuario;
    int dpi, rol;
    
    //  Metodos
    //  Metodo constructor
    public Login(String usuario, String password, String nombre_usuario, 
            String apellido_usuario, int dpi, int rol){
        this.usuario = usuario;
        this.dpi = dpi;
        this.password = password;
        this.rol = rol;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
    }
    
    //  Asigna el usuario
    public void setUsuario(){
        this.usuario = usuario;
    }
    // Obtiene el usuario
    public String getUsuario(){
        return usuario;
    }
    
    //  Asigna el nombre del usuario
    public void setNombreUsuario(String nombre_usuario){
        this.nombre_usuario = nombre_usuario;
    }
    //  Obtiene el nombre de usuario
    public String getNombreUsuario(){
        return nombre_usuario;
    }
    
    //  Asigna el nombre del usuario
    public void setApellidoUsuario(String apellido_usuario){
        this.apellido_usuario = apellido_usuario;
    }
    //  Obtiene el apellido de usuario
    public String getApellidoUsuario(){
        return apellido_usuario;
    }
    
    // Asigna la contraseña
    public void setPassword(){
        this.password = password;
    }
    // Devuelve la contraseña
    public String getPassword(){
        return password;
    }
    
    // Asigna el DPI
    public void setDpi(){
        this.dpi = dpi;
    }
    //  Devuelve el DPI
    public int getDpi(){
        return dpi;
    }
    
    //  Asigna el rol
    public void setRol(){
        this.rol = rol;
    }
    //  Devuelve el rol
    public int getRol(){
        return rol;
    }
    
}
