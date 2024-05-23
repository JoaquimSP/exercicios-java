import java.util.Scanner;

public class CadastroFuncionario {
    public static void main(String[] args) {
        System.out.println("Cadastre um funcionário: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        if(idade < 18){
            System.out.println("Infelizmente não poderemos seguir com o cadastro desse funcionário pois ele é menor de idade!");
        } else {
            System.out.println("--- Funcionário cadastrado com sucesso! ---");
            System.out.println("Nome do funcionário: " + nome);
            System.out.println("Idade: " + idade);
        }
    }
}
