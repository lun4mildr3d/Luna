paquete  com . mi empresa . p10_u3 ;
importar  java . útil . Escáner ;

 clase  pública P10_u3 {

    público  estático  vacío  principal ( String [] args ) {

            Escáner  sc = nuevo  escáner ( Sistema . en );
            int  ht , hexadecimal ;
            doble  pago , sueldosem = 0 ;
            Sistema . fuera . println ( "¿Cuantas horas trabajaste?" );
            ht = sc . siguienteInt ();
            Sistema . fuera . println ( "¿Cuanto es el pago por hora?" );
            pago = sc . siguienteInt ();

            si ( ht <= 40 )
            {
                sueldosem = ht * pago ;
                Sistema . fuera . println ( "Recibiras un total de $" + sueldosem );
            }
            demás
            {
                hexadecimal = ht - 40 ;
                sueldosem = 40 * pago + hex * ( pago * 2 );
                Sistema . fuera . println ( "Por trabajar " + hex + " horas extra, usted recibe un total de $" + sueldosem );


            }
    }
}