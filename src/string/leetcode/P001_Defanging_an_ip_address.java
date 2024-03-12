package string.leetcode;

/*
    1108. Defanging an IP address
    https://leetcode.com/problems/defanging-an-ip-address/description/

    Input: address = "1.1.1.1"
    Output: "1[.]1[.]1[.]1"
    Input: address = "255.100.50.0"
    Output: "255[.]100[.]50[.]0"
*/

public class P001_Defanging_an_ip_address {
    public static void main(String[] args) {
        String address1 = "1.1.1.1", address2 = "255.100.50.0";
        System.out.println("Defanged IP address : "+defangIPaddr(address1));
        System.out.println("Defanged IP address : "+defangIPaddr(address2));
        System.out.println("Defanged IP address : "+defangIPaddr2(address1));
        System.out.println("Defanged IP address : "+defangIPaddr2(address2));
    }

    // SOLUTION USING STRING BUILDER & LOOP - time complexity - O(n)
    public static String defangIPaddr(String address) {
        int i = 0;
        StringBuilder newAddress = new StringBuilder();
        // Loop through the string find all occurrences of . and replace them with [.]
        while (i < address.length()) {
            // NOTE - string.charAt(index) method returns a character,
            // so we compare it using == and not .equals()
            if (address.charAt(i) == '.') {
                newAddress.append("[.]");
            } else {
                newAddress.append(address.charAt(i));
            }
            i++;
        }
        return newAddress.toString();
    }

    // SOLUTION USING STRING & LOOP - time complexity - O(n^2)
    // Here time complexity is O(n^2) because everytime we append a character or string to the existing string object, a new object gets created because strings are immutable (hence it is less efficient)
    public static String defangIPaddr2(String address) {
        int i = 0;
        String newAddress = "";
        // Loop through the string find all occurrences of . and replace them with [.]
        while (i < address.length()) {
            if (address.charAt(i) == '.') {
                newAddress = newAddress + "[.]";
            } else {
                // Automatic type conversion of character to string
                newAddress = newAddress + address.charAt(i);
            }
            i++;
        }
        return newAddress.toString();
    }
}
