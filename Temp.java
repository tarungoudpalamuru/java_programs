public class Temp {
    public static void main(String[] args) {
        int[] temperature = {72, 74, 71, 70,76};
        int[] b = new int[5];
        for (int i = 0; i < temperature.length-1; i++) {
            for (int j = i + 1; j < temperature.length - 1; j++) {
                if (temperature[i] < temperature[j]) {
                    b[i]=j-i;
                    break;
                } else if (temperature[i]>=temperature[j]) {
                    b[i]=0;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
