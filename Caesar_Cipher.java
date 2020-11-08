import java.util.*;

public class Caesar_Cipher{

	void shift_mod(String str,int key,int a){
			String text = "abcdefghijklmnopqrstuvwxyz";
			int len,i=0,j,k=0,val=0;
			len = str.length();
			char[] e =new char[len+1];
			char[] d =new char[len+1];
		

		while(i<len)
		{
			j=text.indexOf(str.charAt(i));
			val = (j+key)%26;
			e[k] = text.charAt(val);
			i++;
			k++;
		}

		String en,de;
		for(i=len-1;i>=a;i--)
			{
				e[i+1]=e[i];
			}
		e[a]=' ';


		en = String.valueOf(e);
		System.out.println("Encrypted Word:"+en);
		i=0;k=0;j=0;
		//String str1 = String.valueOf(e);
		String str1 = String.valueOf(e);
		String st;
		st = str1.replaceAll("\\s", "");
	    st = st.toLowerCase();
		while(i<len)
		{
			j=text.indexOf(st.charAt(i));
			val = (j-key)%26;
			if(val<0)
				{
					val = val*(-1);
					val = 26-val;
				}
			d[k] = text.charAt(val);
			i++;
			k++;
		}

		
		for(i=len-1;i>=a;i--)
			{
				d[i+1]=d[i];
			}
		d[a]=' ';
		de = String.valueOf(d);

		System.out.println("Decrypted Word:"+de);
	}

	void shift(String str,int key,int a){
	String text = "abcdefghijklmnopqrstuvwxyz";
			int len,i=0,j,k=0,val=0;
			len = str.length();
			char[] e =new char[len+1];
			char[] d =new char[len+1];
		

		while(i<len)
		{
			j=text.indexOf(str.charAt(i));
			val = (j+key);
			if(val>26)
			{
				val = val-26;
			}
			e[k] = text.charAt(val);
			i++;
			k++;
		}

		String en,de;
		for(i=len-1;i>=a;i--)
			{
				e[i+1]=e[i];
			}
		e[a]=' ';
		en = String.valueOf(e);
		System.out.println("Encrypted Word:"+en);
		i=0;k=0;j=0;
		String str1 = String.valueOf(e);
		String st;
		st = str1.replaceAll("\\s", "");
	    st = st.toLowerCase();
		while(i<len)
		{
			j=text.indexOf(st.charAt(i));
			val = (j-key);
			if(val<0)
				{
					val = val*(-1);
					val = 26-val;
				}
			d[k] = text.charAt(val);
			i++;
			k++;
		}


		for(i=len-1;i>=a;i--)
			{
				d[i+1]=d[i];
			}
		d[a]=' ';

		de = String.valueOf(d);

		System.out.println("Decrypted Word:"+de);	
	}

  void thank(){
		System.out.println("ThankYou!!!");
		System.exit(0);
	}

	 public static void main(String[] args) {
				
		String s,str;
		int key,i;
		Caesar_Cipher cc = new Caesar_Cipher();
		char x=' ';
		int ch,op;
		do{
			System.out.println("Enter The String:");
			Scanner scan = new Scanner(System.in);
			s=scan.nextLine();
			i = s.indexOf(" ");
			str = s.replaceAll("\\s", "");
	    	str = str.toLowerCase();
	    	
	    	//System.out.println(i);
			//System.out.println(str);
			
			System.out.println("Enter The Key:");
			key=scan.nextInt();
			System.out.println("Enter");
			System.out.println("1.Shifting");
			System.out.println("2.Shifting Using MOD");
			ch=scan.nextInt();
			switch(ch){
		
			case 1:	cc.shift(str,key,i);
					break;
			case 2: cc.shift_mod(str,key,i);
					break;
			case 3: cc.thank();
					break;
			default:
					System.out.println("Invalid Choice");
			
		}

			System.out.println("Enter -1 to Exit");
			op = scan.nextInt();

		}while(op!=-1);
	}
}			

