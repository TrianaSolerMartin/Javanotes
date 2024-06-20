package array;

public class Principal3 {

    public static void main(String[] args) {
        // Enero 2024
        int[][] menero = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 31, 0, 0, 0, 0}
        };

        // Febrero 2024
        int[][] mfebrero = {
            {0, 0, 0, 1, 2, 3, 4},
            {5, 6, 7, 8, 9, 10, 11},
            {12, 13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24, 25},
            {26, 27, 28, 29, 0, 0, 0}
        };

        // Marzo 2024
        int[][] mmarzo = {
            {0, 0, 0, 0, 1, 2, 3},
            {4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17},
            {18, 19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30, 31}
        };

        // Abril 2024
        int[][] mabril = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 0, 0, 0, 0, 0}
        };

        // Mayo 2024
        int[][] mmayo = {
            {0, 0, 1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18, 19},
            {20, 21, 22, 23, 24, 25, 26},
            {27, 28, 29, 30, 31, 0, 0}
        };

        // Junio 2024
        int[][] mjunio = {
            {0, 0, 0, 0, 0, 1, 2},
            {3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12, 13, 14, 15, 16},
            {17, 18, 19, 20, 21, 22, 23},
            {24, 25, 26, 27, 28, 29, 30}
        };

        // Julio 2024
        int[][] mjulio = {
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 31, 0, 0, 0, 0}
        };

        // Agosto 2024
        int[][] magosto = {
            {0, 0, 0, 1, 2, 3, 4},
            {5, 6, 7, 8, 9, 10, 11},
            {12, 13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24, 25},
            {26, 27, 28, 29, 30, 31, 0}
        };

        // Septiembre 2024
        int[][] mseptiembre = {
            {0, 0, 0, 0, 0, 0, 1},
            {2, 3, 4, 5, 6, 7, 8},
            {9, 10, 11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20, 21, 22},
            {23, 24, 25, 26, 27, 28, 29},
            {30, 0, 0, 0, 0, 0, 0}
        };

        // Octubre 2024
        int[][] moctubre = {
            {0, 0, 1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18, 19},
            {20, 21, 22, 23, 24, 25, 26},
            {27, 28, 29, 30, 31, 0, 0}
        };

        // Noviembre 2024
        int[][] mnoviembre = {
            {0, 0, 0, 0, 1, 2, 3},
            {4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15, 16, 17},
            {18, 19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30, 0}
        };

        // Diciembre 2024
        int[][] mdiciembre = {
            {0, 0, 0, 0, 0, 0, 1},
            {2, 3, 4, 5, 6, 7, 8},
            {9, 10, 11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20, 21, 22},
            {23, 24, 25, 26, 27, 28, 29},
            {30, 31, 0, 0, 0, 0, 0}
        };

        // Array tridimensional que contiene todos los meses
        int[][][] cubo = new int[12][][];

        cubo[0] = menero;
        cubo[1] = mfebrero;
        cubo[2] = mmarzo;
        cubo[3] = mabril;
        cubo[4] = mmayo;
        cubo[5] = mjunio;
        cubo[6] = mjulio;
        cubo[7] = magosto;
        cubo[8] = mseptiembre;
        cubo[9] = moctubre;
        cubo[10] = mnoviembre;
        cubo[11] = mdiciembre;

        // Array de nombres de los meses
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
         String[] diasSemana  = {"L", "M", "X","J","V","S","D"};

        // Imprimir el calendario anual
        for (int i = 0; i < cubo.length; i++) {
            System.out.println(meses[i]);
               System.out.printf("%7s %7s %7s %7s %7s %7s %7s\n ", diasSemana);
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    if (cubo[i][j][k] == 0) {
                        System.out.printf("%7d ",  cubo[i][j][k] ); // Espacio para días vacíos
                    } else {
                        System.out.printf("%7d ", cubo[i][j][k]);
                    }
                }
                System.out.println();
            }
            
            System.out.println();
        }
    }
}
