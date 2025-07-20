import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultado = new ArrayList<>(); // Lista para armazenar todas as permutações
        backtrack(new ArrayList<>(), nums, resultado);     // Chama a função recursiva
        return resultado; // Retorna todas as permutações encontradas
    }

    // Função auxiliar para backtracking
    private void backtrack(List<Integer> caminho, int[] nums, List<List<Integer>> resultado) {
        // Se o caminho tiver o mesmo tamanho do vetor original, temos uma permutação completa
        if (caminho.size() == nums.length) {
            resultado.add(new ArrayList<>(caminho)); // Adiciona uma cópia do caminho ao resultado
            return; // Volta para explorar outras possibilidades
        }

        // Percorre todos os números disponíveis
        for (int i = 0; i < nums.length; i++) {
            // Se o número já está no caminho, pula para o próximo
            if (caminho.contains(nums[i])) continue;

            caminho.add(nums[i]); // Adiciona o número atual ao caminho
            backtrack(caminho, nums, resultado); // Chamada recursiva
            caminho.remove(caminho.size() - 1); // Remove o último número adicionado (backtrack)
        }
    }

    // Exemplo de uso
    public static void main(String[] args) {
        Solution p = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> resultado = p.permute(nums);

        System.out.println(resultado); // Exibe as permutações no console
    }
}