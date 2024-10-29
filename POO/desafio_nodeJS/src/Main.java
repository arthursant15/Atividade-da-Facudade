import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        ImprimeLivro imprimir = new ImprimeLivro();
        System.out.println("Quantos livros você deseja guardar? ");
        int l = digitar.nextInt();
        Livros[] livros = new Livros[l];


            int id = 0;
            int stop = 1;
            while (stop == 1){
                id = id+1;
                for (int i = 0; i < livros.length; i++) {
                    digitar.nextLine();
                    System.out.println("Digite o Titulo do Livro: ");
                    String titulo = digitar.nextLine();
                    System.out.println("Digite o Nome do Autor: ");
                    String autor = digitar.nextLine();
                    System.out.println("Digite o Gênero Literário: ");
                    String genero = digitar.nextLine();
                    System.out.println("Digite o Ano de Publicação: ");
                    int anoDePublicacao = digitar.nextInt();
                    digitar.nextLine();
                }

                digitar.close();
            }




    }
}