//Determine the greatest common divisor of two positive integer numbers.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_31{
	def main(args:Array[String]){
		val n=31
		var i=2
		var key=true
		while(i<sqrt(n).toInt){
			if(n%i==0){
				print(false)
				key=false
				return
			}
			i+=1
		}
		if(key){
			print(true)
		}
	}
}