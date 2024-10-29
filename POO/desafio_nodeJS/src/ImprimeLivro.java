public class ImprimeLivro {
    public void Imprimir(Livros livros){
        System.out.println("________________________");
        System.out.println("ID: " +livros.id);
        System.out.println("Titulo: " +livros.titulo);
        System.out.println("Autor: " +livros.autor);
        System.out.println("Gênero: " +livros.genero);
        System.out.println("Ano de Publicação: " +livros.anoDePublicacao);
    }
}
