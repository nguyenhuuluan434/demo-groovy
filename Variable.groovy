class Variable {
    private static final def x = 4;

    public static void main(String[] args) {
        //native syntax
        int x = 4;
        println(x.getClass());
        // using the def keyword
        def y = 4;
        println(y.getClass())

        def r = 5..10;

        r.iterator().forEachRemaining(i -> println(i))
    }
}
