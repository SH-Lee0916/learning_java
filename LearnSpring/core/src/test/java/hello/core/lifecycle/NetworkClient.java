package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {
    
    private String url;

    public NetworkClient() {
        System.out.println("url: " + url);
        connect();
        call("init");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + " Message: " + message);
    }

    public void disconnect() {
        System.out.println("close");
    }

    @Override
    public void afterPropertiesSet() throws Exception { 
        // 의존관계 주입 후 호출
        connect();
        call("init");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("NetworkClient.destroy()");
        disconnect();        
    }
}
