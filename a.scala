object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val d = sc.nextInt
  val arr = Array.fill(n)(sc.nextInt)

  def main(args: Array[String]): Unit = {
      val acc = new Array[Int](n + 1)
      for (i <- 0 to n - 1){
          acc(i+1) = acc(i) + arr(i)
      }
      var max = 0
      var result = 0
      for (j <- 0 to n - d){
          if (max <= acc(j+d) - acc(j)){
              max = acc(j+d) - acc(j)
              result = j
          }
      }
      println(f"${result}~${result + d - 1}")
  }
}
