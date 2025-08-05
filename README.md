# Business Hours Lookup (GUI)

This Java GUI application displays the **business hours** for a selected day of the week. Users are presented with a menu via a **JOptionPane** dialog box and can select a day to view its corresponding hours.

> **Course**: CSIS 212-B02  
> **Author**: David Lyman  
> **Assignment**: 7  
> **Citation**: [Oracle JOptionPane Docs](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)

---

## 📁 Project Structure

Business-Hours-GUI/
├── FinalProjectPart2.java // Java source code for the GUI
├── FinalProjectPart2.class // Compiled Java class
├── .gitattributes
└── README.md // Project documentation

---

## 💡 Features

- GUI menu for selecting a day of the week
- Displays business hours for:
  - Monday–Saturday: custom hours
  - Sunday: **Closed**
- Validates input:
  - Rejects non-numeric or out-of-range entries
- Uses `enum` for clean mapping of days
- Displays developer name and assignment info

---

## 🛠️ Getting Started

### ✅ Prerequisites

- Java Development Kit (JDK) 8 or later
- A Java IDE or terminal

### 📦 How to Run

1. Ensure your file is in the correct package folder: `assignmenteight/`
2. Compile the code:

   ```bash
   javac FinalProjectPart2.java
3. Run the program:

   ```bash
   java assignmenteight.FinalProjectPart2

---

📄 Sample Interaction

User Prompt:
Select a day of the week:
1. MONDAY
2. TUESDAY
3. WEDNESDAY
4. THURSDAY
5. FRIDAY
6. SATURDAY
7. SUNDAY

Output (Example for Thursday):
THURSDAY Business Hours:
11:00 AM – 7:00 PM

---


🧠 Concepts Demonstrated
Enums: Used for clean day mapping

Arrays: Store hours for each day

StringBuilder: Efficiently constructs GUI menu text

JOptionPane dialogs: Input and output via GUI

Error handling: Input validation for both non-numeric and invalid range

---

📜 License
This project is for educational purposes only. Not licensed for production use.
