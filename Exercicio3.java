import Carros;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
public class Exercicio3 {
    public static void main(String[] args) throws Exception {
    
        List<Carros> carros = new ArrayList<>();
        int vel,boo;
        String mod;  
        float tank, encher;
        
        for (int i=0 ; i<=1 ; i++){
            mod = JOptionPane.showInputDialog(null,"Insira o Modelo do carro");
            carros.add(new Carros("carN" + i));

            carros.get(i).setModelo(mod);
            
            vel = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a velocidade de "+carros.get(i).getModelo()));
            carros.get(i).setVelocidade(vel);

            tank = Float.parseFloat(JOptionPane.showInputDialog(null,"Insira o quantos litros o tanque de "+carros.get(i).getModelo()+" está?"));
            carros.get(i).setTanque(tank);
            
        }

        while(true){
            for (int i=0 ; i<=1 ; i++){
                if((carros.get(i)).getTanque()<=10){
                    boo = Integer.parseInt(JOptionPane.showInputDialog(null,"Quer abastecer o "+carros.get(i).getModelo()+"? (1-sim // 2-não)"));
                    if(boo == 1){
                        encher = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos litros você quer encher o tanque? (Preço da gasolina ta R$ 7.76)"));
                        carros.get(i).Abastecer(encher);
                    }
                }      
                boo = Integer.parseInt(JOptionPane.showInputDialog(null,"Quer dar uma acelerada ou frear o "+carros.get(i).getModelo()+"? \n1-acelerar\n2-frear\n3-Quero fazer nada"));
                if(boo == 1){
                    carros.get(i).setVelocidade(carros.get(i).getVelocidade() +20);
                }
                else if(boo == 2){
                    carros.get(i).setVelocidade(carros.get(i).getVelocidade() -10);
                }
                    
            carros.get(i).Andar();
            }
            Thread.sleep(2000);
        }

    }
}
