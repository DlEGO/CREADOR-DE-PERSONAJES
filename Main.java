import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

	Personaje character = new Personaje();
	  
	Scanner input = new Scanner(System.in);
	
    System.out.println("Bienvenido a The Game, por favor inserte el nombre de su personaje:");

	character.setNombrePersonaje(input.nextLine());
	System.out.println("Bienvenido "+character.getNombrePersonaje()+", ahora escoge la clase de tu héroe:");
  }
}