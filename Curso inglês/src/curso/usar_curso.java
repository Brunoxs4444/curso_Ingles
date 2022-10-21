package curso;
import java.util.Scanner;

public class usar_curso {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CursoInglês curso = new CursoInglês();
		int opcao;
		
		System.out.println("Escolha uma opção");
		opcao = in.nextInt();
		
		do {
			System.out.println("----ESCOLHA----");
			System.out.println("1-DISPONIBILIDADE");
			System.out.println("2-PREÇO");
			System.out.println("3-SAIR");
		
		}while(opcao!=1);
		

	}

}
