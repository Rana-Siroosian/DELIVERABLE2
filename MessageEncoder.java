


import java.util.Scanner;

public class MessageEncoder {

	public static void main(String[] args) {
		

		Scanner scnr = new Scanner(System.in);
		
		System.out.print("What is your message? ");
		String input = scnr.nextLine();
		
		String input2 = input.toUpperCase();

		
        System.out.print("\nYour encoded message is ");

		
		int [] message = new int[input2.length()];
		int code = 0;
		int unicode = 65;
		int checksum = 0;
		for(int i=0;i<message.length;i++){
			message[i] = input2.charAt(i);
			checksum = checksum + message[i];
			code = (message[i] - unicode)+1;
			

			if ( i == message.length -1) {
				System.out.print(code);
			}
			else {System.out.print(code + "-");
				
			}
	          
	          
		}
		System.out.println();
		System.out.println("Message checksum is "+checksum);
	}
}

	