import java.util.Scanner;

public class Main

{
    private static void djekstraal(int[][] adjancyMatrix) {

        int v = adjancyMatrix.length;

        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        for (int i = 1; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < v - 1; i++) {
            {
                // find min
                int minvertex = findMinvertext(distance, visited);
                visited[minvertex] = true;

                // neghber
                for (int j = 0; j < v; j++) {
                    if (adjancyMatrix[minvertex][j] != 0 && !visited[j] && distance[minvertex] != Integer.MAX_VALUE) {
                        int newDistance = distance[minvertex] + adjancyMatrix[minvertex][j];
                        if (newDistance < distance[j]) {
                            distance[j] = newDistance;
                        }
                    }
                }

            }
        }

        for (int i = 0; i < v; i++) {

            System.out.println(i + " " + distance[i]);
        }

    }

    private static int findMinvertext(int[] distance, boolean[] visited) {

        int minvertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && (minvertex == -1 || distance[i] < distance[minvertex])) {
                minvertex = i;
            }

        }

        return minvertex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vertext and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("enter the value from one vertex to another and their weight");
        int adjancyMatrix[][] = new int[v][v];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjancyMatrix[v1][v2] = weight;
            adjancyMatrix[v1][v2] = weight;
        }
        djekstraal(adjancyMatrix);

    }

}


