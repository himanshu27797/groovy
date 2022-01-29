class SwitchRunner {
    static void main(String[] args) {
        def x = 5

        switch (x) {
            case String:
                println "String"
                break
            case 6:
                println 6
                break
            case 10:
                println "10"
                break
            case ~/\d+/:
                println "number"
                break
            case { it % 5 == 0 }:
                println "%5"
                break
            case [1, 3, 5, 8, 9]:
                println("1,3,5,9")
                break
            default:
                println "none"
                break
        }
    }
}
