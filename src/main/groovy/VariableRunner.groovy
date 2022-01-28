import groovy.transform.CompileStatic

import java.time.LocalDate

class VariableRunner {

    @CompileStatic
    // check if method requares parameters
    static void main(String[] args) {


        Integer salary = 100
        String name = "Kirill"
//        new LocalDate();
        def lastName = "Ivan"
        def number = 2250705

        println number
    }
}
