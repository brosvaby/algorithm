package etc

fun main() {
    if (isPrimeNumber1(5)) {
        println("this is prime number")
    }
}

/**
 * 소수찾기 (전체 탐색)
 */
fun isPrimeNumber1(input: Int): Boolean {
    for (i: Int in 2 until input) {
        if ((i % i) == 0) {
            return false
        }
    }
    return true
}

/**
 * 소수찾기 (절반 탐색)
 */
fun isPrimeNumber2(input: Int): Boolean {
    for (i: Int in 2..input / 2) {
        if ((i % i) == 0) {
            return false
        }
    }
    return true
}