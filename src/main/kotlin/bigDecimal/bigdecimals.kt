package bigDecimal

import java.math.BigDecimal

fun main() {
    "123".toBigDecimal()
        .run(::println)

    ("222".toBigDecimal() == 222.toBigDecimal())
        .run(::println)

    (222.2.toBigDecimal() > 222.toBigDecimal())
        .run(::println)

    ("222".toBigDecimal() == 222.5.toBigDecimal())
        .run(::println)

    BigDecimal.ONE
    BigDecimal.TEN
    BigDecimal.ZERO

    BigDecimal.ONE.max(BigDecimal.TEN)
        .run(::println)
}

