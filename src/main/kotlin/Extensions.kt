

class ExpressionWrapper {
    operator fun plus(other: Any) {
        println(other.toString())
    }

    operator fun Any.unaryPlus() {
        print(this.toString())
    }
}