public class Numeros{
    public static void main(String[] args) {
        int [][] numeros={{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        numeros[2][2]=50;
        for(int[] fila: numeros){
            for(int numero: fila){
                System.out.print(numero+" ");
            }
            System.out.println();
        }
        System.out.println(numeros[0].length);
    }
}