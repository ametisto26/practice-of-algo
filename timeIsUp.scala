object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val d = sc.nextInt
  val arr = Array.fill(n)(sc.nextInt)

  def main(args: Array[String]): Unit = {
      val a = new Array[Int](n - d + 1)
      for (i <- 0 to n - d){
          for (j <- i to i + d - 1){
              a(i) += arr(j)
          }
      }
      var max = 0
      var result = 0
      for (k <- 0 to n - d){
          if (max <= a(k)){
              max = a(k)
              result = k
          }
      }
      println(f"${result}~${result + d - 1}")
  }
}
