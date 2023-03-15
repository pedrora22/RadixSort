public class RadixSort {

    public static void sort(String[] a, int W)
    {
        int R = 256;
        int N = a.length;
        String[] aux = new String[N];
        for (int d = W-1; d >= 0; d--)
        {
            int[] count = new int[R+1];
            for (int i = 0; i < N; i++) {
                count[a[i].charAt(d) + 1]++;
            }
            for (int r = 0; r < R; r++)
                count[r+1] += count[r];
            for (int i = 0; i < N; i++)
                aux[count[a[i].charAt(d)]++] = a[i];
            for (int i = 0; i < N; i++)
                a[i] = aux[i];
        }
        for (int i = 0; i < 4896; i++) {
            System.out.println(aux[i] + "\n");
        }
    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String[] v = {"João Rescala", "Matheus Aragão", "Bernardo Duarte", "Vitor Ramos", "Maria Julia Castro", "Clarice Sales", "Milena Mendes", "Davi Lucca Caldeira", "Bruno Caldeira", "Ana Luiza Cardoso", "Emanuelly Lima", "Isabel Silveira", "Isis da Mota", "Maria Alice Farias", "Davi Luiz Fogaça", "Helena Azevedo"};
        int max = 3;
        sort(v, max);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + "ms");
    }

}
