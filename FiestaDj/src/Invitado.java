public class Invitado {
    private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public void pedirCancion(String cancion) {
        DJ dj = DJ.getInstancia();
        System.out.println("🎤 " + nombre + " ha pedido la canción: " + cancion);
        dj.ponerCancion(cancion);
    }
}
