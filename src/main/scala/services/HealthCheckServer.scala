package services

import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder

import java.util.concurrent.TimeUnit

object HealthCheckServer {
    val server = NettyServerBuilder
        .forPort(9001)
        .addService(new CheckServices)
        .keepAliveTime(300, TimeUnit.SECONDS)
        .permitKeepAliveTime(300, TimeUnit.SECONDS)
        .permitKeepAliveWithoutCalls(true)
        .maxInboundMetadataSize(20480)
        .maxInboundMessageSize(10485760)
        .build()

    def main(args: Array[String]): Unit = {
        println("Server starting...")
        server.start()
        server.awaitTermination()
    }
}
