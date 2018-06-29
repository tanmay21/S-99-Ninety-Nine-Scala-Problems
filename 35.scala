//Determine the prime factors of a given positive integer.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_35{
	def main(args:Array[String]){
		var n=48
		var i=2
		val arr=new ArrayBuffer[Int]
		while(n>1){
			while(n%i==0){
				arr+=i
				n/=i
			}
			i+=1
		}
		print(arr.toList)
	}
}