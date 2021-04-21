package OfficeHoursday1.Siam_handed_Practice;

public class Name_checker {
    public static void main(String[] args) {
        String fullName = "james bond";
        String lastName = "bond";
        if (fullName.contains(lastName)) {
            System.out.println("Same last name " + lastName);

        }else {
            System.out.println("Not the same last name");
        }

        // 2nd practice if name contain bad word

        String message = "idiot,dumb,heck";
        if (message.contains("heck")) {
            System.out.println("Message not sent");
        }else {
            System.out.println("Message sent");

        }

        // 3rd address check

        String address = "231332 leaf ave, lake city 3132";
        if (!address.toUpperCase().isEmpty()) {
            System.out.println(address);
            // System.out.println(address.toUpperCase());

        }else {
            System.out.println("No address found");
        }

        String password = "zizil";
        if (password.length() >= 5) {
            System.out.println("valid password");
            String userName = "ziz.com";
            if (userName.contains(password)) {
                System.out.println("Invalid password, username should not be in it");
            }else {
                System.out.println(password.replace("zizilu", "password"));
            }
        }else {
            System.out.println("Password cannot be less than 5 characters");

        }



    }
}

/**
 * Given a username and password verify they are valid.
 *     - The password cannot be less than 5 characters
 *         -> If it is less print: "Password cannot be less than 5 characters"
 *         -> If it is more then or equal to 5 print: "Valid password"
 *
 *     - Also the password should not contain the username
 *         - If the password has the username in it print:
 *             "Invalid password, username should not be in it"
 *             -> Also change the password to have the value: "password"
 */

/**
 * A person will enter their address into a String. Make sure the String is not empty.
 *     If it is empty print: "No address found".
 *     If there is an address make all the text uppercase to match the expected format
 *
 *         Ex:
 *             Input: 231332 leaf ave, lake city 3132
 *             Output: 231332 LEAD AVE, LAKE CITY 3132
 *
 *         Ex:
 *             Input: ""
 *             Output: No address found
 */

/**
 * Given two String variables. One is a full name and the second a last name. Check if the full name has the same last name as the other String.
 *     Ex:
 *         s: "james bond"
 *         s: "bond"
 *         output: Same last name
 *
 *         s: "alex benji"
 *         s: "bond"
 *         output: Not the same last name
 */

/**
 * Given a String variable with a message. You will check if the message contains any of these bad words: “idiot, dumb, heck”
 *     -> If the message contains any of those words print: “Message not sent”.
 *     -> If the message is bad word free print “Message sent”
 */
