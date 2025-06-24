package service;
import java.util.regex.Pattern;

public class verfication {
	
	public boolean Verfication(String name , String email , String password)
	{
		//   Name verification---------------------------------------
		
		if(name.length()!=8)
		{
			System.out.println("\nUsername length must be 6–8 characters.");
			return false;
		}
		boolean hasUppercase = false;

		for (char c : name.toCharArray()) {
		    if (Character.isUpperCase(c)) {
		        hasUppercase = true;
		        break;
		    }
		}
		if (!hasUppercase) {
		    System.out.println("\nUsername must contain at least one capital letter (A-Z).");
		    return false;
		}
		
		// Email verification-----------------------------------------
		
		String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        boolean isValid = Pattern.matches(emailRegex, email);

        if (!isValid) {
            System.out.println("\nInvalid email address.");
            return false;
        }
        
        // Password Verification---------------------------------------
        
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        boolean isValidPass = Pattern.matches(passwordRegex, password);

        if (!isValidPass){
            System.out.println("\nInvalid password.");
            return false;
        }
		
		return true;
	}

}
