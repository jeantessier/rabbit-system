package b

import com.budjb.rabbitmq.consumer.MessageContext

class AConsumer {

    static rabbitConfig = [
        queue: "A_to_B"
    ]

    def handleMessage(String message, MessageContext context) {
        log.info System.getProperty("node.name") + ": message from A: \"" + message + "\""
    }

}
