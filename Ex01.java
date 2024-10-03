package Atividade;
import java.util.*;

public class Ex01 {

    public static void main(String[] args) {

        List<Integer> cem = new ArrayList<Integer>(200);
        ArrayList<Integer> cemMil = new ArrayList<Integer>(100000);
        ArrayList<Integer> umMilhao = new ArrayList<Integer>(1000000);

        Random random = new Random();

        long time, time1;
        time = System.currentTimeMillis();
        int maiorValorCem = 0;
        int maiorValorCemMil = 0;
        int maiorValorUmMilao = 0;

        for(int i = 0; i <= 100 ; i++){
            int num = random.nextInt();
            cem.add(num);
            if( i > 0 && cem.get(i) >= cem.get(i-1))
            {
                maiorValorCem = cem.get(i-1);
                continue;
            }
            if(i == 100 -1){
                System.out.println(maiorValorCem);
                time1 = System.currentTimeMillis();
                System.out.println(time1- time);
            }
        }

        for(int i = 0; i <= 100000 ; i++){
            int num = random.nextInt();
            cemMil.add(num);
            int num2 = random.nextInt();
            cemMil.add(num2);
            if( i > 0 && (cemMil.get(i) >= cemMil.get(i-1)))
            {
                maiorValorCemMil = cemMil.get(i);
                continue;
            }
            if(i == 100000 - 1){
                System.out.println(maiorValorCemMil);
                time1 = System.currentTimeMillis();
                System.out.println(time1- time);
            }
        }

        for(int i = 0; i <= 1000000 ; i++){
            int num = random.nextInt();
            umMilhao.add(num);
            int num2 = random.nextInt();
            umMilhao.add(num2);
            if( i > 0 && (umMilhao.get(i) >= umMilhao.get(i-1)))
            {
                maiorValorUmMilao = umMilhao.get(i);
                continue;
            }
            if(i == 1000000 - 1){
                System.out.println(maiorValorUmMilao);
                time1 = System.currentTimeMillis();
                System.out.println(time1- time);
            }
        }

    }
}
