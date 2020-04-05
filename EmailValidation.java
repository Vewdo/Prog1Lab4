import java.util.Scanner;
public class EmailValidation {
public static void main(String[] args) {

		int a = 0;

				Scanner emailAddress = new Scanner(System.in);
				System.out.println("Enter your email address: ");
				String email = emailAddress.nextLine();


				for (int i = 0; i < email.length(); i++) {
					char emailReader = email.charAt(i);

					if (emailReader == '@') {

						String test = email.substring(email.lastIndexOf("@")+ 1);

							for (int c = 0; c < test.length(); c++) {
									char emailDot = test.charAt(c);

									if (emailDot == '.') {
										String trying = test.substring(test.lastIndexOf(".")+ 1);
										for (int e = 0; e < trying.length(); e++) {
												char fnalEmailTest = trying.charAt(e);
												if (Character.isLetter(email.charAt(e))) {
													a += 1;
												} else if (emailReader!='@') {
														a = 0; }
											}
										}
							}
				}
			}if (a > 1) {
		System.out.println("valid email");
		} else {
		System.out.println("invalid email");
		}
		}
	}