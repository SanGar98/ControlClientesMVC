package co.com.udemy.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author SantiagoPC
 */
public class EncriptarPassword {
    public static void main(String[] args) {
        
        var password = "654";
        System.out.println("password: " + password);
        System.out.println("password encriptado: " + encriptarPassword(password));
        
    }
    public static String encriptarPassword(String password){
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            return encoder.encode(password);
    }
}
