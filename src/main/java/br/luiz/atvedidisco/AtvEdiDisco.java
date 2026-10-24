package br.luiz.atvedidisco;

public class AtvEdiDisco {

    public static void main(String[] args) {
        int[] instancias = {40, 41};

        for (int d : instancias) {
            System.out.println(" processamento para " + d + " discos...");
            
            long inicio = System.nanoTime();
            
            long movimentos = Disco.resolver(d, 'A', 'C', 'B');
            
            long fim = System.nanoTime();
            long duracaoMs = (fim - inicio) / 1_000_000;

            System.out.println("Discos: " + d + " | Movimentos: " + movimentos + " | Tempo: " + formatarTempo(duracaoMs));
        }
    }

    public static String formatarTempo(long millis) {
        long horas = millis / 3600000;
        long minutos = (millis % 3600000) / 60000;
        long segundos = (millis % 60000) / 1000;
        long milissegundos = millis % 1000;
        return String.format("%02d:%02d:%02d:%03d", horas, minutos, segundos, milissegundos);
    }
}
  
    

