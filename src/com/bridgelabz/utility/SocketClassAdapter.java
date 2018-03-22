package com.bridgelabz.utility;

public class SocketClassAdapter extends Socket implements SocketAdapter
{

	@Override
	public Volt get120Volt() {
		
		return getVolt();
	}

	@Override
	public Volt get3Volt() {
		
		Volt volt=getVolt();
		return convert(volt,40);
		
	}
	
	public Volt convert(Volt volt,int i)
	{
		return new Volt(volt.getVolt()/i);
	}
	
	
	
}
