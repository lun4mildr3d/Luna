using System;

namespace programa9 // Note: actual namespace depends on the project name.
{
    internal class Estacionamiento
    {
        static void Main(string[] args)
        {
            int horaentrada, horasalida, horatotal;
            double costo = 0;

            Console.WriteLine("Utiliza el formato de 24 horas.");
            Console.WriteLine("¿Cual fue la hora de entrada? ");
            horaentrada = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("¿Cual fue la hora de salida? ");
            horasalida = Convert.ToInt32(Console.ReadLine());

            horatotal = horasalida - horaentrada;

            if (horatotal <= 2)
            {
                costo = horatotal * 5;
            }

            else if (horatotal <= 5)
            {
                costo = horatotal * 4;
            }


        }
    }
}