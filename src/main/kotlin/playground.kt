import java.lang.StringBuilder
import java.lang.ref.WeakReference
import java.security.MessageDigest
import java.util.*

fun main() {
//    fun <T>curry(f: (T, T) -> T, x: T): (T) -> T {
//        return fun (y: T) = f(x, y)
//    }

    val myGreetClass = someClassLikeFunction("gamarjoba")

    myGreetClass.invoke("world")
    myGreetClass.invoke("world")
    myGreetClass.invoke("world")
    myGreetClass.invoke("world")


}

fun someClassLikeFunction(greeting: String): (String) -> Unit {
    var executed: Int = 0
    return fun(greetTo: String) {
        executed += 1
        print(greeting + greetTo + executed)
    }
}