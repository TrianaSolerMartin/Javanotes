
package mesources;

// @author Administrator
public class Version2dado100 {

    public static void main(String[] args) {
        version3();
        version2();
    }
        public static void version2() {
        //generamos 100 lanzamientos
        int c = 0;
        int c1, c2, c3, c4, c5, c6;
        c1 = c2 = c3 = c4 = c5 = c6 = 0;
        for (int i = 1; i <= 100; i++) {
            int dado = (int) (Math.random() * 6 + 1);
            System.out.print(dado);
            if (c == 11) {
                System.out.println();
                c = 0;
            }
            c++;
            switch (dado) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
            }
        }
        System.out.println("Lado 1:" + c1);
        System.out.println("Lado 2:" + c2);
        System.out.println("Lado 3:" + c3);
        System.out.println("Lado 4:" + c4);
        System.out.println("Lado 5:" + c5);
        System.out.println("Lado 6:" + c6);
    }
            public static void version3() {
        //generamos 100 lanzamientos
        int c = 0;
        int [] conta = {0, 0 , 0, 0, 0, 0};
        for (int i = 1; i <= 100; i++) {
            int dado = (int) (Math.random() * 6 + 1);
            System.out.print(dado);
            if (c == 11) {
                System.out.println();
                c = 0;
            }
            c++;
            switch (dado) {
                case 1:
                    conta[0]++;
                    break;
                case 2:
                    conta[1]++;
                    break;
                case 3:
                    conta[2]++;
                    break;
                case 4:
                    conta[3]++;
                    break;
                case 5:
                    conta[4]++;
                    break;
                case 6:
                    conta[5]++;
                    break;
            }
        }
        System.out.println("Lado 1: version 3:" + conta[0]);
        System.out.println("Lado 2: version 3:" + conta[1]);
        System.out.println("Lado 3: version 3:" + conta[2]);
        System.out.println("Lado 4: version 3" + conta[3]);
        System.out.println("Lado 5: version 3" + conta[4]);
        System.out.println("Lado 6: version 3" + conta[5]);
    }

}
