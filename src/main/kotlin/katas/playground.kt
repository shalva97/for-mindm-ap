fun main() {
//    crap(arrayOf(charArrayOf('_','_','_','_'), charArrayOf('_','_','_','@'), charArrayOf('_','_','@', '_')), 2, 2)
//        .run(::println)

    charArrayOf('_', '_', '_', '_')
        .run(::println)

    listOf(charArrayOf('_', '_', '_', '_'), charArrayOf('_', '_', '_', '@'), charArrayOf('_', '_', '@', '_'))
        .joinToString { it.joinToString() }
        .filter { it == '@' || it == 'D' }
        .run(::println)

}

fun crap(x: Array<CharArray>, bags: Int, cap: Int): String {
    val rawData = x.toString().run(::println)


    TODO()
//    return when {
//        rawData.contains('D') -> "Dog!!"
//        rawData.contains('@') && rawData.size <= bags * cap -> "Clean"
//        else -> "Cr@p"
//    }
}