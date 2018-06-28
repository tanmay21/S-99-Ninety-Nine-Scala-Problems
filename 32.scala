//Determine the greatest common divisor of two positive integer numbers.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_32{
	def main(args:Array[String]){
		val a=10
		val b=15
		var i=2

		while(i<=a){
			if(a%i==0 && b%i==0){
				print(i)
				return
			}
			i+=1
		}
		if(i==a+1)
			print(1)
	}
}