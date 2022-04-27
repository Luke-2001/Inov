import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        int idade;
        Scanner f = new Scanner(System.in);

        System.out.print("Informe o Nome do Aluno: ");
        pessoa.setNome(f.nextLine());
        System.out.println("Nome do Aluno é: " + pessoa.nome + ".\n");

        System.out.print("Informe o seu Ano de Nascimento: ");
        pessoa.setDataNasc(f.nextInt());

        pessoa.setAno(2022);
        idade = pessoa.Ano - pessoa.getDataNasc();

        System.out.println("O aluno possui: " + idade + " Anos de idade ou irá fazer.");


    }
}
