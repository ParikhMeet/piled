package my.raspberry.myled

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application

object ApplicationObject {

  def main(args: Array[String]): Unit = {
    SpringApplication run classOf[Application]
  }

}