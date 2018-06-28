//Determine the greatest common divisor of two positive integer numbers.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_33{
	def main(args:Array[String]){
		val a=5
		val b=7
		var i=2

		while(i<=a){
			if(a%i==0 && b%i==0){
				print(false)
				return
			}
			i+=1
		}
		if(i==a+1)
			print(true)
	}
}