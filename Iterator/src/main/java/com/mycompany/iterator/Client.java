/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

/**
 *
 * @author manos
 */
public class Client {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("El Principito", "Antoine de Saint-Exupéry"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Cien Años de Soledad", "Gabriel García Márquez"));

        Iterator<Book> iterator = library.createIterator();

        System.out.println(" Libros en la biblioteca:");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("- " + book.getTitle() + " (" + book.getAuthor() + ")");
        }
    }
}
