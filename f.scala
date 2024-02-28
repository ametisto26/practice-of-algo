import java.util._
object Main {
  val sc = new Scanner(System.in)
  val N = sc.nextInt
  val mat = Array.ofDim[Int](N, N)
  for (i <- 0 to N - 1){
    for (j <- 0 to N - 1){
      mat(i)(j) = sc.nextInt
    }
  }
  val result = Array.ofDim[Int](N, N) //途中経過の記録用

  def main(args: Array[String]): Unit = {
    for (j <- 0 to N - 1){
        for (i <- 0 to N - 1){
            if (i == 0 && j == 0){
                result(i)(j) = mat(i)(j)
            }
            else if (i == 0){
                result(i)(j) = mat(i)(j) + result(i)(j - 1)
            }
            else if (j == 0){
                result(i)(j) = mat(i)(j) + result(i - 1)(j)
            }
            else if(result(i)(j - 1) < result(i - 1)(j)){
                result(i)(j) = mat(i)(j) + result(i - 1)(j)
            }
            else {
                result(i)(j) = mat(i)(j) + result(i)(j - 1)
            }
        }
    }
    println(result(N - 1)(N - 1))
  }
}
