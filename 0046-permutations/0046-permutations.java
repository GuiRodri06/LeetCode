import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultado = new ArrayList<>(); 
        backtrack(new ArrayList<>(), nums, resultado);     
        return resultado;
    }

    private void backtrack(List<Integer> caminho, int[] nums, List<List<Integer>> resultado) {
        if (caminho.size() == nums.length) {
            resultado.add(new ArrayList<>(caminho)); 
            return; 
        }

        for (int i = 0; i < nums.length; i++) {
            if (caminho.contains(nums[i])) continue;
            caminho.add(nums[i]); 
            backtrack(caminho, nums, resultado); 
            caminho.remove(caminho.size() - 1); 
        }
    }

    public static void main(String[] args) {
        Solution p = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> resultado = p.permute(nums);
        System.out.println(resultado);
    }
}
