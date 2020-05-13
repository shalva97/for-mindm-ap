package dateTime

import org.joda.time.DateTime

fun main() {
    DateTime.now()
            .run(::println)

    DateTime.now().millis
            .run(::println)
}