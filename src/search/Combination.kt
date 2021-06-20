package search

/**
 * 조합: Combination
 * n개중 2개를 순서없이 뽑는 방법
 */
fun main() {
    var arr = arrayOf("A", "B", "C", "D")
    var n = 4
    var r = 2

    println("start.. combination1")
    combination1(arr, n, r)
    println("start.. combination2")
    combination2(arr, n, r)
}

/**
 * 백트래킹 기법
 */
fun combination1(arr: Array<String>, n: Int, r: Int) {
    var answer = arrayListOf<ArrayList<String>>()

    fun combination(visited:Array<Boolean>, start: Int, n: Int, r: Int) {
        if(r == 0) {
            answer.add(makeResult(arr, visited))
            return
        }
        for(i:Int in start until n) {
            visited[i] = true
            combination(visited, i + 1, n, r - 1)
            visited[i] = false
        }
    }
    combination(Array(n) {false}, 0, n, r)
    answer.forEach { println(it) }
}

/**
 * 재귀함수 기법
 */
fun combination2(arr: Array<String>, n: Int, r: Int) {
    var answer = arrayListOf<ArrayList<String>>()

    fun combination(visited:Array<Boolean>, dept: Int, n: Int, r: Int) {
        if(r == 0) {
            answer.add(makeResult(arr, visited))
            return
        }

        if(dept == n) {
            return
        }

        visited[dept] = true
        combination(visited, dept + 1, n, r - 1)
        visited[dept] = false
        combination(visited, dept + 1, n, r)
    }
    combination(Array(n) {false}, 0, n, r)
    answer.forEach { println(it) }
}

fun makeResult (arr: Array<String>, visited: Array<Boolean>): ArrayList<String> {
    return visited.foldIndexed(arrayListOf()) { index, acc, b ->
        acc.apply { if(b) add(arr[index]) }
    }
}