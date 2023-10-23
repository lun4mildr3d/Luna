using System;
namespace p2
{
    internal class Promedio
    {
        static void Main(string[] args)
        {
            int c1, c2, c3, c4, c5, c6;
            float Promedio;
            string nombre;
            Console.Write("escribe tu calificacion 1: ");
            c1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("escribe tu calificacion 2: ");
            c2 = Convert.ToInt32(Console.ReadLine());
            Console.Write("escribe tu calificacion 3: ");
            c3 = Convert.ToInt32(Console.ReadLine());
            Console.Write("escribe tu calificacion 4: ");
            c4 = Convert.ToInt32(Console.ReadLine());
            Console.Write("escribe tu calificacion 5: ");
            c5 = Convert.ToInt32(Console.ReadLine());
            Console.Write("escribe tu calificacion 6: ");
            c6 = Convert.ToInt32(Console.ReadLine());
            Promedio = (c1 + c2 + c3 + c4 + c5 + c6 ) / 6;
            Console.WriteLine("tu promedio es: ");
        }
    }
}
  