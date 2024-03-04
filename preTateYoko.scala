import java.util._
object Main {
    val sc = new Scanner(System.in)
    val H = sc.nextInt
    val W = sc.nextInt
    val mat = Array.ofDim[String](H, W)
    // val arr = Array.fill(H)[String](sc.next)
    for (i <- 0 to H - 1){
        mat(i)(0) = sc.next //Array.fill(W)(sc.next)
    }
    val p = sc.nextInt
    val q = sc.nextInt

    for (i <- 0 to H - 1){
        mat(i) = mat(i)(0).split("")
    }

    def main(args: Array[String]): Unit = {
        var result = {
            if (mat(p)(q) == "#") -1
            else 0
        }

        for (i <- 0 to W - 1){
            if(mat(p)(i) == "#"){
                result += 1
            }
        }
        for (j <- 0 to H - 1){
            if(mat(j)(q) == "#"){
                result += 1
            }
        }
        println(result)
    }
}
