class Solution {
    fun romanToInt(s: String): Int {
        val list = mutableListOf<Int>()
        s.forEach {
            when (it) {
                'I' -> list.add(1)
                'V' -> list.add(5)
                'X' -> list.add(10)
                'L' -> list.add(50)
                'C' -> list.add(100)
                'D' -> list.add(500)
                'M' -> list.add(1000)
            }
        }
        var realNum = 0
        var count = s.length - 1
        if (count != 0) {
            while (count > 0) {
                val lastValue = list[count]
                val secondLastValue = list[count - 1]
                if (realNum == 0) {
                    realNum += lastValue
                }
                if (secondLastValue < lastValue) {
                    realNum -= secondLastValue
                } else {
                    realNum += secondLastValue
                }
                count -= 1
            }
        } else {
            realNum = list[0]
        }
        return realNum
    }
}
