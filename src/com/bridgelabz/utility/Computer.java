package com.bridgelabz.utility;

public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	
	@Override
	public String toString()
	{
		return "RAM: "+this.getRAM()+"\nHDD: "+this.getHDD()+"\nCPU: "+this.getCPU();
	}
	

}

class PC extends Computer
{
	private String RAM;
	private String HDD;
	private String CPU;
	
	
	public PC(String ram,String hdd,String cpu)
	{
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	@Override
	public String getRAM()
	{
		return this.RAM;
	}
	
	@Override
	public String getHDD()
	{
		return this.HDD;
	}
	
	@Override
	public String getCPU()
	{
		return this.CPU;
	}
}


class Server extends Computer
{
	private String RAM;
	private String HDD;
	private String CPU;
	
	public Server(String ram,String hdd,String cpu)
	{
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	@Override
	public String getRAM()
	{
		return this.RAM;
	}
	
	@Override
	public String getHDD()
	{
		return this.HDD;
	}
	
	@Override
	public String getCPU()
	{
		return this.CPU;
	}
}

class Laptop extends Computer
{
	private String RAM;
	private String HDD;
	private String CPU;
	
	public Laptop(String ram,String hdd,String cpu)
	{
		this.RAM=ram;
		this.HDD=hdd;
		this.CPU=cpu;
	}
	@Override
	public String getRAM()
	{
		return this.RAM;
	}
	
	@Override
	public String getHDD()
	{
		return this.HDD;
	}
	
	@Override
	public String getCPU()
	{
		return this.CPU;
	}
}
