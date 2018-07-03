//Extract a slice from a list.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_18{
	def main(args:Array[String]){
		var list=List(5,5,5,7,7,7,3,3,3,3)//> list  : List[Int] = List(5, 5, 5, 7, 7, 7, 3, 3, 3, 3)
      	val a=3                                     //> a  : Int = 3
      	val b=6                                     //> b  : Int = 6
      	print(list.slice(a,b+1))
	}
}