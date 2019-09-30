package {{cookiecutter.package}} 
import chisel3._

/** Elaborates Rx and Tx Top in a Top module */
object Main extends App {
  override val args = Array("--top-name","HandshakeFsm")
  chisel3.Driver.execute(args,() => new HandshakeFsm())
}
