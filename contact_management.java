package pack2;
import java.util.Scanner;
public class contact_management {
 
	    private static  int MAX_CONTACTS = 10;
	    private static String[] names = new String[MAX_CONTACTS];
	    private static String[] phoneNumbers = new String[MAX_CONTACTS];
	    private static String[] emails = new String[MAX_CONTACTS];
	    private static int numContacts = 0;
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n-----CONTACT MANAGEMENT SYSTEM-----");
	            System.out.println("\n1. ADD CONTACT");
	            System.out.println("2. VIEW CONTACTS");
	            System.out.println("3. UPDATE CONTACT");
	            System.out.println("4. DELETE CONTACT");
	            System.out.println("5. EXIT");
	            System.out.print("\nENTER YOUR CHOICE : ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    addContact();
	                    break;
	                case 2:
	                    viewContacts();
	                    break;
	                case 3:
	                    updateContact();
	                    break;
	                case 4:
	                    deleteContact();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("\nINVALID CHOICE. PLEASE ENTER A NUMBER BETWEEN 1 AND 5.");
	            }
	        }
	    }

	    private static void addContact() {
	    	int i,n;
	    	System.out.print("\nENTER THE NO OF CONTACT TO BE ADD :");
	    	int len = scanner.nextInt();
	    	scanner.nextLine();
	    	for(i=1;i<=len;i++){
	    		
	        if (numContacts < MAX_CONTACTS) {
	            System.out.print("\nENTER NAME : ");
	            String name = scanner.nextLine();
	            System.out.print("ENTER PHONE NUMBER : ");
	            String phoneNumber = scanner.nextLine();
	            System.out.print("ENTER EMAIL ADDRESS : ");
	            String email = scanner.nextLine();

	            names[numContacts] = name;
	            phoneNumbers[numContacts] = phoneNumber;
	            emails[numContacts] = email;
	            numContacts++;

	            System.out.println("\n----CONTACT ADDED SUCCESSFULLY-----");
	        } else {
	            System.out.println("\nMAXIMUM CONTACTS REACHED.EXTEND THE  CONTACT SIZE PLUS 10 ");
	            System.out.println("\nSO TRY AGAIN....");
	            MAX_CONTACTS+=10;
	            break;
	        }
	    	}
	    }

	    private static void viewContacts() {
	    	while (true) {
	    	    System.out.println("\n1.VIEW ALL CONTACT");
	    	    System.out.println("2.SEARCH CONTACT");
	    	    System.out.println("3.EXIT THE VIEW CONTACT");
	    	    System.out.print("\nENTER THE CHOICE :");
	    	    char choice = scanner.next().charAt(0);
	    	    scanner.nextLine();

	    	    switch (choice) {
	    	        case '1':
	    	            if (numContacts == 0) {
	    	                System.out.println("\nNO CONTACTS AVAILABLE");
	    	                break;
	    	            }

	    	            System.out.println("\nVIEW ALL CONTACTS:");
	    	            for (int i = 0; i < numContacts; i++) {
	    	                System.out.println("\n"+(i + 1)+ ". " + names[i] + " | " + phoneNumbers[i] + " | " + emails[i]);
	    	            }
	    	            break;

	    	        case '2':
	    	            System.out.print("\nENTER THE CONTACT NAME :");
	    	            String searchName = scanner.nextLine();
	    	            boolean found = false;
	    	            for (int i = 0; i < numContacts; i++) {
	    	                if (searchName.equalsIgnoreCase(names[i])) {
	    	                    System.out.println("\n"+(i + 1) + ". " + names[i] + " | " + phoneNumbers[i] + " | " + emails[i]);
	    	                    found = true;
	    	                }
	    	            }
	    	            if (!found) {
	    	                System.out.println("\nNO SUCH CONTACT FOUND");
	    	            }
	    	            break;

	    	        case '3':
	    	            System.out.println("\nEXITED THE VIEW CONTACT....");
	    	            return;

	    	        default:
	    	            System.out.println("\nINVALID CHOICE");
	    	            break;
	    	    }
	    	}

	    }

	    private static void updateContact() {
	        if (numContacts == 0) {
	            System.out.println("\nNO CONTACTS  AVAILABLE TO UPDATE.");
	            return;
	        }

	        System.out.print("\nENTER THE INDEX OF THE CONTACT TO UPDATE : ");
	        int index = scanner.nextInt();
	        scanner.nextLine();

	        if (index >= 1 && index <= numContacts) {
	            System.out.print("\nENTER NEW NAME : ");
	            names[index - 1] = scanner.nextLine();
	            System.out.print("ENTER PHONE NUMBER : ");
	            phoneNumbers[index - 1] = scanner.nextLine();
	            System.out.print("ENTER NEW EMAIL ADDRESS : ");
	            emails[index - 1] = scanner.nextLine();
	            System.out.println("\n-----CONTACT UPDATED SUCCESSFULLY-----");
	        } else {
	            System.out.println("\nINVALID INDEX. NO CONTACT FOUND FOR THE GIVEN INDEX.");
	        }
	    }

	    private static void deleteContact() {
	        if (numContacts == 0) {
	            System.out.println("\nNO CONTACTS AVAILABLE TO DELETE.");
	            return;
	        }

	        System.out.print("\nENTER INDEX OF THE CONTACT TO DELETE : ");
	        int index = scanner.nextInt();
	        scanner.nextLine();

	        if (index >= 1 && index <= numContacts) {
	            for (int i = index - 1; i < numContacts - 1; i++) {
	                names[i] = names[i + 1];
	                phoneNumbers[i] = phoneNumbers[i + 1];
	                emails[i] = emails[i + 1];
	            }
	            numContacts--;
	            System.out.println("\n-----CONTACT DELETED SUCCESSFULLY-----");
	        } else {
	            System.out.println("\nINVALID INDEX. NO CONTACT FOUND FOR THE GIVEN INDEX.");
	        }
	    }
	

	}

