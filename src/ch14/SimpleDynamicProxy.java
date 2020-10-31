package ch14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author YZX
 * @date 2020年5月29日
 * @time 上午9:42:17
 */

public class SimpleDynamicProxy {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.dosomethingElse("caomei");
	}
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		Interface proxy = (Interface)Proxy.newProxyInstance(
				Interface.class.getClassLoader(), 
				new Class[] {Interface.class}, 
				new DynamicProxyHandler(real));
		consumer(proxy);
	}
}

interface Interface{
	void doSomething();
	void dosomethingElse(String arg);
}
class RealObject implements Interface{
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("doSomething");
	}
	@Override
	public void dosomethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("doSomethingElse" + arg);
	}
}
class DynamicProxyHandler implements InvocationHandler{
	private Object proxied;
	
	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("***** proxy: " + proxy.getClass() + ", method: " + method + ", args " + args);
		if(args != null)
			for(Object arg : args)
				System.out.println(" " + arg);
		return method.invoke(proxied, args);
	}
	
}