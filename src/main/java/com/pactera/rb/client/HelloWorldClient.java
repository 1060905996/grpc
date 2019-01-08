package com.pactera.rb.client;
/**
* @user : Administrator

* @desc :

* @date : 2018年12月12日 
*/
import java.util.concurrent.TimeUnit;

import com.pactera.rb.proto.RbRequest;
import com.pactera.rb.proto.RbResponse;
import com.pactera.rb.proto.RobotGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
 
public class HelloWorldClient {
 
	private final ManagedChannel channel; 
    private final RobotGrpc.RobotBlockingStub blockingStub; 
 
 
    public HelloWorldClient(String host,int port){ 
        channel = ManagedChannelBuilder.forAddress(host,port) 
                .usePlaintext() 
                .build();
 
        blockingStub = RobotGrpc.newBlockingStub(channel); 
    }
 
 
    public void shutdown() throws InterruptedException { 
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS); 
    }
 
    public  void greet(String name){ 
        RbRequest request = RbRequest.newBuilder().setUserId(name).build(); 
        RbResponse   response = blockingStub.getResponse(request);
        System.out.println(response.getTts());
 
    }
 
    public static void main(String[] args) throws InterruptedException { 
        HelloWorldClient client = new HelloWorldClient("127.0.0.1",8051);
        for(int i=0;i<5;i++){
            client.greet("world:"+i);
        }
 
 
    }
	
}
