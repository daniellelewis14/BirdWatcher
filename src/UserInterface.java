import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface{
  private ArrayList<Bird> birds;

  public UserInterface() {
    this.birds = new ArrayList<>();
  }

  public void add(Bird bird) {
    birds.add(bird);
  }

  public void observation(Bird bird) {
    bird.observe();
  } 

  public void printAll() {
    for(Bird bird: birds) {
      System.out.println(bird);
    }
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);
    
        while(true) {
            System.out.print("? ");
            String command = scanner.nextLine();
    
            switch(command) {
                case "Add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    birds.add(new Bird(name, latinName));
                    continue;

                
                case "Observation":
                    int observations = 0;
                    System.out.print("Bird? ");
                    String birdToObserve = scanner.nextLine();
                    for(Bird bird: birds){
                        if (bird.getName().equals(birdToObserve)) {
                        bird.observe();
                        observations++;
                        } 
                    }
                    if (observations == 0) {
                        System.out.println("Not a bird!");
                    }
                    continue;

                
                case "All":
                    printAll();
                    continue;

                
                case "One": 
                    System.out.print("Bird? ");
                    String birdToPrint = scanner.nextLine();
                    for(Bird bird: birds) {
                        if(bird.getName().equals(birdToPrint)) {
                            System.out.println(bird);
                        }
                    }
                    continue;


                case "Quit":
                    return;

            }
        }
    }

}