package hashing_algorithms

import java.security.MessageDigest

fun main() {
//    val data = "aaa";
    val data = "asdasdd";
//    val md = MessageDigest.getInstance("md5")
    val md = MessageDigest.getInstance("SHA-256")
    md.digest(data.toByteArray())
        .also { printAsHex(it) }

    md.update('a'.toByte())
    md.update('a'.toByte())
//    md.reset()
    md.update('a'.toByte())
    md.digest()
        .also { printAsHex(it) }

    md.digest(data.toByteArray())
        .also { printAsHex(it) }
}

fun printAsHex(bytes: ByteArray) {
    println(bytes.joinToString("") { "%02x".format(it) })
}