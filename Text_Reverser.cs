using System;

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