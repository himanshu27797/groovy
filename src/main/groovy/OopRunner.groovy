class OopRunner {
    static void main(String[] args) {

        def student = new Student()
        student.firstName = "Kate" //setter
        student.lastName = "White" //setter
        student.age = 20           //setter

        println(student.firstName) //getter
        println(student.lastName)  //getter
        println(student.age)       //getter

        def student1 = new Student(firstName: "Helen", lastName: "Black", age: 30)
        println(student1)

        Student student2 = ["Sveta", "Svetikova", 32]
        println(student2)


        def (fn, ln) = student2
        println(fn)
        println(ln)

      assert  [student1, student2].collect { it.firstName } == ["Helen","Sveta"]

    }
}
