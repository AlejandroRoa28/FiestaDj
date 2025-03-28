import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DJ dj = DJ.getInstancia();
            
            System.out.println("🎉 Bienvenido a la fiesta 🎉");
            
            boolean continuar = true;
            while (continuar) {
                System.out.print("\n🎤 Ingresa tu nombre: ");
                String nombreUsuario = scanner.nextLine();
                
                Invitado usuario = new Invitado(nombreUsuario);
                
                System.out.print("🎵 ¿Qué canción quieres escuchar?: ");
                String cancion = scanner.nextLine();
                
                usuario.pedirCancion(cancion);
                
                System.out.print("\n¿Deseas agregar otra canción? (sí/no): ");
                String respuesta = scanner.nextLine().toLowerCase();
                if (respuesta.equals("no")) {
                    continuar = false;
                }
            }
            
            System.out.println("\n🎶 Lista final de reproducción:");
            dj.mostrarCola();
            System.out.println("\n🎵 Iniciando reproducción...");
            
            while (dj.hayCancionesEnCola()) {
                System.out.print("\nPresiona Enter para reproducir la siguiente canción...");
                scanner.nextLine();
                dj.reproducirSiguiente();
            }
            
            System.out.println("\n🎉 La fiesta ha terminado. ¡Gracias por participar! 🎉");
        }
    }
    }    