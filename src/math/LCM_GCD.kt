package math

fun main() {
    LCM()
    GCD()
}

/**
 * largest common multiple
 * 최소공배수
 */
fun LCM() {
    var n = 20
    var m = 8

    var small = if (n < m) n else m
    var big: Int = if (n < m) m else n

    for (i: Int in 1..small) {
        if (((i * big) % small) == 0) {
            println("최소공배수는 ${i * big}")
            break
        }
    }
}

/**
 * greatest common divisor
 * 최대공약수
 */
fun GCD() {
    var n = 9
    var m = 3

    var small = if (n < m) n else m
    var big: Int = if (n < m) m else n

    for (i: Int in small downTo 1) {
        if (((big % i) == 0) && ((small % i) == 0)) {
            println("최대공약수는 $i")
            break
        }
    }
}