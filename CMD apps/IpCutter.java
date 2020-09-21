import java.util.*; 

class Main{
	public static void main(String[] args) {
		String ip = args[0]; 
        int start=0;
        int end;
        int holder;
        boolean loop=true;
        while(loop){
        	holder=ip.indexOf('.',start);
   	       	end=holder;
        	if(end<ip.length()&&end>0){
        		System.out.println(ip.substring(start,end));
        	}
        	else{
        		System.out.println(ip.substring(start));
        		loop=false;
        	}
        	start=holder+1;
        }
	}
}