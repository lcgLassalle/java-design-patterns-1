package fr.diginamic.strategy;

import java.util.List;

public class InsertionTri implements Strategy{
    @Override
    public void trier(Integer[] tab) {
        for(int k=1; k<tab.length-1; k++)   {
            int temp = tab[k];
            int j= k-1;
            while(j>=0 && temp <= tab[j])   {
                tab[j+1] = tab[j];
                j = j-1;
            }
            tab[j+1] = temp;
        }
        List.of(tab).forEach(i -> System.out.print(i+" "));
    }
}
