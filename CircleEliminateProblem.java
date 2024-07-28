
public class CircleEliminateProblem {

    public static int[] josephus(int N, int X) {
        int[] circle = new int[N];
        boolean[] eliminated = new boolean[N];
        int[] eliminationOrder = new int[N - 2];
        int count = 0; // Count the number of people eliminated
        int index = 0; // Start at the first person

        // Initialize the circle array with people's numbers
        for (int i = 0; i < N; i++) {
            circle[i] = i + 1;
        }

        while (count < N - 2) {
            int steps = 0;
            // Find the Xth person who is not eliminated
            while (steps < X) {
                if (!eliminated[index]) {
                    steps++;
                }
                if (steps < X) {
                    index = (index + 1) % N;
                }
            }
            // Eliminate the Xth person
            eliminationOrder[count] = circle[index]; // Store the eliminated person's number
            eliminated[index] = true;
            count++;
        }

        return eliminationOrder;
    }

    public static void main(String[] args) {
        int N = 6;
        int X = 3;
        int[] result = josephus(N, X);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


