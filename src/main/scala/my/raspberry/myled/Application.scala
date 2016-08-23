package my.raspberry.myled

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.{ComponentScan, Configuration}

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan
class Application

object ApplicationObject {

  def main(args: Array[String]): Unit = {
    SpringApplication run classOf[Application]
  }

}