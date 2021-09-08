package statistics

/**
 * 조합:  Permutation
 * n개중 2개를 순서있게 뽑는 방법
 */
fun main() {
    var n = 3
    var r = 3
    var arr = arrayOf("A", "B", "C")
    var visited = Array(arr.size) { false }
    var output = Array(r) { "" }
    permutation(arr, output, visited, 0, n, r)
    println(answer)
}

var answer = arrayListOf<String>()

/**
 * 백트래킹 기법
 */
fun permutation(arr: Array<String>, output: Array<String>, visited: Array<Boolean>, dept: Int, n: Int, r: Int) {
    if (dept == r) {
        answer.add(output.joinToString(""))
        return
    }

    for (i: Int in arr.indices) {
        if (!visited[i]) {
            visited[i] = true
            output[dept] = arr[i]
            permutation(arr, output, visited, dept + 1, n, r)
            visited[i] = false
        }
    }
}
