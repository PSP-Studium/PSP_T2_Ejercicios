/**
 * Realizar un programa llamado Nombres que, dada una matriz de cadenas
 * con los nombres de los 9 planetas del sistema solar, genere 3 hilos con dichos nombres
 * tomados de forma aleatoria. Cada hilo simplemente mostrará su nombre 5 veces por
 * pantalla, cuando le corresponda.
 */
package es.studium.Ejercicios;

import java.util.Random;

/**
 * @author Alvca
 *
 */
public class Ejercicio03_3HilosNombres extends Thread{
	String[] planetas = new String[]{ "Mercurio","Venus","Tierra","Marte","Júpiter","Saturno","Urano","Neptuno" };
	
	public Ejercicio03_3HilosNombres(String nombre)
	{
		super(nombre);
	}
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			Random r = new Random();
			int Low = 0;
			int High = 8;
			int Result = r.nextInt(High-Low) + Low;
			System.out.println("Ejecutando el "+getName()+ " " + planetas[Result]);
		}
		System.out.println("Termina el Hilo "+getName());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando el programa principal ");
		System.out.println("Iniciando el HiloSimple1");
		new Ejercicio03_3HilosNombres("HiloSimple1").start();
		System.out.println("Iniciando el HiloSimple2");
		new Ejercicio03_3HilosNombres("HiloSimple2").start();
		System.out.println("Iniciando el HiloSimple3");
		new Ejercicio03_3HilosNombres("HiloSimple3").start();
		System.out.println("Termina el programa principal ");
	}

}
