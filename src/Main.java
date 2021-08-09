/*
	Scrivere un applicazione che data una stringa in ingresso riconosca se sia palindroma o meno
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire la parola da controllare ");
		String s = input.nextLine();
		// Per estrarre un carattere dalla stringa potete usare il metodo charAt es: s = "pippo" char c = s.charAt(0) -> 'p'

		boolean palindroma = true;
		for(int i = 0, j = s.length() -1 ; i < j; i++, j--) {
			if(s.charAt(i) != s.charAt(j)) {
				palindroma = false;
				break;
			}
		}
		if(palindroma) {
			System.out.println("La parola è palindroma");
		} else {
			System.out.println("La parola non è palindroma");
		}
	}
}
