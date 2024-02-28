object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val num = sc.nextInt
  val x = sc.nextInt
  val arr = Array.fill(num - 1)(sc.nextInt)

  def main(args: Array[String]): Unit = {
      val a = new Array[Int](num)
      for (j <- 0 to num - 2){
          a(arr(j)) += 1
      }

      var result = a(x)
      def aux(n: Int): Boolean = {
          if (arr(n - 1) == x) true
          else if (arr(n - 1) == 0) false
          else {
              true && aux(arr(n - 1))
          }
      }
      for (i <- 1 to num - 1) {
          if(aux(i)) {
              result += a(i)
          }
      }
    //   println(aux(x))
      println(result)
  }
}
