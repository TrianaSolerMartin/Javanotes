package mesources;

// @author Administrator
public class Principal15 {

    public static void main(String[] args) {
        { //bloque 1 while
       System.out.println("WHILE 👌");
        int i =1;
        int n = 5;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
    { //bloque2 do-while
       System.out.println("Do -WHILE 🤷‍♀️ ");
        int i =1;
        int n = 5;
        do {
            System.out.println(i);
            i++;
        } while  (i <= n);
    }
    {//bloque3 for
        System.out.println("FOR 💥 ");
        int n =5;
        for (int i = 1; i<=n; i++){
            System.out.println(i);
        }
             /* for (int i = 1; 1<=n; i++){
            System.out.println(i); permite hacer un bucle infinito de numeros
      */
    }
}
}