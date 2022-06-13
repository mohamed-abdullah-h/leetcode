class Solution {
    public int[] plusOne(int[] digits) {
      int l = digits.length - 1;
        boolean allIsNine = true;
        if (digits[l] !=9){
            digits[l] = digits[l]+1;
            return digits;
        }
        else {
            
            for (int i = 0; i <=l ; i++ ){
               if (digits[i] != 9){
                   allIsNine = false;
               }
            }
            if (allIsNine){
                int[] arr = new int[l+2];
                arr[0] = 1;
                for (int i = 1;i < arr.length; i++){
                    arr[i] = 0;
                }
                return arr;
            }
            else {
                int i = l;
                for (; i >=0; i--){
                    if (digits[i] != 9){
                        digits[i] = digits[i] + 1;
                        break;
                    }
                }
                for (int x = l; x > i ;x--){
                    digits[x] = 0;
                }
                return digits;
            }
            }
        }
    }
