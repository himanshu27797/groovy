import groovy.io.FileType

class IORunner {
    static void main(String[] args) {

        def file = new File(".gitignore")

//        println input.text     //stream

//        input.each { line -> println(line) } // each line

        file.withInputStream {          //read bytes
            def allText = new String(it.readAllBytes())
            println(allText)
        }

//        def writer = new StringWriter()
//
//        try (def reader = file.newReader()) {
//            writer << reader
//        }

        //write
        def file2 = new File("text.txt")
        file2.text = "Some text"
        file2 << "New line" << System.lineSeparator()


        def scrDir = new File("src")
//        scrDir.eachDir { println(it) }
        scrDir.eachDirRecurse { println(it) }   //all files

        scrDir.eachFile (FileType.FILES){println(it)}

    }

}
