import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FibLoopWithArr
{


    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.print(arrayfib(n));


    }

    private static int arrayfib(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,0);
        list.add(1,1);
        for (int i = 2; i <=n+1;i++){
            list.add(i,(list.get(i-1))+(list.get(i-2)));



        }

        return list.get(n);

    }





}
