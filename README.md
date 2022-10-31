# Python Documentation

# Python Text Reversal Script

This repository contains a simple Python script that reverses the input text. The script is named `reverse_text.py`.

## Script Description

The script `reverse_text.py` is a simple Python script that takes a string input from the user and prints the reversed version of the input string.

The script does not import any external libraries, hence it only uses built-in Python functionalities.

## Function Description

The script contains a single function `reverse_text(text)`. This function takes a string as an argument and returns the reversed version of the string.

Here is a brief explanation of the function:

- `def reverse_text(text):` This line defines the function `reverse_text` that takes one argument `text`. `text` is expected to be a string.

- `return text[::-1]` This line returns the reversed version of the input string. In Python, `text[::-1]` is a common way to reverse a string. The `[::-1]` is a slice that steps backward through the entire string.

## User Input

The script prompts the user to enter a string with the line `text = input("Enter text: ")`. The entered string is then passed to the `reverse_text` function and the reversed string is printed to the console.

## Usage

To use this script, simply run the script in a Python environment. When prompted, enter the text you want to reverse. The reversed text will be printed to the console.

## Conclusion

This script is a simple demonstration of string manipulation in Python. It can be used as a starting point for more complex text processing tasks.

---

# C# Documentation

# CSharp Reverse String Script

This repository contains a simple CSharp script that takes a user's input, reverses the characters, and then prints the reversed string to the console.

## Script Explanation

The script begins by prompting the user to enter some text. It then reads the user's input and converts it into a character array. The character array is reversed, and then converted back into a string. Finally, the reversed string is printed to the console.

## Code Breakdown

```csharp
using System;
```
The `System` namespace contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions. In this script, it is used to access the `Console` class for reading from and writing to the console, and the `Array` class for reversing the character array.

```csharp
class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter text: ");
        string input = Console.ReadLine();
        char[] charArray = input.ToCharArray();
        Array.Reverse(charArray);
        Console.WriteLine(new string(charArray));
        Console.ReadKey();
    }
}
```
The `Main` method is the entry point of the C# console application. The `Console.Write` method is used to prompt the user to enter some text. The `Console.ReadLine` method is used to read the user's input. The `string.ToCharArray` method is used to convert the user's input into a character array. The `Array.Reverse` method is used to reverse the character array. The `Console.WriteLine` method is used to print the reversed string to the console. The `Console.ReadKey` method is used to pause the console until the user presses a key, so they can see the output before the console window closes.

## Usage

To run the script, you need a C# compiler. If you have the .NET SDK installed, you can use the `dotnet run` command in the terminal from the directory that contains the script. The script will prompt you to enter some text, then it will print the reversed string to the console.

---

# Java Documentation

# Text Reverser

This is a simple Java program that takes a user's input and reverses the text.

## Description

The program prompts the user to enter a string of text. After the user enters the text, the program reverses the order of the characters in the string and prints the reversed text to the console.

## Libraries Used

- `java.util.Scanner`: This is a Java utility class that provides methods for parsing primitive types and strings using regular expressions. In this program, it is used to capture the user's input from the console.

## Code Explanation

The `main` method is the entry point of the program. It creates a `Scanner` object to read the user's input. The user is prompted to enter a string of text, which is then stored in the `input` variable.

The `StringBuilder` class is used to reverse the string. A `StringBuilder` object is created with the user's input, then the `reverse` method is called to reverse the order of the characters in the string. The reversed string is then converted back to a `String` object.

Finally, the reversed string is printed to the console.

## Usage

To use this program, simply run it in your Java environment. When prompted, enter the text you want to reverse, then press Enter. The reversed text will be displayed on the console.

---
