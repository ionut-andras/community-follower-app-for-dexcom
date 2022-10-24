package ionut.andras.community.dexcomrelated.followerfordexcom.utils

open class DateTimeConversion {
    /**
     * Gets the current timestamp in seconds, from epoch start (1970)
     *
     * @return Long
     */
    fun getCurrentTimestamp(): Long {
        return  (System.currentTimeMillis() / 1000)
    }
}