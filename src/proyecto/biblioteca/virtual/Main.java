package proyecto.biblioteca.virtual;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scn = new Scanner(System.in);
        int contador = 1;   
        Login[] usuarios = new Login[10];
        
        usuarios[0] = new Login("admin", "admin","admin","Mago ancestral", 123, 0);
        usuarios[contador] = new Login("anyelo", "201807398", "Anyelo", "Hernández",
                247135992,1);
        // Crea el objeto de la ventana de login y le asigna los valores del vector usuario
        LoginUI loginui = new LoginUI(usuarios);
        // Abre la ventana login
        loginui.setVisible(true);
    }
}
