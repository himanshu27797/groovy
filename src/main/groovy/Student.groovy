import groovy.transform.ToString
import groovy.transform.TupleConstructor

//public class default
@ToString
@TupleConstructor
class Student implements WithId {

//private fields default

    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }
}
