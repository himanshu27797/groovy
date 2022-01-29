class ListRunner {

    static void main(String[] args) {

        def list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 7, 7, 7]
        assert list.getClass() == ArrayList

        //read

        assert list[2] == 3
        assert list.get(2) == 3
        //    assert list[-1] == 10
        assert list[0..2] == [1, 2, 3]
        assert list[100] == null

        //write

        list += 404
        list << 11 << 13

        list -= 7
        println(list)

        list -= [1, 3]

        list *= 3
        println(list)

        list.push(999)

        println(list)
        assert list.last() == 13

        assert [1, 2, 3].reverse() == [3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]

        def(a,b,c) = [1,2,3,4,]
        assert  a==1
        assert  b==2
        assert  c==3




    }

}

