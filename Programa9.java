paquete  com . mi empresa . Programa9;
importar  java . útil . Escáner ;

 clase  pública P9_u3 {

    público  estático  vacío  principal ( String [] args ) {

            Escáner  sc = nuevo  escáner ( Sistema . en );
            int  horaentrada , horasalida , horatotal ;
             costo doble = 0 ;
            Sistema . fuera . println ( "Utiliza el formato de 24 horas." );
            Sistema . fuera . println ( "¿Cual fue la hora de entrada? " );
            horaentrada = sc . siguienteInt ();
            Sistema . fuera . println ( "¿Cual fue la hora de salida? " );
            horasalida = sc . siguienteInt ();

            horatotal = horasalida - horaentrada ;
            Sistema . fuera . println ( "Usted estuvo " + horatotal + " horas en total " );

            si ( horatotal <= 2 )
            {
                costo = horatotal * 5 ;
                Sistema . fuera . println ( "Por las " + horatotal + " hrs que estuvo aquí, tiene que pagar $" + costo );
            }

            de lo contrario  si ( horatotal <= 5 )
            {
                costo = 2 * 5 + ( horatotal - 2 ) * 4 ;
                Sistema . fuera . println ( "Por las " + horatotal + " hrs que estuvo aquí, tiene que pagar $" + costo );
            }

            de lo contrario  si ( horatotal <= 10 )
            {
                costo = 2 * 5 + 3 * 4 + ( horatotal - 5 ) * 3 ;
                Sistema . fuera . println ( "Por las " + horatotal + " hrs que estuvo aquí, tiene que pagar $" + costo );
            }

            demás
            {
                costo = 2 * 5 + 3 * 4 + 5 * 3 + ( horatotal - 10 ) * 2 ;
                Sistema . fuera . println ( "Por las " + horatotal + " hrs que estuvo aquí, tiene que pagar $" + costo );
            }

    }
}