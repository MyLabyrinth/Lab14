import java.util.Scanner;
import java.util.Random;

public class Lab14 {
    
    // Sorted array of monster power levels
    static int[] monsterPowerLevels = {5, 12, 18, 25, 32, 40, 55, 68, 75, 88, 95};
    
    public static void main(String[] args) {
        System.out.println("=== MONSTER POWER LEVEL SCANNER ===\n");
        
        // PART 1: Display Monster Database & Test Binary Search
        part1();
        
        // PART 2: Get Player Power & Find Matching Monsters
        part2();
        
        // PART 3: Interactive Monster Hunter
        part3();
    }
    
    /**
     * PART 1: Create Monster Database & Implement Binary Search
     * Display the sorted monster array, show how many monsters exist, 
     * and test the binary search method with several different power levels
     */
    public static void part1() {
        System.out.println("--- Monster Database Loaded ---");
        
        // Display the database with proper formatting: Power Levels: [5, 12, 18, ...]
        System.out.print("Power Levels: [");
        for (int i = 0; i < monsterPowerLevels.length; i++) {
            _____________________________________;  // Access element at current index i
            if (i < monsterPowerLevels.length - 1) 
                _____________________________________;  // Add separator between elements (except last)
        }
        System.out.println("]");
        
        // Show the total number of creatures in our database
        _____________________________________;  // Use array property to get size
        
        // Confirm that the data is ready to use
        _____________________________________;  // Let user know the array is sorted
        System.out.println();
        
        // Test the binary search with different scenarios
        System.out.println("--- Testing Binary Search ---");
        
        // Scenario 1: Power level 40 exists in the database
        _____________________________________;  // Call binarySearch, store the result
        System.out.print("Searching for power 40... ");
        _____________________________________;  // Check if element was found (compare result to -1)
        
        
        
        // Scenario 2: Power level 50 does not exist in the database
        _____________________________________;  // Call binarySearch with a value that doesn't exist
        System.out.print("Searching for power 50... ");
        _____________________________________;  // Check the result and print appropriate message
        
        
        
        // Scenario 3: Edge case - search for smallest power level (5)
        _____________________________________;  // Call binarySearch for boundary value
        System.out.print("Searching for power 5... ");
        _____________________________________;  // Verify if boundary search works correctly
        
        
        
        System.out.println();
    }
    
    /**
     * PART 2: Get Player Power & Find Appropriate Monsters
     * Ask the user for their power level and find three types of monsters:
     * - One at exactly their level
     * - The strongest one they can defeat
     * - The weakest one that would challenge them
     */
    public static void part2() {
        System.out.println("--- Player Monster Match ---");
        
        // Create input mechanism and ask for player's power level
        _____________________________________;  // Set up Scanner for user input
        _____________________________________;  // Prompt user for their power level
        _____________________________________;  // Store the user's response
        System.out.println();
        
        // Search 1: Find a monster with EXACT power match
        System.out.println("1. Exact Match Search (power = " + playerPower + "):");
        _____________________________________;  // Use binary search to find exact match
        _____________________________________;  // Determine if match was found and display result
        
        
        
        // Search 2: Find strongest monster player can beat (power <= playerPower)
        System.out.println("\n2. Beatable Monster Search (power ≤ " + playerPower + "):");
        _____________________________________;  // Call appropriate method to find beatable monster
        _____________________________________;  // Check result and show what was found
        
        
        
        // Search 3: Find weakest monster that's stronger (power > playerPower)
        System.out.println("\n3. Challenge Search (power > " + playerPower + "):");
        _____________________________________;  // Call appropriate method to find challenge
        _____________________________________;  // Check result and display challenge or message
        
        
        
        System.out.println();
    }
    
