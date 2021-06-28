/*c13-3
 */
class Player(_name: String, var healthPoints: Int, val isBlessed: Boolean, private val isImmortal: Boolean){
        var name = _name
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    fun auraColor() =
        if (isBlessed && healthPoints > 50 || isImmortal) "綠色" else "無光環"

    fun formaHealthStatus() =
        when (healthPoints) {
            100 -> "健康狀態極佳"
            in 90..99 -> "有一些小擦傷"
            in 75..89 -> if (isBlessed) {
                "雖有一些傷口，但恢復很快"
            } else {
                "有一些傷口"
            }
            in 15..74 -> "嚴重受傷"
            //顯示玩家狀態
            else -> "情況不妙"
        }

    fun castFireBall(numFireballs: Int = 2): Int {
        println("FireBall杯數：$numFireballs")
        return numFireballs
    }
}
