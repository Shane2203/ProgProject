import java.util.Scanner;
import java.util.List;
/**
 * Represents a video game.
 * This class is the main class where you build your library. 
 * @author Ozgur
 */
public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static GameLibrary library = new GameLibrary();

    public static void main(String[] args)
    {
        boolean running = true;

        System.out.println("=== GAME LIBRARY SYSTEM ===");

        while(running)
        {
            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                case 1:
                    addGame();
                    break;

                case 2:
                    removeGame();
                    break;

                case 3:
                    showGames();
                    break;

                case 4:
                    searchByGenre();
                    break;

                case 5:
                    running = false;
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public static void printMenu()
    {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Add Game");
        System.out.println("2. Remove Game");
        System.out.println("3. Show All Games");
        System.out.println("4. Search By Genre");
        System.out.println("5. Exit");
        System.out.print("Choose: ");
    }

    public static void addGame()
    {
        System.out.print("Enter game name: ");
        String name = scanner.nextLine();
    
        System.out.print("Enter developer: ");
        String developer = scanner.nextLine();
    
        System.out.print("Enter version: ");
        double version = scanner.nextDouble();
        scanner.nextLine();
    
        System.out.println("Choose Platform:");
        System.out.println("1. PC");
        System.out.println("2. PLAYSTATION");
        System.out.println("3. XBOX");
    
        int platformChoice = scanner.nextInt();
        scanner.nextLine();
    
        PlatformType platform = null;
    
        switch(platformChoice)
        {
            case 1:
                platform = PlatformType.PC;
                break;
    
            case 2:
                platform = PlatformType.PLAYSTATION;
                break;
    
            case 3:
                platform = PlatformType.XBOX;
                break;
    
            default:
                System.out.println("Invalid platform.");
                return;
        }
    
        System.out.println("Choose Genre:");
        System.out.println("1. ACTION");
        System.out.println("2. RPG");
        System.out.println("3. SPORTS");
    
        int genreChoice = scanner.nextInt();
        scanner.nextLine();
    
        GenreType genre = null;
    
        switch(genreChoice)
        {
            case 1:
                genre = GenreType.ACTION;
                break;
    
            case 2:
                genre = GenreType.RPG;
                break;
    
            case 3:
                genre = GenreType.SPORTS;
                break;
    
            default:
                System.out.println("Invalid genre.");
                return;
        }
    
        System.out.print("Enter rating: ");
        double rating = scanner.nextDouble();
        scanner.nextLine();
    
        Game game = new Game(name, developer, version,
                             platform, genre, rating);
    
        library.addGame(game);
    
        System.out.println("Game added.");
    }

    public static void removeGame()
    {
        showGames();

        System.out.print("Enter game index to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        Game game = library.selectGame(index);

        if(game != null)
        {
            library.removeGame(game);
            System.out.println("Game removed.");
        }
        else
        {
            System.out.println("Invalid index.");
        }
    }

    public static void showGames()
    {
        List<Game> games = library.getGames();

        if(games.size() == 0)
        {
            System.out.println("No games in library.");
        }
        else
        {
            System.out.println("\n=== GAMES ===");

            for(int i = 0; i < games.size(); i++)
            {
                System.out.println(i + ": " + games.get(i));
            }
        }
    }

    public static void searchByGenre()
    {
        System.out.println("Choose Genre:");
        System.out.println("1. ACTION");
        System.out.println("2. RPG");
        System.out.println("3. SPORTS");

        int choice = scanner.nextInt();
        scanner.nextLine();

        GenreType genre = null;

        switch(choice)
        {
            case 1:
                genre = GenreType.ACTION;
                break;

            case 2:
                genre = GenreType.RPG;
                break;

            case 3:
                genre = GenreType.SPORTS;
                break;

            default:
                System.out.println("Invalid genre.");
                return;
        }

        List<Game> results = library.findByGenre(genre);

        if(results.size() == 0)
        {
            System.out.println("No games found.");
        }
        else
        {
            System.out.println("\n=== RESULTS ===");

            for(Game g : results)
            {
                System.out.println(g);
            }
        }
    }
}