    /**
     * Find the strongest monster the player can defeat
     * This uses binary search logic to find the LARGEST value that is still <= playerPower
     * 
     * Think about it: If you keep moving right when you find a valid monster,
     * you'll eventually find the strongest one you can beat!
     */
    public static int findBeatableMonster(int[] array, int playerPower) {
        _____________________________________;  // Initialize left boundary
        _____________________________________;  // Initialize right boundary  
        _____________________________________;  // Initialize variable to track best result found
        
        // Search for the rightmost position where value <= playerPower
        while (left <= right) {
            _____________________________________;  // Calculate middle point between boundaries
            _____________________________________;  // Get the value at middle position
            
            // When middle value is acceptable (beatable)
            if (middleValue <= playerPower) {
                _____________________________________;  // Remember this as a potential answer
                _____________________________________;  // Search toward stronger monsters (move boundary right)
            } 
            // When middle value is too strong
            else {
                _____________________________________;  // Search toward weaker monsters (move boundary left)
            }
        }
        
        _____________________________________;  // Return the strongest monster found (or -1 if none)
    }
    
    /**
     * Find the weakest monster that's stronger than the player
     * This uses binary search logic to find the SMALLEST value that is > playerPower
     * 
     * Think about it: If you keep moving left when you find a valid challenge,
     * you'll eventually find the easiest challenge available!
     */
    public static int findChallengeMonster(int[] array, int playerPower) {
        _____________________________________;  // Initialize left boundary
        _____________________________________;  // Initialize right boundary
        _____________________________________;  // Initialize variable to track best result found
        
        // Search for the leftmost position where value > playerPower
        while (left <= right) {
            _____________________________________;  // Calculate middle point between boundaries
            _____________________________________;  // Get the value at middle position
            
            // When middle value is too strong (but could be a challenge)
            if (middleValue > playerPower) {
                _____________________________________;  // Remember this as a potential answer
                _____________________________________;  // Search toward weaker challenges (move boundary left)
            } 
            // When middle value is not strong enough
            else {
                _____________________________________;  // Search toward stronger monsters (move boundary right)
            }
        }
        
        _____________________________________;  // Return the weakest challenge found (or -1 if none)
    }
    
