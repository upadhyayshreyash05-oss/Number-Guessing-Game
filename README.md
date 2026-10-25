# 🎮 Number Guessing Game (Java)

A simple, interactive **Number Guessing Game** built using Java. The computer generates a random number, and the player gets 10 attempts to guess it correctly. After winning or losing, the player can choose to play again.

## ✨ Features

- 🎲 Random number generation using Java's `Random` class.
- 🔢 Up to 10 attempts per game.
- 📈 Hints to guess a higher or lower number.
- 🏆 Win and lose conditions.
- 🔄 Option to replay the game.
- 💬 Interactive console-based gameplay.

## 🛠️ Technologies Used

- **Language:** Java
- **Libraries:** `java.util.Random`, `java.util.Scanner`
- **IDE/Compiler:** Any Java-compatible IDE or online compiler

## 🚀 How to Run

**1. Clone the repository**

```bash
git clone https://github.com/YOUR-USERNAME/number-guessing-game.git
```

**2. Open the project**

Navigate to the project folder and open `Main.java` in your preferred Java IDE.

**3. Compile and run**

```bash
javac Main.java
java Main
```

## 🎯 How to Play

1. Run the program.
2. The computer generates a random number between 0 and 99.
3. Enter your guess.
4. Follow the hints:
   - `WRONG! TRY BIGGER NUMBER` — guess a higher number.
   - `WRONG! TRY SMALLER NUMBER` — guess a lower number.
5. Guess correctly within 10 attempts to win.
6. Enter `Y` to play again or `N` to exit.

## 💻 Sample Output

```text
Game Started! Guess a number between 0 and 100
50
WRONG ! TRY BIGGER NUMBER
Attempts left = 9
75
WRONG ! TRY SMALLER NUMBER
Attempts left = 8
63
YOU WON !!

Play again? (Y/N)
N

Thanks for playing. Goodbye!
```

*Note: The sample output is illustrative; the actual number and results will vary.*

## 📚 Concepts Practiced

- Variables and data types
- `Random` and `Scanner` classes
- Conditional statements (`if-else`)
- Loops (`do-while` and `while`)
- Boolean variables
- User input and program flow control

## 🔮 Future Improvements

- [ ] Add difficulty levels (Easy, Medium, Hard).
- [ ] Allow users to choose the number range.
- [ ] Track the number of guesses used.
- [ ] Add input validation for invalid entries.
- [ ] Display the best score across multiple rounds.

## 👨‍💻 Author

SHREYASH UPADHYAY

Learning Java and Data Structures & Algorithms, one project at a time.

---

⭐ If you find this project interesting, feel free to star the repository!
