package E1.Main;

import E1Test.ClassesTest.Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("El camino");
        library.addBook("Marina");
        library.addBook("Plenilunio");
        library.addBook("La casa de Bernarda Alba");
        library.addBook("Cien años de soledad");

        System.out.println("Lista de libros:");
        System.out.println(library);

        System.out.println("\nLibro en la posición 2:");
        System.out.println(library.getBook(2));

        library.addBookToIndex(2, "Fahrenheit 451");
        System.out.println("\nLista después de añadir 'Fahrenheit 451' en la posición 2:");
        System.out.println(library);

        library.removeBook("Cien años de soledad");
        System.out.println("\nLista después de eliminar 'Cien años de soledad':");
        System.out.println(library);
    }
}