    /**
     * PART 3: Interactive Monster Hunter
     * Create a repeating game where the player can:
     * 1) Hunt beatable monsters for guaranteed wins
     * 2) Attempt challenges for higher rewards but with risk
     * 3) Search the database for specific monsters
     * 4) Exit and see their final stats
     */
    public static void part3() {
        System.out.println("=== MONSTER HUNTER ADVENTURE ===\n");
        
        // Set up game state variables
        _____________________________________;  // Starting power for the adventure
        _____________________________________;  // Remember where they began
        _____________________________________;  // Track successful hunts
        _____________________________________;  // Track failed attempts
        
        // Create objects needed for gameplay
        _____________________________________;  // Mechanism for reading player choices
        _____________________________________;  // Generator for random outcomes
        _____________________________________;  // Control the main game loop
        
        // Main gameplay loop - repeat menu until exit
        _____________________________________;  // Loop condition: continue while playing
        {
            // Find monsters appropriate for current power level
            _____________________________________;  // Search for beatable option
            _____________________________________;  // Search for challenge option
            
            // Display current situation
            System.out.println("\n--- Your Status ---");
            System.out.println("Current Power Level: " + playerPower);
            _____________________________________;  // Show beatable monster or "None"
            _____________________________________;  // Show challenge monster or "None"
            
            // Present choices to player
            System.out.println("\n--- What would you like to do? ---");
            System.out.println("1. Hunt a beatable monster");
            System.out.println("2. Attempt a challenge");
            System.out.println("3. Search for specific power level");
            System.out.println("4. Exit");
            System.out.print("\nChoice: ");
            
            // Get player's decision
            _____________________________________;  // Read the menu choice
            
            // Handle each possible choice
            _____________________________________;  // Start of decision structure
            {
                _____________________________________;  // Option: Hunt guaranteed win
                    if (beatable != -1) {
                        System.out.println("\n⚔️ You fight the monster at power " + beatable + "!");
                        System.out.println("✓ VICTORY! You defeated it!");
                        _____________________________________;  // Store power before change
                        _____________________________________;  // Gain 2 power for winning
                        _____________________________________;  // Count this as a win
                        System.out.println("Your power: " + oldPower + " → " + playerPower);
                    } else {
                        System.out.println("✗ You have no beatable monsters!");
                    }
                    _____________________________________;  // End this option
                    
                _____________________________________;  // Option: Risky challenge
                    if (challenge != -1) {
                        System.out.println("\n⚔️ You attempt the monster at power " + challenge + "!");
                        _____________________________________;  // Generate random outcome (true or false)
                        if (victory) {
                            System.out.println("✓ VICTORY! You defeated it!");
                            _____________________________________;  // Store power before change
                            _____________________________________;  // Gain 5 power for harder win
                            _____________________________________;  // Count this as a win
                            System.out.println("Your power: " + oldPower + " → " + playerPower);
                        } else {
                            System.out.println("💥 DEFEAT! The monster was too strong.");
                            System.out.println("You escaped and lived to fight another day.");
                            _____________________________________;  // Count this loss
                            System.out.println("Your power: " + playerPower + " (unchanged)");
                        }
                    } else {
                        System.out.println("✗ You can beat all monsters! No challenge available.");
                    }
                    _____________________________________;  // End this option
                    
                _____________________________________;  // Option: Search database
                    System.out.print("What power level to search for? ");
                    _____________________________________;  // Get search target from player
                    System.out.println("\n🔍 Using binary search...");
                    _____________________________________;  // Search the database
                    if (searchResult != -1) {
                        System.out.println("✓ Found monster at power " + searchPower + "!");
                        System.out.println("Located at index " + searchResult + "! ⚡");
                    } else {
                        System.out.println("✗ No monster found at power " + searchPower);
                    }
                    _____________________________________;  // End this option
                    
                _____________________________________;  // Option: End the adventure
                    _____________________________________;  // Stop the game loop
                    _____________________________________;  // End this option
                    
                _____________________________________;  // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        // Show final results after adventure ends
        System.out.println("\n=== SESSION COMPLETE ===");
        System.out.println("Starting power: " + startingPower);
        System.out.println("Final power: " + playerPower);
        _____________________________________;  // Show hunt record
        _____________________________________;  // Show total power gain
    }
    
    /**
     * BINARY SEARCH METHOD
     * 
     * Efficiently find a value in a sorted array by repeatedly eliminating half the search space.
     * This is much faster than checking every element one by one!
     * 
     * @param array - must be SORTED for this to work correctly
     * @param target - what we're looking for
     * @return - position where target is found, or -1 if not found
     * 
     * The algorithm works by:
     * 1. Starting with the full range (left to right)
     * 2. Checking the middle element
     * 3. If match: we're done!
     * 4. If target < middle: eliminate right half, search left
     * 5. If target > middle: eliminate left half, search right
     * 6. Repeat until found or range is empty
     */
    public static int binarySearch(int[] array, int target) {
        _____________________________________;  // Mark the beginning of search range
        _____________________________________;  // Mark the end of search range
        
        // Keep searching while there's a range to search
        _____________________________________;  // Loop while boundaries haven't crossed
        {
            // Find the middle of current search range
            _____________________________________;  // Calculate middle safely (avoid overflow)
            _____________________________________;  // Get the value at middle position
            
            // Exact match - we found it!
            if (middleValue == target) {
                _____________________________________;  // Return the position where found
            }
            // Target is in the left half
            else if (target < middleValue) {
                _____________________________________;  // Narrow range by eliminating right half
            }
            // Target is in the right half
            else {
                _____________________________________;  // Narrow range by eliminating left half
            }
        }
        
        // If we exit the loop, the target was never found
        _____________________________________;  // Return the "not found" signal
    }
}