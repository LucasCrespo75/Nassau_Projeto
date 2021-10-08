package Nassau;

import javax.swing.JOptionPane;

public class Nassau {
	public static void main (String args[]) {

        int qntd_disci, qntd_aluno, aluno_reprov, aluno_final, aluno_aprov;
        double media_geralDisci, maior_media, menor_media, mediaA, 
        soma_mediadA, media_geralTur, soma_mediaTur;

        qntd_disci = 0;
        qntd_aluno = 0;
        aluno_reprov = 0;
        aluno_aprov = 0;
        aluno_final = 0;
        soma_mediadA = 0.0;
        soma_mediaTur = 0.0;
        maior_media = 0.0;
        menor_media = 0.0;
        
        
        
    	String nome_turma = JOptionPane.showInputDialog("Escreva o nome da sua turma");

    do {

    	String nome_disci = JOptionPane.showInputDialog("Escreva o nome da diciplina");

    	qntd_disci++;
        //qtd_disc = qtd_disc + 1;
        
    do {
    	
        //qtd_aluno = qtd_aluno + 1;
    	qntd_aluno++;
        

    	double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a primeira nota"));

    	double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a segunda nota"));

        mediaA = (nota1 + nota2) / 2;
        soma_mediadA = soma_mediadA + mediaA;

        if(mediaA < 3 ){
            aluno_reprov = aluno_reprov + 1;
        } else if(mediaA >= 3 && mediaA < 7) {
            aluno_final = aluno_final + 1;
        } else {
            aluno_aprov = aluno_aprov + 1;
        }

        if(qntd_aluno == 1){
            maior_media = mediaA;
            menor_media = mediaA;
        } else if(mediaA > maior_media) {
            maior_media = mediaA;
        } else if(mediaA < menor_media){
            menor_media = mediaA;
        }


        int laco1 = Integer.parseInt(JOptionPane.showInputDialog( "Deseja Cadastrar outro Aluno ? (Sim = 1 e não = 2)"));
    }   while (qntd_aluno == 1);
    
        media_geralDisci = soma_mediadA / qntd_aluno;
        soma_mediaTur = soma_mediaTur + media_geralDisci;  

         
        System.out.println("###RESUMO DA DISCIPLINA###");
        System.out.println ("DISCIPLINA: " + nome_disci);
        System.out.println ("QUANTIDADE TOTAL DE ALUNOS: " + qntd_aluno);
        System.out.println("MEDIA GERAL DA DISCIPLINA: " + media_geralDisci);
        System.out.println ("MAIOR MÉDIA DA DISCIPLINA: " + maior_media);
        System.out.println ("MENOR MÉDIA DA DISCIPLINA: " + menor_media);
        System.out.println ("QUANTIDADE DE ALUNOS REPROVADOS: " + aluno_reprov);
        System.out.println ("QUANTIDADE DE ALUNOS NA FINAL: " + aluno_final);
        System.out.println("QUANTIDADE DE ALUNOS APROVADOS: " + aluno_aprov);

        int laco2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar mais uma Disciplina? (Sim = 1 e não = 2) "));
    }    while (qntd_disci == 1);

        media_geralTur = soma_mediaTur / qntd_disci;

       	System.out.println ("###RESUMO DA TURMA###");
       	System.out.println ("TURMA: " + nome_turma);
       	System.out.println ("QUANTIDADE DE DISCIPLINAS: " + qntd_disci);
       	System.out.println ("MÉDIA GERAL DA TURMA: " + media_geralTur);     

    }
}

