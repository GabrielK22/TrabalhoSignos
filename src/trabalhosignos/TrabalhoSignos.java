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
        String cor, signo;
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
         * Resolver problema com ano bissexto!! 07/
         */
        //Processamento
        idade = (anoA - anoN);
        if ((mesN > mesA) || (mesN == mesA && diaN < diaA)) {
            idade--;

        }
        corS = (int) (1 + Math.random() * 10);
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
        numS = (int) (1 + Math.random() * 99);

        //Signos
        if ((mesN == 3 && diaN >= 21) || (mesN == 4 && diaN <= 19)) {
            signo = "Áries";
        } else if ((mesN == 4 && diaN >= 20) || (mesN == 5 && diaN <= 20)) {
            signo = "Touro";
        } else if ((mesN == 5 && diaN >= 21) || (mesN == 6 && diaN <= 20)) {
            signo = "Gêmeos";
        } else if ((mesN == 6 && diaN >= 21) || (mesN == 7 && diaN <= 22)) {
            signo = "Cancer";
        } else if ((mesN == 7 && diaN >= 23) || (mesN == 8 && diaN <= 22)) {
            signo = "Leão";
        } else if ((mesN == 8 && diaN >= 23) || (mesN == 9 && diaN <= 22)) {
            signo = "Virgem";
        } else if ((mesN == 9 && diaN >= 23) || (mesN == 10 && diaN <= 22)) {
            signo = "Libra";
        } else if ((mesN == 10 && diaN >= 23) || (mesN == 11 && diaN <= 21)) {
            signo = "Escorpião";
        } else if ((mesN == 11 && diaN >= 22) || (mesN == 12 && diaN <= 21)) {
            signo = "Sagitário";
        } else if ((mesN == 12 && diaN >= 22) || (mesN == 1 && diaN <= 19)) {
            signo = "Capricórnio";
        } else if ((mesN == 1 && diaN >= 20) || (mesN == 2 && diaN <= 18)) {
            signo = "Aquário";
        } else {
            signo = "Peixes";
        }
        //Saida de dados 
        if (sexo == 1) {
            System.out.println("A sra." + nome + ", tem " + idade + " anos, seu número da sorte é " + numS + " e sua cor da sorte é " + cor);
            System.out.println("Signo: "+signo);
        } else {
            System.out.println("O sr." + nome + ", que tem " + idade + " anos, seu número da sorte é " + numS + " e sua cor da sorte é " + cor);
            System.out.println("Signo: "+signo);
        }
    }

}
