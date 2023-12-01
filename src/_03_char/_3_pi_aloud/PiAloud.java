package _03_char._3_pi_aloud;

import java.util.Scanner;

import javax.swing.JOptionPane;

import game_tools.Sound;

public class PiAloud {
    /***********  SOUND ***************
     * Some computers are unable to play sounds.
     * If you cannot play sound on this computer, set canPlaySounds to false.
     * If you are not sure, ask your teacher
     * *****************/
   static boolean canPlaySounds = true;

public static void main(String[] args) {
	

    // 1. Make a main method and make sure your program can run
String pi = "3.1415926535897932384";
    // 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.
for (int i = 0; i < 3; i++) {
	System.out.print(pi.charAt(i));
}
System.out.println();
for (int i = 0; i < pi.length(); i ++ ) {
	String input = JOptionPane.showInputDialog("whats the next digit of pi?");
	char in = input.charAt(0);
	if (in == pi.charAt(i)) {
		JOptionPane.showMessageDialog(null, "correct");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "wrong its" + pi.charAt(i));
	}
	System.out.println(pi.charAt(i));
	
	}
if(canPlaySounds) {
	Sound.speak(pi);
}

    // 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
    // Check the console shows 3.1

    // 4. Print ALL the digits of the Pi String, putting each digit on a new line  (hint: use a loop)

    // 5. Skip this step if your computer cannot play sounds.
    //if (canPlaySounds) {
        // Use the Sound.speak() method to speak each digit of Pi.
        
    //}

}
    // [CHALLENGE]
    // *6. Get a character from the user using the getInputFromUser() method
    // *7. Compare the users' char to the next digit of Pi
    // *8. If they are correct, print out "correct". If they are not, print "incorrect"


    /********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

    private static void pause(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static char getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().toCharArray()[0];
    }

}


