package etc

import java.util.*

fun main() {
    println("시작입니다.")
    findMax()
}

/**
 * array 에서 가장 큰값 찾기
 */
fun findMax () {
    val info = arrayOf(1,3,5,2,10,9)
    val max1 = Collections.max(info.toList())
    // kotlin max() 는 삭제 되었고 maxOrNull() 로 바뀜 현재 intellij 업그레이드 안되서 문제
    //val max2 = info.maxOrNull()
    val max3 = info.reduce { acc, i -> if(acc < i) i else acc }
    println("$max1 $max3")
}