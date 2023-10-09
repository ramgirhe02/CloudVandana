package romanToInt;

import java.util.Scanner;

public class RomanToInteger {
//https://leetcode.com/problems/roman-to-integer/solutions/4148934/romantointeger/	
	  static int convert(Character c){
          switch (c) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X' : return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
            }
            return -1;
    }
    public static int romanToInt(String s) {

       int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i == s.length()-1)
             result += convert(c);
             else if(convert(s.charAt(i)) >= convert(s.charAt(i+1)))
             result += convert(c);
            else {
            result += convert(s.charAt(i+1)) - convert(s.charAt(i));
            i++ ;
            }
          
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter the Roman Number");
		sc.next();
		String s=sc.nextLine();
		System.out.println(RomanToInteger.romanToInt(s.toUpperCase()));
		}
	}

}
