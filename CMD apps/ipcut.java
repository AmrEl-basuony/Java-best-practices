import java.util.*; 

class ipcutter{
	public static void main(String[] args) {
		String ip = args[0]; 
        String[] splitted = ip.split("[.]"); 
        for (String nums : splitted){ 
            System.out.println(nums); 
        }
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
        StringTokenizer strtkn = new StringTokenizer(ip, "."); 
        while (strtkn.hasMoreTokens()){ 
            System.out.println(strtkn.nextToken());
        }
	}
}