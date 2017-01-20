
public class InvertArr {
    public static void main(int[] data)  {
            for (int k = 0; k < data.length /2 ; k++)
            {
                int tmp = data[k]; // tmp = data[0]=  1
                data[k] = data[data.length - k -1]; // data[0] = data[10 - 0 - 1] = data[9] = 0
                data[data.length-1-k] = tmp; //data[9] = 1;
            }


        }
    }

// data = {1,2,3,4,5,6,7,8,9,0}



