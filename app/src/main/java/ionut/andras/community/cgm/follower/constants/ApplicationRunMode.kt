package ionut.andras.community.cgm.follower.constants

object ApplicationRunMode {
    const val UNDEFINED = -1
    const val MAIN_APPLICATION = 0
    const val FOLLOWER = 1

    val convert: MutableMap<Int, String> = mutableMapOf(
        -1 to "UNDEFINED",
        0 to "MAIN_APPLICATION",
        1 to "FOLLOWER"

    )
}