package P;

public class C {
    int n = 10;
    int N = n * n;
    int[][] R, S;
    int[] L;

    public C() {
        R = new int[N][N];
        S = new int[N][N];
        L=new int[N];
        for (int l = 0; l < n; l++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    for (int i = 0; i < n; i++) {
                        if (i * j == k * l) R[p(i, j)][p(k, l)] = 1;
                    }
                }
            }
        }
        System.out.println(this);

        for (int u = 0; u < N; u++) {
            for (int v = 0; v < N; v++) {
              L[u]+= R[u][v];
            }

            System.out.println(L[u]);
            L[u]=0;
        }

    }

    private int p(int i, int j) {
        return i * n + j;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int u = 0; u < N; u++) {
            for (int v = 0; v < N; v++) {
                sb.append(R[u][v]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
