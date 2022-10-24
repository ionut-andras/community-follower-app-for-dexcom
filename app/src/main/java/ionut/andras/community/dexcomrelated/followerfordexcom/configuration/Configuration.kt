package ionut.andras.community.dexcomrelated.followerfordexcom.configuration

import java.io.Serializable

class Configuration: Serializable {
    var username = ""
    var password = ""

    var dexcomSessionID = ""

    var minDisplayableGlucoseValue: Int = 1
    var maxDisplayableGlucoseValue: Int = 401

    var glucoseHistoryMinutesBack: Int = 1440
    var glucoseHistoryNumberOfMetrics:Int = 36 //144

    var glucoseAutomaticUpdateMiliseconds: Long = 60000

    var glucoseValueNotificationIntervalSeconds: Int = 300
    var glucoseNotificationHistoryValues: Int = 5

    var glucoseHighThreshold: Int = 180
    var glucoseLowThreshold: Int = 90

    var plotLabelsCount: Int = 8

    var autoCancelNotifications: Boolean = false;
}