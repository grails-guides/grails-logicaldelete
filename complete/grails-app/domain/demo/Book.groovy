package demo

import gorm.logical.delete.LogicalDelete
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Book implements LogicalDelete<Book> {
    String image
    String title
    String author
    String about
    String href
    static mapping = {
        about type: 'text'
    }
}