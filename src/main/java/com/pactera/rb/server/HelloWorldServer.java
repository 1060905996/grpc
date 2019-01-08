package com.pactera.rb.server;
/**
* @user : Administrator

* @desc :

* @date : 2018年12月12日 
*/
import java.io.IOException;

import com.pactera.rb.proto.RbRequest;
import com.pactera.rb.proto.RbResponse;
import com.pactera.rb.proto.RobotGrpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
 
public class HelloWorldServer {
 
	private int port = 8051;
    private Server server;
 
    private void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new GreeterImpl())
                .build()
                .start();
 
        System.out.println("service start...");
 
        Runtime.getRuntime().addShutdownHook(new Thread() {
 
            @Override
            public void run() {
 
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                HelloWorldServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }
 
    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
 
    // block 一直到退出程序 
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
 
 
    public static void main(String[] args) throws IOException, InterruptedException {
 
        final HelloWorldServer server = new HelloWorldServer();
        server.start();
        server.blockUntilShutdown();
    }
 
 
    // 实现 定义一个实现服务接口的类 
    private class GreeterImpl extends RobotGrpc.RobotImplBase {

		@Override
		public void getResponse(RbRequest request, StreamObserver<RbResponse> responseObserver) {
			System.out.println("service:"+request.getUserId());
            RbResponse reply = RbResponse.newBuilder().setTts(("Hello: " + request.getUserId())).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
		}
    }
	
}
