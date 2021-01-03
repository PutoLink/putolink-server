package link.puto.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/** Spring main application */
@SpringBootApplication
class PutoLinkServerApplication

fun main(args: Array<String>) {
  runApplication<PutoLinkServerApplication>(*args)
}
