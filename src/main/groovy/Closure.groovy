import groovy.lang.Closure as ClosureG

import java.util.function.Function
import java.util.stream.Stream

class Closure {
    static void main(String[] args) {


        Function<Integer, Integer> func = value -> value + value

        def result = func.apply(5) //5+5=10

        ClosureG closureWithNoParameters = { -> }

        ClosureG closureValue = {
            it = 99 ->  //default value
                print it
                it + it
        }


        def call = closureValue.call(5)
        println call

//        ClosureG closure = value -> value + value
//        Stream.of(1, 2, 3, 4)
//                .map(closure)
//                .map(String::valueOf)
//                .forEach(System.out::println)

        int x = 10
        check(x > 0, { println(x) })

    }

    static def check(boolean condition, ClosureG closure) {
        if (condition) {
            closure()
        }
    }
}
