public class Unit8_1b
{
  public int [] [] modifyRows (int [] [] array)
 { 
   for(int i = 0; i < array.length; i++){
     if(i % 2 == 1){
       for(int j = 0; j < array[i].length; j++){
          array[i][j] = array[i - 1][j];
       }
     }
    }
    return array;
      }
    }
 