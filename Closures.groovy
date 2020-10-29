class Closures {
    static class ClosureClass {
        static void getType() {
            def x = { println("test") }
            println(x.getClass())
            println(x.getOwner())
            x.call()
        }
    }

    static class ClosuresParameter {
        static void functionParameter() {
            def clos = { param -> println("Hello ${param}") }
            clos.call("test")
        }
    }

    static class ClosureInMethod {
        def static Display(clos) {
            clos.call("Inner")
        }

        static void closureInMethod() {
            def str1 = "Hello";
            def clos = { param -> println "${str1} ${param}" }
            clos.call("World");

            // We are now changing the value of the String str1 which is referenced in the closure
            str1 = "Welcome";
            clos.call("World");
            ClosureInMethod.Display(clos)
        }
    }
    static class ClosureEach{
        static void closureEach(){
            def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
            mp.each {println it}
            mp.each {println "${it.key} maps to: ${it.value}"}
        }
    }

    static void main(String[] args) {
        ClosureClass.getType()
        ClosuresParameter.functionParameter()
        ClosureInMethod.closureInMethod();
        ClosureEach.closureEach()
    }
}
