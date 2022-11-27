package search

fun main() {
    binarySearch(intArrayOf(2,4,6,8,10,12,14,16), 4)
    val end1 = upperBound(intArrayOf(2,4,6,8,10,12,14,16), 4)
    val end2 = lowerBound(intArrayOf(2,4,4,4,4,12,14,16), 4)
    println(end1)
    println(end1)
}

/**
 * mid 의 index 를 뽑는 로직
 */
fun binarySearch(arr: IntArray, target: Int): Int {
    var low = 0
    var high = arr.lastIndex
    var mid = 0

    while(low <= high) {
        mid = (low + high) / 2
        when {
            arr[mid] == target -> return mid
            arr[mid] > target -> high = mid - 1
            else -> low = mid + 1
        }
    }
    return -1
}

/**
 * mid 의 +1 index 를 찾는 로직 (중복 값들 처리 가능)
 */
fun upperBound(arr: IntArray, target: Int): Int {
    var begin = 0
    var end = arr.size
    var mid = 0

    while(begin < end) {
        println("---- begin : $begin / end : $end ----")
        mid = (begin + end) / 2
        println("mid: $mid")
        if(arr[mid] <= target) {
            println("$target 이 ${arr[mid]} 보다 오른쪽에 있음(같을수 있음) [begin:${mid + 1} / end:$end]")
            begin = mid + 1
        } else {
            println("$target 이 ${arr[mid]} 보다 왼쪽에 있음 [begin:$begin / end:$mid]")
            end = mid
        }
    }
    return end
}

/**
 * mid 의 가장 작은 index 를 찾는 로직 (중복 값들 처리 가능)
 */
fun lowerBound(arr: IntArray, target: Int): Int {
    var begin = 0
    var end = arr.size
    var mid = 0

    while(begin < end) {
        println("---- begin : $begin / end : $end ----")
        mid = (begin + end) / 2
        println("mid: $mid")
        if(arr[mid] >= target) {
            println("$target 이 ${arr[mid]} 보다 왼쪽에 있음(같을수 있음) [begin:$begin / end:$mid]")
            end = mid
        } else {
            println("$target 이 ${arr[mid]} 보다 오른쪽에 있음 [begin:${mid + 1} / end:$end]")
            begin = mid + 1
        }
    }
    return end
}