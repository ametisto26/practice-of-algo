import scala.sys.process._
import java.io.File
// object Main {
    val s = """猫マナー"""

    // 出力先のファイル
    val f = new File("output.txt")

    def main(n: Int) = { //(args: Array[String]):Unit = {
        for (i <- 1 to n){
            "echo %s".format(s) #>> f!
        } 
    }
// }

