class Solution {
    fun isPalindrome(x: Int): Boolean {
        var reverseNum = 0
        var num = x
        while (num > 0) {

            var reminder = num % 10
            reverseNum = reverseNum * 10 + reminder
            num = num / 10
        }

        return if (x == reverseNum) true else false
    }
}
