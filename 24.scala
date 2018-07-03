//Lotto: Draw N different random numbers from the set 1..M.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_24{
	def main(args:Array[String]){
		val r = scala.util.Random                   //> r  : util.Random.type = scala.util.Random$@5b37e0d2
      	val m=100                                   //> m  : Int = 100
      	val n=4                                     //> n  : Int = 4
      	val v=for (i <- 1 to n) yield r.nextInt(m)  //> v  : scala.collection.immutable.IndexedSeq[Int] = Vector(98, 44, 15, 72)
      	print(v.toList)
	}
}