object Main {
  import java.util._
  val sc = new Scanner(System.in)
//   val a = sc.nextInt
  val b = sc.nextInt
  def main(args: Array[String]): Unit = {
    def aux(n: BigInt): BigInt= {
      if(n == 0) 0 //if(n == a) a
      else {
        n + aux(n - 1)
      }
    }
    println(aux(b))
  }
}
