/**
 * Realizar un programa llamado HiloSimple2 que cree un hilo que simplemente
 * muestre 10 veces el nombre del propio hilo. Usar implementación de la clase Runnable.
 */
package es.studium.Ejercicios;

/**
 * @author Alvca
 *
 */
public class Ejercicio02_HiloSimpleRunable implements Runnable{
String nombre;
	public Ejercicio02_HiloSimpleRunable(String n) {
		// TODO Auto-generated constructor stub
		this.nombre=n;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando el programa principal ");
		Ejercicio02_HiloSimpleRunable objRunnable1 = new Ejercicio02_HiloSimpleRunable("HiloSimple");
		Thread primero = new Thread (objRunnable1);
		primero.start();
		System.out.println("Termina el programa principal ");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Ejecutando el "+nombre+" nº de ejecucion: "+(i+1));
		}
		System.out.println("Termina el Hilo");
	}

}
