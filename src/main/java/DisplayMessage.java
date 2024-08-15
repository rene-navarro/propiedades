public class DisplayMessage {

        /* Mostrar un mensaje n nuumero de veces.  */
    public static void main(String args[]) {
        if( args.length != 2) {
            System.out.println("Sintaxis: java DisplayMessage <mensaje> <n>");
            System.exit(1);
        }

        // mensaje a mostrar
        String msg = args[0];

        // cuantas veces mostrar el mensaje
        int n = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }
}
