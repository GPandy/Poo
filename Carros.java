import javax.swing.JOptionPane;

public class Carros {
    String modelo = "Padrão";
    int velocidade = 0;
    float tanque = 0;
    String numcarro;
    public Carros(String cons){
        this.numcarro = cons;
    }


    public void setModelo(String mod) {
        this.modelo = mod;        
    }
    
    public void setVelocidade(int vel) {
        this.velocidade = vel;        
    }
    
    public void setTanque(float tank) {
        this.tanque = tank;        
    }
    
    public String getModelo() {
        return this.modelo;        
    }
    
    public Integer getVelocidade() {
        return this.velocidade;        
    }

    public Float getTanque() {
        return this.tanque;        
    }

    public void Andar(){
        int vel = getVelocidade();
        if(vel <= 0 || tanque <=0){
            System.out.printf("\nO carro "+getModelo()+" está parado!");
        }
        else{
            System.out.printf("\nO carro "+getModelo()+" está andando a "+getVelocidade()+" km/h");
            this.tanque = Math.max(this.tanque -=1, 0);
            this.velocidade =Math.max(this.velocidade -=1, 0);
        }
        if(vel>=50){
            this.tanque = Math.max(this.tanque -=4, 0);
        }
        if(vel<=10){
            System.out.println("\nmelhor dar uma acelerada!");
        }
    }
    public void Abastecer(float enx){
        float tank = getTanque();
        tank +=enx;
        float preço = enx*Float.parseFloat("7.76");
        JOptionPane.showMessageDialog(null,"\nO total foi de R$"+preço+", seu tanque está com "+tank+" L");
        setTanque(tank);
    }
}
