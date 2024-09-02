package LIVRARIA;
public class Livro {
String titulo;
int numeroPaginas;
String genero;
int anoPublicado;
double preco;
String autor;

public void mostrarLivro() {
    System.out.println("Titulo: " + titulo);
    System.out.println("Paginas: " + numeroPaginas);
    System.out.println("Genero: " + genero);
    System.out.println("Publicado em: " +anoPublicado);
    System.out.println("Preco: R$ " + preco);
    System.out.println("Autor: " + autor);
}
}