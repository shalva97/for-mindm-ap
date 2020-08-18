package retrofit

import kotlinx.serialization.*


@Serializable
data class ProfileData(
    @Serializable(with = HalykAccountSerializer.ProfileId::class) val name: String? = "",
    val id: String? = null
)

@Serializer(forClass = String::class)
object ProfileSerializer: KSerializer<String> {
    private var persistentVarInSerializer = 4
    override fun serialize(encoder: Encoder, value: String) {
        encoder.encodeInt(persistentVarInSerializer)
    }
}

object HalykAccountSerializer {
    @Serializer(forClass = String::class)
    object ProfileId: KSerializer<String> {
        var profileId: String = "123123"
        //        lateinit var profileId: String
        override fun serialize(encoder: Encoder, value: String) {
            encoder.encodeString(profileId)
        }
    }

    @Serializer(forClass = String::class)
    object Language: KSerializer<String> {
        lateinit var lang: String
        override fun serialize(encoder: Encoder, value: String) {
            encoder.encodeString(lang)
        }
    }
}