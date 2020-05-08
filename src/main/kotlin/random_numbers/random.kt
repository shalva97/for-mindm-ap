package random_numbers

import kotlin.random.Random

fun main() {
    Random.nextInt()
        .run(::println)

    val myRand = Random(123)
    myRand.nextBoolean()
        .run(::println)

    Random.nextBits(8)
//        .toString(2)
        .run(::println)

    ('a'..'z').random(Random(123222))
        .run(::println)
}





