class LoopStatement {
    static class WhileLoop {
        static void whileLoop() {
            int count = 0;
            while (count < 10) {
                println(count);
                count++;
            }
        }
    }

    static class ForLoop {
        static void forLoop() {
            for (int i = 0; i < 10; i++) {
                println(i);
                if (i % 5 == 0)
                    break;
            }
        }
    }

    static class ForInLoop {
        static void forInLoop() {
            0..10.each { int i ->
                println(i)
            }
            def employee = ["Ken": 21, "John": 25, "Sally": 22];

            for (emp in employee) {
                println(emp);
            }
        }
    }

    static void main(String[] args) {
        WhileLoop.whileLoop();
        ForLoop.forLoop();
        ForInLoop.forInLoop();
    }
}
