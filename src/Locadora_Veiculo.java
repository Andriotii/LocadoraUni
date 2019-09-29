import javax.swing.JOptionPane;

public class Locadora_Veiculo {

public static void main(String[] args) {
 
                
    

        double Gasolina=4.15;
        double Alcool=3.94;
        double gasto;
        double gasto1;
        
      
        
            
        
      JOptionPane.showMessageDialog(null, "Bem vindo a Rodar é bom!\n" + "Escolha seu carro:");
          int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            if (idade < 23) {

            JOptionPane.showMessageDialog(null, "Você não tem a idade permitida para aluga  um carro ");
            } else {
                int km= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos KM irá percorrer."));
                String local;
                
                local=JOptionPane.showInputDialog(null,"Para onde ira viajar? ");

        double desconto;
        double valor;
                             int carros = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha seu carro\n" + "CATALOGO\n" + "Opção 01 = Palio: Valor da diaria= R$ 100,00\n"
    + "Opção 02 = Corsa: Valor da diaria= R$ 150,00\n"
    + "Opção 03 = Onix: Valor da diaria= R$ 300,00\n"
    + "Opção 04 = HB20:  Valor da diaria= R$ 350,00\n"));
    

            int diaria = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de dias: "));

            if (diaria < 2) {

                                JOptionPane.showMessageDialog(null, "A Locação diaria minima é de 2 dias!");

                    } else {

        switch (carros) {


                case 01:
                        int Palio=JOptionPane.showConfirmDialog(null,
                            " Palio 2017: 1.0 flex.\n 15km por Litro.\n Roda liga leve.\n Ar condicionado. Direção eletrica.\n Trava e vidros elétricos.\n Placa: XXX-XXXX");
                        if (Palio == 0) {

                        int retorno = JOptionPane.showConfirmDialog(null, "Você é cliente Porto Seguro?");

                    if (retorno == 0) {
                        carros = carros * diaria;
                        valor = carros * 0.15;
                        desconto = carros - valor;
            JOptionPane.showMessageDialog(null,"Carro: Palio. Valor da diaria é: R$" + carros + ". O desconto é de 15%: R$ "
                    + valor + ". O valor do alugel com o desconto é: " + desconto);

                        } else if (retorno == 1)
                    if (diaria >= 5) {
                        
                    carros = carros * diaria;
                    valor = carros * 0.10;
                    desconto = carros - valor;
            JOptionPane.showMessageDialog(null,"Carro: Palio. Valor da diaria é: R$" + carros + ". O desconto é de 10%: R$ "
                    + valor + ". O valor do alugel com o desconto é: " + desconto);

                } else {
                        carros = carros * diaria;
                            JOptionPane.showMessageDialog(null, "O valor do alugel é: " + carros);
}
}
                     break;

                                                        //---------------//

                case 02:

            int Corsa = JOptionPane.showConfirmDialog(null,
                    " Corsa 2018: 1.0 flex.\n 15km por Litro.\n Roda liga leve.\n Ar condicionado.\n Direção eletrica.\n Trava e vidros elétricos.\n Placa: XXX-XXXX");
                    if(Corsa == 0) {
                                        int retorno2 = JOptionPane.showConfirmDialog(null, "Você é cliente Porto Seguro?");

                        if (retorno2 == 0) {

                        carros = carros * diaria;
                        valor = carros * 0.15;
                        desconto = carros - valor;
            JOptionPane.showMessageDialog(null,"Carro: Corsa. Valor da diaria é: R$" + carros + ". O desconto é de 15%: R$ "
                    + valor + ". O valor do alugel com o desconto é: " + desconto);

                        } else if (retorno2 == 1)
                         if (diaria >= 5) {
                         carros = carros * diaria;
                         valor = carros * 0.10;
                         desconto = carros - valor;
                JOptionPane.showMessageDialog(null,"Carro: Corsa. Valor da diaria é: R$" + carros + ". O desconto é de 10%: R$ "
                    + valor + ". O valor do alugel com o desconto é: " + desconto);
                    } else {

                                carros = carros * diaria;
                                 JOptionPane.showMessageDialog(null, "O valor do alugel é: " + carros);

}
}

                break;

                                                                    //--------------------

                case 03:

                    int Onix = JOptionPane.showConfirmDialog(null,
                "Onix 2018: 1.0 flex.\n 13km por Litro.\n Roda liga leve.\n Ar condicionado.\n Direção eletrica.\n Trava e vidros elétricos.\n Placa: XXX-XXXX");
            if (Onix == 0) {
            int retorno3 = JOptionPane.showConfirmDialog(null, "Você é cliente Porto Seguro?");

            if (retorno3 == 0) {
            carros = carros * diaria;
            valor = carros * 0.15;
            desconto = carros - valor;
            JOptionPane.showMessageDialog(null,"Carro: Onix. Valor da diaria é: R$" + carros + ". O desconto é de 15%: R$ " + valor
                + ". O valor do alugel com o desconto é: " + desconto);

            } else if (retorno3 == 1)
                    if (diaria >= 5) {

            carros = carros * diaria;
            valor = carros * 0.10;
            desconto = carros - valor;
             JOptionPane.showMessageDialog(null,"Carro: Onix. Valor da diaria é: R$" + carros + ". O desconto é de 10%: R$ "
                + valor + ". O valor do alugel com o desconto é: " + desconto);

            } else {

                carros = carros * diaria;
            JOptionPane.showMessageDialog(null, "O valor do alugel é: " + carros);
}

}
                
                break;

case 04:

                    int Opala = JOptionPane.showConfirmDialog(null,
                    "Opala 6 cilindros 1975: 4.1.\n Alcool.\n 1km por Litro.\n Placa: XXX-XXXX");
                            if (Opala == 0) {
                    int retorno6 = JOptionPane.showConfirmDialog(null, "Você é cliente Porto Seguro?");

            if (retorno6 == 0) {

                                    carros = carros * diaria;
                valor = carros * 0.15;
                desconto = carros - valor;
                JOptionPane.showMessageDialog(null,"Carro: Opala. Valor da diaria é: R$" + carros + ". O desconto é de 15%: R$ "
                                        + valor + ". O valor do alugel com o desconto é: " + desconto);

            } else if (retorno6 == 1)

                    if (diaria >= 5) {

                    carros = carros * diaria;
                    valor = carros * 0.10;
                    desconto = carros - valor;
            JOptionPane.showMessageDialog(null,"Carro: Opala. Valor da diaria é: R$" + carros + ". O desconto é de 10%: R$ "
                + valor + ". O valor do alugel com o desconto é: " + desconto);

            } else {

                    carros = carros * diaria;
            JOptionPane.showMessageDialog(null, "O valor do alugel é: " + carros);

}
}
}
                    gasto=Gasolina*km;
             JOptionPane.showMessageDialog(null,"Caso coloque gasolina, você irá gastar em torno de: R$ "+gasto +" Para ir até "+local);
                    gasto1=Alcool*km;
                            
                            
                        JOptionPane.showMessageDialog(null,"Caso coloque Alcool, você irá gastar em torno de: R$ "+gasto1 +" Para ir até "+local);
                        
JOptionPane.showMessageDialog(null, "Muito Obrigado por alugar na Rodar é bom!!");



            }
            }
}
}

