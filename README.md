**Java Virtual Slot Machine**
A high-stakes, terminal-based slot machine simulator. This project demonstrates complex conditional logic, stateful game loops, and the use of modular static methods to create an engaging user experience.

**1. How to Play:**
-Launch the Game: Run the program in your terminal. You start with a bankroll of $1,000.
-Place Your Bet: Enter the amount you want to wager for the current spin.
-Note: The system will block you if you try to bet more than your current balance.
-The Spin: The machine will generate three random symbols (Reels).
-Winning & Payouts:
-3-of-a-kind: Match all three symbols for a massive Jackpot!
-2-of-a-kind: Match any two adjacent symbols for a smaller prize.
-Continue or Quit: * If you win, you automatically keep playing with your new balance.
-If you lose, the machine will ask if you want to try again (yes/no).
-The game ends automatically if your balance hits $0

**2. Key Features:**
-Emoji-Based UI: Uses modern UTF symbols for a visually appealing "reel" spin.
-Smart Wallet Management: Prevents negative betting and tracks total balance across sessions.
-Defensive Programming: Handles invalid bets and out-of-funds scenarios gracefully.

**3. Tech Stack & Logic:**
-Randomization: Powered by java.util.Random for unpredictable outcomes.
-Enhanced Switches: Uses modern Java switch expressions for clean payout calculations.
-Modular Design: Divided into spinrow(), displayRow(), and payout() methods for better maintainability.
