// Mercredi 25 Décembre 2024: 
// Exercice de création d'un vérificateur de Saisons en fonction des mois de l'année. 


import java.util.Scanner; 

public class SeasoncheckerTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        /* Si je veux pouvoir relancer le programme après avoir entré un mois, je peux creer 
         * une boucle while, mais avant ça il me faut un vérificateur de condition (true/false)
         * donc un boolean
         */

        boolean keepGoing = true; // Vérificateur de condition configuré sur "vrai" par défaut pour que l'utilisateur continu d'utiliser le programme. 


        // Implémentation de la boucle while qui relance le programme tant que l'utilisateur veux continuer de l'utiliser. 
        while (keepGoing) { // Boucle while qui prend (keepgoing) en paramètre et qui se répète tant que la condition est vraie.
            System.out.println("Enter a month to know which season we're in:");
            String wordInput = input.nextLine().trim(); // Création de la variable "wordInput" pour stocker l'entrée utilisateur temporairement!

            /*
             * .nextLine() = permet de récupérer la ligne entière
             * .trim() = permet de supprimer les espaces entrés accidentellement par l'utilisateur. 
             */

            /* Je dois creer un sous programme capable de vérifier que l'entrée de mon utilisateur correspond 
             * bien à la valeur d'un des mois du tableau.
             * Encore une fois, je vais avoir besoin d'un "boolean" de vérification!
             */

            boolean IsUserEntryValid = false; 
            for (String month : months) { // Creation de la variable temporaire "month" stockant chaque element du tableau. 
                if (month.equals(wordInput)) { // Si l'entrée utilisateur est égale à un mois du tableau, 
                    IsUserEntryValid = true; // alors la variable "IsUserEntryValid" devient true.
                    break; // On sort de la boucle for
                    } 

} /*  Fin de la boucle forEach 
    * Pour vérifier si l'entrée de l'utilisateur est valide,
    * je dois en sortir pour éviter les érreurs de compilation!
    * point très important!   
    */
        // Vérification de la validité de l'entrée: si l'utilisateur a entré un mot invalide.
                    if (!IsUserEntryValid) { // Si la variable "IsUserEntryValid" est false, alors l'entrée utilisateur est invalide
                    // l'opérateur ! permet de retourner le sens de la condition
                        System.out.println("Invalid input! Please try again.");
                        continue; // Recommence la boucle
                        }

            // Creation de mes vérificateur de saison: 

  
            boolean isSpringIf = wordInput.equals("March") || wordInput.equals("April") || wordInput.equals("May");
            // Si l'entrée utilisateur (wordInput) est égale à l'un des mois de printemps, alors isSpringIf est true.
            boolean isSummerIf = wordInput.equals("June") || wordInput.equals("July") || wordInput.equals("August");  
            // Si l'entrée utilisateur (wordInput) est égale à l'un des mois d'été, alors isSummerIf est true.
            boolean isAutumnIf = wordInput.equals("September") || wordInput.equals("October") || wordInput.equals("November"); 
            // Si l'entrée utilisateur (wordInput) est égale à l'un des mois d'automne, alors isAutumnIf est true.
            boolean isWinterIf = wordInput.equals("December") || wordInput.equals("January") || wordInput.equals("February");
            // Si l'entrée utilisateur (wordInput) est égale à l'un des mois d'hiver, alors isWinterIf est true.

            if (isSpringIf) { // Si la variable "isSpringIf" est true, alors l'utilisateur a entré un mois d
                System.out.println("The season is Spring");
            } else if (isSummerIf) { // Sinon si la variable "isSummerIf" est true, alors l'utilisateur a entré un mois d
                System.out.println("The season is Summer");
            } else if (isAutumnIf) { // Sinon si la variable "isAutumnIf" est true, alors l'utilisateur a entré
                System.out.println("The season is Autumn");
            } else if (isWinterIf) { // Sinon si la variable "isWinterIf" est true, alors l'utilisateur a entré
                System.out.println("The season is Winter");
            }

            // Je peux maintenant implémenter la fonctionnalité pour relancer le programme si besoin:
            System.out.println("Do you want to check another month? (yes/no)");
            String continueChoice = input.nextLine().trim().toLowerCase(); // Lecture de la réponse utilisateur par la création d'une variable temporaire.
            
            if (continueChoice.equals("no")) { // Si la réponse utilisateur est "no", alors le programme s'arrête.
                System.out.println("Thank you for using the Season Checker! Goodbye!"); // en envoyant ce message,
                keepGoing = false; // et en changeant la variable "keepGoing" en false.
            } else if (!continueChoice.equals("yes")) { // Si la réponse utilisateur n'est pas "yes" ou "no", alors le programme notifie l'utilisateur.
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }
}