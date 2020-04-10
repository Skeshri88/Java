package Program;

public class Task4of9
{
	
	public static String longrepating(String str, String str2){  
        int n = Math.min(str.length(),str2.length());  
        for(int i = 0; i < n; i++){  
            if(str.charAt(i) != str2.charAt(i)){  
                return str.substring(0,i);  
            }  
        }  
        return str.substring(0,n);  
    }  
  
    public static void main(String[] args) {  
        String S1 = "adsgtsecvdfsfs";  
        String S2="";  
        int n = S1.length();  
        for(int i = 0; i < n; i++){  
            for(int j = i+1; j < n; j++){  
               
                String x = longrepating(S1.substring(i,n),S1.substring(j,n));  
                
                if(x.length() > S2.length()) S2=x;  
            }  
        }  
        System.out.println("Longest repeating sequence: "+S2);  
    }  
}  


