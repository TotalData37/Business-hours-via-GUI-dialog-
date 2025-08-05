//FinalProjectPart2.java - This program shows business hours via GUI dialog system.
//CSIS 212-B02
// Oracle, Class JoptionPane https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html

package assignmenteight;

import javax.swing.JOptionPane; // Import a GUI input/output dialogs

public class FinalProjectPart2 {
	// Define an enum for the days of the week
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
    }
    // Main method beings execution of Java application
    public static void main(String[] args) {
        String[] businessHours = {  // Array of business hours for the corresponding day of the week
            "9:00 AM – 5:00 PM",    // Monday
            "10:00 AM – 6:00 PM",   // Tuesday
            "8:00 AM – 4:00 PM",    // Wednesday
            "11:00 AM – 7:00 PM",   // Thursday
            "9:00 AM – 3:00 PM",    // Friday
            "12:00 PM – 4:00 PM",   // Saturday
            "Closed"               // Sunday
        };

        StringBuilder menu = new StringBuilder("Select a day of the week:\n"); // Build the menu with StringBuilder
        Day[] days = Day.values();
        
        // Loop for each day and add it to the menu
        for (int i = 0; i < days.length; i++) {
            menu.append((i + 1)).append(". ").append(days[i]).append("\n");
        }
        
        // Prompt for the user to pick a day on the menu
        String input = JOptionPane.showInputDialog(
            null,
            menu.toString(),
            "Business Hours Lookup",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (input != null) { 
            try {
                int choice = Integer.parseInt(input);

                // Validate User's choice
                if (choice >= 1 && choice <= days.length) {
                    Day selectedDay = days[choice - 1]; // This maps the input to the enum
                    String hours = businessHours[selectedDay.ordinal()]; 
                    JOptionPane.showMessageDialog(
                        null,
                        selectedDay + " Business Hours:\n" + hours,
                        "Business Hours",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                	// Validation check if a number from the menu was not chosen
                    JOptionPane.showMessageDialog(
                        null,
                        "Please enter a number between 1 and 7.",
                        "Invalid Day",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
                
                // Display Assignment and my name 
                JOptionPane.showMessageDialog(
                    null,
                    "David Lyman – Assignment 7",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE
                );
                
                // Validation check if the input value is not a number
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Invalid input. Please enter a valid number.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    } // End of main method
} // End of class FinalProjectPart2