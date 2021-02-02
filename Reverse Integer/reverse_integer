import kotlin.math.abs

class Solution {
   fun reverse(x: Int): Int {
        var reverseNum = 0
        var isNegative = false

        if (x < 0) isNegative = true

        var num = abs(x)

        while (num > 0) {

            var reminder = num % 10
            reverseNum = reverseNum * 10 + reminder
            if (reverseNum%10!=reminder)
                return 0
            num = num / 10
        }


        return if (isNegative) -reverseNum else reverseNum
    }
}
