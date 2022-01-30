trait WithId {
    Integer id

    boolean vaildateId() {
        id > 0
    }
}