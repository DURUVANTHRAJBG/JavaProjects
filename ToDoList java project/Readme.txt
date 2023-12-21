Import Statements:

		import java.util.ArrayList;
		import java.util.Scanner;

These lines import the necessary Java classes. ArrayList is used to store the list of tasks, and Scanner is used to read input from the user.


TodoList Class:

		public class TodoList {

This class encapsulates the to-do list and provides methods to add, remove, and display tasks.

ArrayList<String> tasks;: This variable is an ArrayList that will store the tasks as strings.

public TodoList(): The constructor initializes the tasks ArrayList.

public void addTask(String task): This method adds a task to the list.

public void removeTask(int index): This method removes a task by its index from the list.

public void displayTasks(): This method displays all tasks in the list.


Main Method:

		public static void main(String[] args) {


The main method is the entry point of the program and contains the logic to interact with the user.

TodoList todoList = new TodoList();: An instance of the TodoList class is created to manage tasks.

Scanner scanner = new Scanner(System.in);: A Scanner object is created to read user input.

The program enters a loop that displays a menu and waits for the user's choice. The menu includes options to add tasks, remove tasks, display tasks, or exit the program.

The switch statement handles the user's choice and performs the corresponding action:

case 1: Allows the user to add a task.
case 2: Allows the user to remove a task by index.
case 3: Displays the list of tasks.
case 4: Exits the program.
The program continues to display the menu and process user input until the user chooses to exit.

Closing Resources:

		scanner.close();
		System.exit(0);

After the user chooses to exit the program, the Scanner is closed to release resources, and the program is terminated using System.exit(0).

Overall, this program provides a simple command-line interface for managing a to-do list. Users can add tasks, remove tasks by index, and display the current list of tasks. The program continues to run until the user chooses to exit. It serves as a basic foundation that can be extended to add more features and functionality to the to-do list application.