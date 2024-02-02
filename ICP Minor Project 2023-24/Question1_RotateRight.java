public class Question1_RotateRight {
    public static void main(String[] args) {
        int[] list = {10, 11, 12, 13};
        System.out.println("Initial array : ");
        printArray(list);

        rotateRightBy2Bits(list);

        System.out.println("After rotation of the initial array : ");
        printArray(list);

    }

    public static void rotateRightBy2Bits(int[] S) {
        int num = S.length;
        int D = 2;
        int[] placeholder = new int[num];

        for (int i = 0; i < num-1; i++) {
            placeholder[i+1] = S[i] << (32 - D);
        }
        placeholder[0] = S[num-1] << (32 - D);

        for (int i = 0; i < num; i++) {
            S[i] = S[i] >> 2 | placeholder[i];
        }
    }

    public static void printArray(int[] L) {
        System.out.print("Decimal: ");
        for (int result : L) {
            System.out.print(result + " ");
        }

        System.out.print("\nBinary : ");
        for (int data : L) {
            System.out.print(Integer.toBinaryString(data) + " ");
        }

        System.out.println();
    }
}