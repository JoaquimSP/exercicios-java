import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String nome, sobren, cidade;
		int idade;
		double peso;
		
		Scanner a = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = a.next();
		
		System.out.println("Digite seu sobrenome: ");
		sobren = a.next();
		
		System.out.println("Digite sua idade: ");
		idade = a.nextInt();
		
		System.out.println("Digite seu peso (OBS: Utilize a vírgula): ");
		peso = a.nextDouble();
		
		a.nextLine();
		System.out.println("Digite sua cidade: ");
		cidade = a.nextLine();
		
		System.out.println();
		System.out.println("----- Imprimindo todos os dados ------");
		System.out.println();
		System.out.printf("Nome completo: %s %s %n", nome, sobren);
		System.out.println("Idade: " +idade);
		System.out.println("Peso: " +peso);
		System.out.println("Cidade: " +cidade);
		
		a.close();
	}
}
