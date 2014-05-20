package CheckIPAddress;

import java.util.Scanner;

public class CheckIPAddress {
	public void checkip(String text){
		if(text!=null &&!text.isEmpty())
		{   
			String ip="^([1-9]|[1-9]\\d{1}|1\\d{2}|2[0-4]\\d|25[0-5])\\."+"([1-9]|[1-9]\\d{1}|1\\d{2}|2[0-4]\\d|25[0-5])\\."+"([1-9]|[1-9]\\d{1}|1\\d{2}|2[0-4]\\d|25[0-5])\\."+"([1-9]|[1-9]\\d{1}|1\\d{2}|2[0-4]\\d|25[0-5])$";
			if(text.matches(ip))
				System.out.println("It's correct IP Address");
			else
				System.out.println("It's invalid IP Address");
		}
	}

	public static void main(String args[]){
		System.out.print("Please input one IP address:");
		Scanner sc=new Scanner(System.in);
		String ipaddress=sc.next();
		CheckIPAddress CIP= new CheckIPAddress(); 
		CIP.checkip(ipaddress);
		
	}
}
