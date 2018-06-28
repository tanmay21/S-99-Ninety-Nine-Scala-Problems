//Find out whether a list is a palindrome.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_6{
	def main(args:Array[String]){
		val list=List(2,5,8,5,2)
		if(list==list.reverse)
			print("palindrome")
		else
			print("non-palindrome")
	}
}