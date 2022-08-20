package services

import grpc.Check.{Request, Response}
import grpc.HealthCheckServiceGrpc.HealthCheckServiceImplBase
import io.grpc.stub.StreamObserver

class CheckServices extends HealthCheckServiceImplBase {
    override def getStatus(request: Request, responseObserver: StreamObserver[Response]): Unit = {
            responseObserver.onNext(Response.newBuilder().setCode("GoodState: " + request.getName).build())
            responseObserver.onCompleted()
      println("Done check")
    }


}