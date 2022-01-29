class IfElseRunner {
    static void main(String[] args) {


        int x = 10
        boolean result = x > 0

        if (result) {
            println x
        }

        def person = new Person(10);

//****************************************
        if (person != null) {  //Java style
            person.getId()
        }

        person?.getId() //the same logic but groovy style
//****************************************
        if (x != null) {  // Java style
            println x

        } else {
            println 1
        }

//        def resultX = x != null ? x : 1 the same logic but groovy style
//        def resultX = x ? x : 1  //the same logic but groovy style
        def resultX = x ?: 1  //the same logic but groovy style

        println(resultX)

    }
}
