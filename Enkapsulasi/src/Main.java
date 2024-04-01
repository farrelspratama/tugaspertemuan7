class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = 0;
        endTime = 0;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

public class Main {
    public static void main(String[] args) {
        // Inisialisasi array dengan 100.000 angka acak
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        // Membuat objek stopwatch
        StopWatch stopwatch = new StopWatch();
        
        // Memulai stopwatch
        stopwatch.start();
        
        // Pengurutan array menggunakan selection sort
        selectionSort(array);

        // Menghentikan stopwatch
        stopwatch.stop();

        // Menampilkan waktu yang diperlukan untuk pengurutan dalam milidetik
        System.out.println("Waktu yang diperlukan untuk melakukan pengurutan 100.000 angka adalah: " + stopwatch.getElapsedTime() + " milidetik");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
