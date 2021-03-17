import javax.swing.JOptionPane;

public class Ex2_1 {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para mostrar sua tabuada:"));
        for(int i = 0; i<=1000; i++){
            System.out.println(n+" x "+i+" = "+ n*i);
        }
    }
}
