import java.lang.StringBuilder
import java.lang.ref.WeakReference
import java.security.MessageDigest
import java.util.*

fun main() {
    var sdata="ge.space.app.uzbekistan 6b6579746f6f6c206572726f723a206a6176612e696f2e494f457863657074696f6e3a204b657973746f7265207761732074616d706572656420776974682c206f722070617373776f72642077617320696e636f72726563740a192";
    val digest = MessageDigest.getInstance("SHA-256").apply { reset() }
    val byteData: ByteArray = digest.digest(sdata.toByteArray())

    var base64String = Base64.getEncoder()!!.encodeToString(byteData)
    print(base64String.substring(0, 11))
}