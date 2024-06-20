package array;

public class Principal3 {

    public static void main(String[] args) {
        int [][] menero = {
            {1,2,3,5},
            {4,5,6,8},
            {7,8,9,1}            
        };
        int [][] mfebrero = {
            {7,8,9,3},
            {4,5,8,9},
            {1,2,3,1}
        };
        int [][][] cubo = new int [2][3][4];//matriz, fila,columna
        cubo [0] = menero;
        cubo [1] = mfebrero;
        
        for (int i=0; i<cubo.length; i++){
            for (int j=0; j<cubo[0].length; j++){
                for (int k=0; k<cubo[0][0].length; k++) {
                        System.out.printf("%4d",cubo[i][j][k]);
                }
                System.out.println();
                    }
                            System.out.println();

        
            
        }
    }

}
