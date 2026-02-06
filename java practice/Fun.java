public class Fun {
    public static void main(String[] args) {
        System.out.println("This is fun game ");
        Game.play();
    }

    public class Game {
        public static void play(){    //----this is static method


            // making gusse the number 
            
            System.out.println("Playing a fun game!");
            int numberToGuess = 7;
            int userGuess = 7; //---This can be taken as input from the user
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number.");
            } else {
                System.out.println("Sorry, try again!");
            }
        }
    }
    
    
}
