//Find the last but one element of a list.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_2{
	def main(args:Array[String]){
		val list=List(2,5,8,9,27)
		print(list(list.length-2))
	}
}