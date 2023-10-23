using System;
namespace p1
{
    internal class Edad
    {
        static void Main(string[] args)
        {
            int E;
            Console.WriteLine("¿que edad tienes");
            E = Convert.ToInt32(Console.ReadLine());
            if (E >=18)
               Console.WriteLine("eres mayor de edad");
            if (E < 18)
               Console.WriteLine("eres menor de edad");
        }
    }
}
  