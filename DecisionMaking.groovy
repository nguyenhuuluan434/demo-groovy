class DecisionMaking {
    static class IfStatement {
        static void ifStatement() {
            (1..10).each { i ->
                def x = i
                if (x % 2 == 0)
                    println(x)
            }
        }
    }

    static class IfElseStatement{
        static void ifElseStatement(){
            (1..10).each { i ->
                def x = i
                if (x % 2 == 0)
                    println("even")
                else
                    println("ood")
            }
        }
    }

    static void main(String[] args) {
        IfStatement.ifStatement();
        IfElseStatement.ifElseStatement();
    }
}
