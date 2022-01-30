class IteratesRunner {
    static void main(String[] args) {
        assert [1, 4, 5, 7, 9].any { it % 2 == 0 }
        assert [1, 4, 5, 7, 9].find() { it % 2 == 0 } == 4
        assert [1, 4, 5, 7, 9].findAll() { it % 2 != 0 } == [1, 5, 7, 9]
        assert (2..4).collect() == [2, 3, 4]

        assert ["asd", "sdf", "456", "12"].grep(~/\d+/) == ["456", "12"] //isCase switch
        assert ["asdaa", "sdf", "456", "12"].grep { it.length() > 4 } == ["asdaa"] //isCase switch

    }
}
