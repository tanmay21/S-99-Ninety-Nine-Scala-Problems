//Create a list containing all integers within a given range.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_22{
	def main(args:Array[String]){
		val a=10                         
		val b=20                          
		
		var list=List[Int]()              
		for (i <- a to b){
			list:+=i
		}
		print(list)
	}
}