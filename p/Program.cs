// See https://aka.ms/new-console-template for more information
using System;

class PruevaLuna
{
    static void Main()
    {
        Console.WriteLine("Elige el tipo de conversión a realizar:");
        Console.WriteLine("1. Velocidad - Millas a Kilómetros por hora");
        Console.WriteLine("2. Longitud - Yardas a Pulgadas");
        Console.WriteLine("3. Divisa - Dólares a Euro");
        Console.WriteLine("4. Datos - Gigabytes a Bytes");

        int opcion = Convert.ToInt32(Console.ReadLine());

        switch (opcion)
        {
            case 1:
                ConvertirMillasAKilometrosPorHora();
                break;

            case 2:
                ConvertirYardasAPulgadas();
                break;

            case 3:
                ConvertirDolaresAEuro();
                break;

            case 4:
                ConvertirGigabytesABytes();
                break;

            default:
                Console.WriteLine("Opción no válida.");
                break;
        }
    }

    static void ConvertirMillasAKilometrosPorHora()
    {
        Console.Write("Ingresa la velocidad en millas por hora: ");
        double velocidadMillasPorHora = Convert.ToDouble(Console.ReadLine());
        double velocidadKilometrosPorHora = velocidadMillasPorHora * 1.60934;
        Console.WriteLine($"La velocidad en kilómetros por hora es: {velocidadKilometrosPorHora:F2}");
    }

    static void ConvertirYardasAPulgadas()
    {
        Console.Write("Ingresa la longitud en yardas: ");
        double longitudYardas = Convert.ToDouble(Console.ReadLine());
        double longitudPulgadas = longitudYardas * 36;
        Console.WriteLine($"La longitud en pulgadas es: {longitudPulgadas:F2}");
        return;
    }

    static void ConvertirDolaresAEuro()
    {
        Console.Write("Ingresa la cantidad en dólares: ");
        double cantidadDolares = Convert.ToDouble(Console.ReadLine());
        double cantidadEuro = cantidadDolares * 0.85; // Tasa de cambio aproximada
        Console.WriteLine($"La cantidad en euros es: {cantidadEuro:F2}");
        return;
    }

    static void ConvertirGigabytesABytes()
    {
        Console.Write("Ingresa la cantidad en gigabytes: ");
        double cantidadGigabytes = Convert.ToDouble(Console.ReadLine());
        double cantidadBytes = cantidadGigabytes * 1024 * 1024 * 1024;
        Console.WriteLine($"La cantidad en bytes es: {cantidadBytes:F2}");
        return;
    }
}