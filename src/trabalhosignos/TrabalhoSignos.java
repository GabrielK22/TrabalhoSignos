package trabalhosignos;

import java.util.Calendar;
import java.util.Scanner;

public class TrabalhoSignos {

    /**
     * author:Gabriel Kunzler
     *
     * @param args
     */
    public static void main(String[] args) {
        //Declaração de variáveis
        String nome, sexoR;
        Scanner ler = new Scanner(System.in);
        int sexo, diaN, mesN, anoN, idade, numS, corS;
        int diaA, mesA, anoA;
        String cor;
        Calendar hoje = Calendar.getInstance();
        diaA = hoje.get(Calendar.DATE);
        mesA = hoje.get(Calendar.MONTH) + 1;
        anoA = hoje.get(Calendar.YEAR);
        //Entrada de dados
        System.out.println("Informe seu nome completo:");
        nome = ler.nextLine();
        if (nome.length() < 8) {
            System.out.println("Seu nome não foi informado corretamente!");
            return;
        }
        System.out.println("Me diga seu sexo:");
        System.out.println("(sendo 1 Feminino e 2 Masculino)");
        sexo = ler.nextInt();
        if (sexo < 1) {
            System.out.println("O sexo foi informado errado!");
            return;
        } else {
            switch (sexo) {
                case 1:
                    sexoR = "Feminino";
                    break;
                case 2:
                    sexoR = "Masculino";
                    break;
                default:
                    sexoR = "Masculino";
            }
        }
        System.out.println("Informe o dia de seu nascimento:");
        diaN = ler.nextInt();
        if (diaN < 1 || diaN > 31) {
            System.out.println("Você informou o dia errado!");
            return;
        }
        System.out.println("Informe o mês de seu nascimento:");
        mesN = ler.nextInt();
        if (mesN < 1 || mesN > 12) {
            System.out.println("Você informou o mês errado!");
            return;
        }
        System.out.println("Informe o ano de seu nascimento:");
        anoN = ler.nextInt();
        if (anoN < 1900 || anoN > anoA) {
            System.out.println("Você informou o ano errado!");
            return;
        }
        //Validação de dados
        if (mesN == 4 || mesN == 6 || mesN == 8 || mesN == 10 || mesN == 12) {
            if (diaN > 30) {
                System.out.println("O dia informado não existe nestes mesês!");
                return;
            }
        } else if (mesN == 2) {
            if (diaN > 28) {
                if ((anoN % 400 == 0) || (anoN % 4 == 0 && anoN % 100 != 0)) {

                } else {
                    System.out.println("O mês informado não possui mais de 28 dias!");
                }
            }
        }
        /**
         * Resolver problema com ano bissexto!!
         * 07/
         */
        //Processamento
        idade = (anoA-anoN);
        if((mesN>mesA) ||(mesN == mesA && diaN < diaA)){
            idade--;
            
        }
        corS = (int) (1+ Math.random()*10);
        switch (corS) {
            case 1:
                cor = "Preto";
                break;
            case 2:
                cor = "Branco";
                break;
            case 3:
                cor = "Vermelho";
                break;
            case 4:
                cor = "Azul";
                break;
            case 5:
                cor = "Verde";
                break;
            case 6:
                cor = "Amarelo";
                break;
            case 7:
                cor = "Rosa";
                break;
            case 8:
                cor = "Roxo";
                break;
            case 9:
                cor = "Marrom";
                break;
            default:
                cor = "Laranja";
                break;
        }
        numS = (int)(1+Math.random()*99);
           
    }

}
