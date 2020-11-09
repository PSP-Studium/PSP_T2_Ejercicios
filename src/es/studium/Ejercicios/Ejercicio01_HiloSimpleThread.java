package es.studium.Ejercicios;
/**
 *  Realizar un programa llamado HiloSimple que cree un hilo que simplemente
 *  muestre 10 veces el nombre del propio hilo. Usar herencia de la clase Thread.
 */

/**
 * @author Alvca
 *
 */
public class Ejercicio01_HiloSimpleThread extends Thread{
	public Ejercicio01_HiloSimpleThread(String nombre)
	{
		super(nombre);
	}
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Ejecutando el "+getName()+" nº de ejecucion: "+(i+1));
		}
		System.out.println("Termina el Hilo "+getName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando el programa principal ");
		new Ejercicio01_HiloSimpleThread("HiloSimple").start();
		System.out.println("Termina el programa principal ");
	}
}
