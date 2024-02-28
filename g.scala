import java.util._
object Main {
  val sc = new Scanner(System.in)
  val N = sc.nextInt
  val M = sc.nextInt
  val arr = Array.fill(N)(sc.nextInt)
  val mat = Array.ofDim[Int](N + 1, M + 1) // 0で初期化済
  for (i <- 0 to N){
    for (j <- 1 to M){
        mat(i)(j) = N + 1
        // 個数より多く選ばれることはないのでInt.MaxValueの代わりになる
    }
  }

  def main(args: Array[String]): Unit = {
    for (i <- 0 to N - 1){
        for (j <- 1 to M){
            if(j < arr(i)){
                mat(i + 1)(j) = mat(i)(j)
            }
            else if(mat(i)(j - arr(i)) + 1 < mat(i)(j)){
                mat(i + 1)(j) = mat(i)(j - arr(i)) + 1
            }
            else {
                mat(i + 1)(j) = mat(i)(j)
            }
        }
    }
    println(if(mat(N)(M) > N) -1; else mat(N)(M))
  }
}
