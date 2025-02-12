import random

def play_game():
    # 1. Generate a random number between 1 to 100
    target_number = random.randint(1, 100)
    max_tries = 10
    attempts = 0

    print("Welcome to the Number Guessing Game!")
    print("I have generated a random number between 1 and 100.")
    print(f"You have {max_tries} tries to guess the correct number.\n")

    # 2. Set up user input allowing user to guess using appropriate method
    while attempts < max_tries:
        try:
            # 7. Handle invalid inputs by ensuring player inputs only numbers
            guess = int(input("Enter your guess: "))
        except ValueError:
            print("Invalid input! Please enter a number between 1 and 100.")
            continue

        attempts += 1

        # 3. Compare guess number with generated target number whether too high or too low or correct
        if guess < target_number:
            # 4. Inform the player if guess needs adjustments
            print("Too low! Try again.\n")
        elif guess > target_number:
            print("Too high! Try again.\n")
        else:
            # 4. Inform the player if guess is correct
            print(f"Congratulations! You guessed the correct number {target_number} in {attempts} tries.\n")
            break
    else:
        print(f"Sorry, you've reached the maximum number of tries. The correct number was {target_number}.\n")

    # 8. Add an option to play again without running the program
    play_again = input("Do you want to play again? (yes/no): ").strip().lower()
    if play_again == 'yes':
        play_game()
    else:
        print("Thank you for playing! Goodbye.")

# Start the game
play_game()