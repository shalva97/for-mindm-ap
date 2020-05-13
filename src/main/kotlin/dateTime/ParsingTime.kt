package dateTime

import org.joda.time.DateTime

fun main() {
    DateTime(1_589_400_537_123)
            .run(::println)

    DateTime(2020, 3,14,14,32)
            .run(::println)
}