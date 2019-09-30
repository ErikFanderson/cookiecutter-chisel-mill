package {{cookiecutter.package}} 
import chisel3._

/** Elaborates Rx and Tx Top in a Top module */
object Main extends App {
  val myArgs = Array("--top-name","HandshakeFsm")
  chisel3.Driver.execute(myArgs,() => new HandshakeFsm())
}
