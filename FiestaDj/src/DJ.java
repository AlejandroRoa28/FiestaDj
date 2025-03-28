import java.util.LinkedList;
import java.util.Queue;

public class DJ {
    private static DJ instancia;
    private Queue<String> colaCanciones;

	public Queue<String> getColaCanciones() {
		return this.colaCanciones;
	}

	public void setColaCanciones(Queue<String> colaCanciones) {
		this.colaCanciones = colaCanciones;
	}
 

    private DJ() {
        colaCanciones = new LinkedList<>();
    }

    public static DJ getInstancia() {
        if (instancia == null) {
            instancia = new DJ();
        }
        return instancia;
    }

    public void ponerCancion(String cancion) {
        if (cancion.trim().isEmpty()) {
            System.out.println("⚠ No puedes reproducir una canción vacía.");
            return;
        }
        colaCanciones.offer(cancion);
        System.out.println("🎶 Se ha agregado a la cola: " + cancion);
    }

    public void reproducirSiguiente() {
        if (!colaCanciones.isEmpty()) {
            String cancionActual = colaCanciones.poll(); // Sacar la primera canción de la cola
            System.out.println("🎵 Ahora suena: " + cancionActual);
        } else {
            System.out.println("📜 No hay más canciones en la cola.");
        }
    }

    public void mostrarCola() {
        if (colaCanciones.isEmpty()) {
            System.out.println("📜 No hay canciones en la cola.");
            return;
        }
        System.out.println("\n🎶 Canciones en cola:");
        for (String song : colaCanciones) {
            System.out.println("🎵 " + song);
        }
    }

    public boolean hayCancionesEnCola() {
        return !colaCanciones.isEmpty();
    }
}
