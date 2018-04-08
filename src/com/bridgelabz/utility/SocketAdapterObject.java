package com.bridgelabz.utility;

public class SocketAdapterObject implements SocketAdapter
{

	Socket socket=new Socket();
	
	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get3Volt() {
		
		Volt volt=socket.getVolt();
		return convert(volt,40);
		
	}
	
	public Volt convert(Volt volt,int i)
	{
		return new Volt(volt.getVolt()/i);
	}
	
}
