📋 README.md

# ✅ Simple Java To-Do List App

A beginner-friendly **console-based To-Do List** written in **Java**.  
This project demonstrates fundamental OOP principles like **classes**, **methods**, **encapsulation**, and **user interaction** through the console.

---

## 📌 **Features**

- ➕ Add a task with a custom description.
- 📋 View all tasks with clear status (✔ Complete or ❌ Incomplete).
- ✅ Mark tasks as complete.
- 🔄 Mark tasks as incomplete.
- ✏️ Edit a task’s description.
- 🗑️ Delete tasks.
- 🔁 User-friendly text menu loop.
- 📚 Fully written in pure Java — no external dependencies.

---

## 🚀 **How to Run**

1. **Clone the project**  
   git clone https://github.com/yourusername/your-repo-name.git
Open in IntelliJ IDEA (or any Java IDE).

Make sure you have a JDK installed (e.g., OpenJDK 17 or higher).

Run ToDoListApp.java → This will start the console menu.

💡 How It Works
The main loop displays a menu with options:
1️⃣ Add Task
2️⃣ View Tasks
3️⃣ Mark Task Complete
4️⃣ Mark Task Incomplete
5️⃣ Edit Task
6️⃣ Delete Task
7️⃣ Exit

All tasks are stored in an ArrayList<Task> during runtime.

Tasks have a description and a isComplete status.

Marking complete/incomplete or editing works by selecting the task number from the list.

🗂️ Code Structure
Task.java

A simple Task class with:

String description

boolean isComplete

Methods: markComplete(), markIncomplete(), setDescription(), toString().

ToDoListApp.java

Handles:

Menu loop

User input with Scanner

Adding, viewing, editing, deleting, and marking tasks.

⚠️ Limitations
❌ Tasks are not saved — all tasks are lost when the app exits.

❌ No file I/O or database yet.

✨ Possible Improvements
Want to expand this project? Here are ideas:

💾 Add file saving/loading → Save tasks to a text file or JSON.

⏰ Add due dates and priorities.

✅ Mark overdue tasks.

🖥️ Convert to a GUI app (Swing or JavaFX).

🌐 Deploy as a simple web app with Java backend.

🧑‍💻 Author
   Name: EZINNE IROHA KALU

GitHub: https://github.com/ireneiroha/ToDo_List_App

📃 License
This project is open source under the MIT License.

🙌 Contributions
Pull requests, ideas, and suggestions are welcome!
Fork it, play with it, and make it your own 🚀
