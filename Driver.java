import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();
        
        Scanner input = new Scanner(System.in);
        char option;
        
        do
        {
        	displayMenu();
        	option = input.next().charAt(0);
        	if (option =='1') {
        		intakeNewDog(input);
        	}
        	else if (option == '2') {
        		intakeNewMonkey(input);
        	}
        	else if (option == '3') {
        		reserveAnimal(input);
        	}
        	else if (option == '4') {
        		printAnimals(option);
        	}
        	else if (option == '5') {
        		printAnimals(option);
        	}
        	else if (option == '6') {
        		printAnimals(option);
        	}
        	else if (option == 'q') {
        		System.out.print("You have entered an invalid input. Please enter a valid input. ");
        	}
        }
        while (option != 'q');
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Alan", "male", "2", "8.5", "03-10-2020", "United States", "in service", false, "United States", "Squirrel Monkey", "14.8", "15.6", "17.2");
    	Monkey monkey2 = new Monkey("Lucas", "male", "1", "7.2", "09-12-2021", "Argentina", "Phase 4", true, "United States", "Capuchin", "19", "21.2", "18.5");
    	Monkey monkey3 = new Monkey("Sasha", "female", "3", "18.2", "07-07-2019", "Columbia", "in service", true, "Columbia", "Tamarin", "15.2", "11", "12.2");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition Country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is this dog reserved?");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Which country is the dog in service?");
        String inServiceCountry = scanner.nextLine();
        
        Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(dog4);
        System.out.println("Your entry has been added to the Dog List");
        
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
        	String name = scanner.nextLine();
        	for(Monkey monkey: monkeyList) {
        		if(monkey.getName().equalsIgnoreCase(name)) {
        			System.out.println("\n\nThis monkey is already in our system\n\n");
        			return; //returns to menu
        		}
        	}
        	System.out.println("What is the monkey's gender?");
        	String gender = scanner.nextLine();
        	System.out.println("What is the monkey's age?");
        	String age = scanner.nextLine();
        	System.out.println("What is the monkey's weight?");
        	String weight = scanner.nextLine();
        	System.out.println("What is the monkey's acquisition date?");
        	String acquisitionDate = scanner.nextLine();
        	System.out.println("What is the monkey's acquisition Country?");
        	String acquisitionCountry = scanner.nextLine();
        	System.out.println("What is the monkey's training status?");
        	String trainingStatus = scanner.nextLine();
        	System.out.println("Is this monkey reserved?");
        	boolean reserved = scanner.nextBoolean();
        	System.out.println("Which Country is the monkey in service?");
        	String inServiceCountry = scanner.nextLine();
        	System.out.println("What is the monkey's species?");
        	String species = scanner.nextLine();
        	System.out.println("What is the monkey's tail length?");
        	String tailLength = scanner.nextLine();
        	System.out.println("What is the monkey's height?");
        	String height = scanner.nextLine();
        	System.out.println("What is the body length?");
        	String bodyLength = scanner.nextLine();
        	
        	Monkey monkey4 = new Monkey(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, species, tailLength, height, bodyLength);
        	monkeyList.add(monkey4);
        	System.out.println("Your entry has been added to the Monkey List.");
        }
        	

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	scanner.nextLine();
            System.out.println("Enter animal type: ");
            String animalType = scanner.nextLine();
            if (animalType.equalsIgnoreCase("Monkey")) {
            	System.out.println("Enter the monkey's acquisiton Country: ");
            	String country = Scanner.nextLine();
            	for (Monkey obj: monkeyList) {
            		if (obj.getAcquisitionLocation().equalsIgnoreCase(country)) {
            			obj.setReserved(true);
            			System.out.println("This monkey is now reserved.");
            			return;
            		}
            	}
            	System.out.println("The dog entered is not in the list.");
            }
            else {
            	System.out.println("Animal type not found.");
            }
        }
            		

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(char option) {
        	if (option == '4') {
        		System.out.println(dogList);
        	}
        	else if (option == '5') {
        		System.out.println(monkeyList);
        	}
        	else if (option == '6') {
        		for (int i = 0; i < dogList.size(); i++) {
        			if (dogList.get(i).getTrainingStatus().equals("in service") && dogList.get(i).getReserved()==false) {
        				System.out.println(dogList.get(i));
        			}
        		}
        		for (int i = 0; i < monkeyList.size(); i++) {
        			if (monkeyList.get(i).getTrainingStatus().equals("in service") && monkeyList.get(i).getReserved()==false) {
        				System.out.println(monkeyList.get(i));
        			}
        		}
        	}
        }
}

