package my.raspberry.myled.controller

import com.pi4j.io.gpio._
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

@RestController
object LightController {

  private val pinController: GpioController = GpioFactory.getInstance()
  private val pin = pinController.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.LOW)

  @RequestMapping("/")
  def init(): String = {
    "LED Light !!!!"
  }

  @RequestMapping("/toggle")
  def toggle(): String = {
    pin.toggle()
    "Toggled !!"
  }

}
