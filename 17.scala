//Split a list into two parts.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_17{
	def main(args:Array[String]){
		var list=List(5,5,5,7,7,7,3,3,3,3)//> list  : List[Int] = List(5, 5, 5, 7, 7, 7, 3, 3, 3, 3)
      	val n=3                                     //> n  : Int = 3
      	val a=list.slice(0,n)                       //> a  : List[Int] = List(5, 5, 5)
      	val b=list.slice(n,list.length)             //> b  : List[Int] = List(7, 7, 7, 3, 3, 3, 3)
      	val t=(a,b)

      	print(t) 
	}
}