package demo

import groovy.transform.CompileStatic

@CompileStatic
class BookImage {
    Long id
    String image

    static BookImage of(Book b) {
        BookImage bookImage = new BookImage()
        bookImage.with {
            id = b.id
            image = b.image
        }
        bookImage
    }
}
