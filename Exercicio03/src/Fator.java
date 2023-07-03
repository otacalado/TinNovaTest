import javax.swing.JOptionPane;
public class Fator
{
    public static void main(String args[])

    {
        int N, C=0;
        N=Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O VALOR DO NÚMERO À FATORAR: "));
        for (C=N-1; C>0; C--)
        {
            N=(N*C);
        }
        JOptionPane.showMessageDialog(null, +N);
    }

}
