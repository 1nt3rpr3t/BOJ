package boj_28444

fun main() {
    val a = readln().split(" ").map { it.toInt() }
    print(
        (a[0] * a[1]) - (a[2] * a[3] * a[4])
    )
}