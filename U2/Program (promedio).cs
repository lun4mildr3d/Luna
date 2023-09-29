using System;

namespace p_3
{
    internal class Promedio
    {
        static void Main(string[] args)
        {
            int c1, c2, c3, c4, c5, c6;
            float promedio;
            Console.Write("Calificacion 1: ");
            c1 = Convert.ToInt32( Console.ReadLine() );
            Console.Write("Calificacion 2: ");
            c2 = Convert.ToInt32 (Console.ReadLine() );
            Console.Write("Calificacion 3: ");
            c3 = Convert.ToInt32 (Console.ReadLine() );
            Console.Write("Calificacion 4: ");
            c4 = Convert.ToInt32 (Console.ReadLine() );
            Console.Write("Calificacion 5: ");
            c5 = Convert.ToInt32 (Console.ReadLine() );
            Console.Write("Calificacion 6: ");
            c6 = Convert.ToInt32 (Console.ReadLine() );
            //PASO- CALCULAR PROMEDIO
            promedio = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
            //PSO- IMPRIME EL RESULTADO
            Console.WriteLine("Tu promedio es: " + promedio);
        }
    }
}