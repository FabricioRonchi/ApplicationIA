package ia;

import java.io.IOException;

public class IA {

      public static void main(String[] args) throws IOException {
         Imagem obj = new Imagem();
                
        byte[][] pixels;        
        String[] alunos = { 
            "alan", "alessandro", "antonio", "carla", "cristiano", "emiliano", "fabios", "fabiolenzi", "fabricio", 
            "gabriel", "joao", "lucas", "martin", "maycon", "rubens"
        };
        String[] imagens = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] tipo = { "1", "2"};
        
        obj.criarCabecalho((alunos.length * 20) * 2, "400", "5");
        
        for (String aluno : alunos) {
            for (String imagen : imagens) {
                for (String tipo1 : tipo) {                         
                    pixels = obj.converter(aluno, imagen, tipo1);        
                    obj.imprimir(pixels, aluno, imagen, tipo1);
                } 
            }
        }
        
        
    } 
    
}
