import scala.meta._

object Main {
  def main(args: Array[String]): Unit = {
    val classpath = "/Users/eburmako/Projects/sbt-semantic-example/library/target/scala-2.11/classes"
    val database = Database.load(Classpath(classpath))
    println(database.names)
  }
}
