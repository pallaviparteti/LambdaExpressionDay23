package com.lambdaexpression;

public class UserResistrationMainMethod {
	public static void main(String[] args) {
		UserRegistrationUseCases userresistration = new UserRegistrationUseCases();
		userresistration.ValidateFirstName();
		userresistration.ValidateLastName();
		userresistration.ValidateEmail();
		userresistration.ValidateMobileNoFormat();
		userresistration.PasswordRuleMinimum8Character();
		userresistration.PasswordRuleAtleastOneUpperCase();
		userresistration.PasswordRuleAtleastOneNumericValue();
		userresistration.PasswordRuleExactlyOneSpecialCharacter();
		userresistration.ClearAllEmailSample();
	}
}