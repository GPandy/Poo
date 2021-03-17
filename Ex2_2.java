import javax.swing.JOptionPane;

public class Ex2_2 {
    public static void main(String[] args) throws Exception {
        int cont = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas vezes o teste deve repetir? "));
        double media,n1,n2,n3,pTot = 2+3+5;
        for(int i=1;i<=cont;i++){
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Dê o primeiro valor: "));
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Dê o segundo valor: "));
            n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Dê o terceiro valor: "));
            media = ((n1*2)+(n2*3)+(n3*5))/pTot;
            System.out.println("Teste "+i+" - N°1: "+n1+" N°2: "+n2+" N°3: "+n3+" - Media ponderada: "+media);
        }
    }
}
