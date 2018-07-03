//Extract a given number of randomly selected elements from a list.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable._
import java.io.PrintWriter
import scala.io.Source

object test_25{
	def main(args:Array[String]){
		var list=ListBuffer(1,2,3,4,5,6)  //> list  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(1, 2, 3, 4, 5,
                                                  //|  6)
            val k=list.length                           //> k  : Int = 6
            var ans=List[Int]()                         //> ans  : List[Int] = List()
            val r = scala.util.Random                   //> r  : util.Random.type = scala.util.Random$@1554909b
            val a=r.nextInt(list.length)                //> a  : Int = 4
            for(i <- 1 to k){
                val r = scala.util.Random
                val a=r.nextInt(list.length)
            ans:+=list(a)
            list-=list(a)
        }
      	print(ans)
	}
}