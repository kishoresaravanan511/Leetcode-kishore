// Last updated: 8/11/2026, 2:19:52 PM
class Solution{
public boolean isAdditiveNumber(String num) { 
        for(int i = 1; i < num.length(); i++) { 
            for(int j = i+1; j < num.length(); j++) { 
                String first = num.substring(0, i);
                String second = num.substring(i, j);
                String rest = num.substring(j);
                if(valid(first, second, rest))  return true;                
            }
        }
        return false;
    }
    
    private boolean valid(String first, String second, String rest) {
        if((first.length() > 1 && first.charAt(0) == '0') 
           || (second.length() > 1 && second.charAt(0) == '0')) 
            return false;
        if(rest == null || rest.length() == 0) return true;
        String sum = addString(first, second);
        return rest.startsWith(sum) && valid(second, sum, rest.substring(sum.length()));
    }
    
    private String addString(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int remain = 0;
        for(int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int ia = a.length() - i - 1;
            int ib = b.length() - i - 1;
            int valA = (ia < 0) ? 0 : Character.getNumericValue(a.charAt(ia));
            int valB = (ib < 0) ? 0 : Character.getNumericValue(b.charAt(ib));
            int sum = valA + valB + remain;
            sb.append(sum % 10);
            remain = sum / 10;            
        }
        if(remain > 0) sb.append(remain);
        return sb.reverse().toString();
    }
}
	