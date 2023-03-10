package helpdesk.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    // Apsirašomi validacijos šablonai, pagal kuriuos tikrinsime vartotojo įvestus duomenis.
    public static final String USERNAME_REGEX_PATTERN = "^[a-zA-Z0-9]{5,13}$";
    public static final String PASSWORD_REGEX_PATTERN = "^[a-zA-Z0-9!@#$%]{5,13}$";

    /**
     * Funkcija tikrinanti ar vartotojo įvesti duomenys prisijungimo vardui atitinka validacijos šabloną.
     * @param username Vartotojo įvestas prisijungimo vardas.
     * @return true - Jeigu vartotojo įvestas vardas atitinka validacijos šabloną, false - Priešingu atvėju.
     */
    public static boolean isValidUsername(String username){
        // Pagal 7 eilutėje apsirašytą šabloną sukuriamos taisyklės (naudojant biblioteką).
        Pattern pattern = Pattern.compile(USERNAME_REGEX_PATTERN);
        // Vartotojo įvestas prisijungimo vardas palyginamas su aukščiau sukurtom taisyklėm.
        Matcher matcher = pattern.matcher(username);
        // true - Jeigu vartotojo įvestas vardas atitinka validacijos šabloną, false - Priešingu atvėju.
        return matcher.find();
    }

    public static boolean isValidPassword(String passsword){
        Pattern pattern = Pattern.compile(PASSWORD_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(passsword);
        return matcher.find();
    }
}
