import javax.swing.JOptionPane;
class Main {
    public static void main(String[] args) {

        int N = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM VALOR: "));
        //int V1=;
        int result = sum(3, N-1) + sum(5, N-1) - sum(15, N-1);

        JOptionPane.showMessageDialog(null, result);
    }

    public static int sum(int n, int N) {
        return n * (N/n) * (N/n + 1)/2;
    }
}