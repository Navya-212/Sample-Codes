using System.Runtime.CompilerServices;

internal class Program
{
    private static void Main(string[] args)
    {
        String val;
        do
        {
            Console.WriteLine("Enter First Variable");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Second Variable");
            int b = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Choose the Operation\n 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide\n 5.Modulus\n ");
            var ch = Console.ReadLine();
            switch (ch)
            {
                case "Add":
                    Console.WriteLine((a + b));
                    break;
                case "Subtract":
                    Console.WriteLine((a - b));
                    break;
                case "Multiply":
                    Console.WriteLine((a * b));
                    break;
                case "Divide":
                    Console.WriteLine(a / b);
                    break;
                case "Modulus":
                    if (b != 0)
                        Console.WriteLine(a % b);
                    else
                        Console.WriteLine("second variable should not be zero");
                    break;
                default:
                    Console.WriteLine("Wrong input");
                    break;
            }
            Console.WriteLine("Do you want to continue (Y/N)");
            val = Console.ReadLine();
        }
        while (val == "Y" || val == "y");
        
    }
}
