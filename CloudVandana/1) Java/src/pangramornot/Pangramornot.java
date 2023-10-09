package pangramornot;

import java.util.Scanner;

public class Pangramornot {
	
    public static boolean checkIfPangram(String sentence) {
        for(char i='a' ;i<='z';i++){
            if(sentence.indexOf(i)<0)
                return false;
        }
        return true;
    }

    //     Map<Character,Integer> map = new HashMap<>();
    //     for(int i = 0 ; i<sentence.length();i++){
    //         map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
    //         // if(map.get(sentence.charAt(i))>2)return false;
    //     }
    //     // System.out.println(map);
    //     if(map.size()<26)
    //         return false;
    //     return true;
    // }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/solutions/4148904/using-hashmap-and-indexof/
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the Roman Number");
			sc.next();
			String s=sc.nextLine();
			System.out.println(Pangramornot.checkIfPangram(s));
			}
	}

}
