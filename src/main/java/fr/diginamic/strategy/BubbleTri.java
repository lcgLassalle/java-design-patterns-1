package fr.diginamic.strategy;

import java.util.List;

public class BubbleTri implements Strategy{

    @Override
    public void trier(Integer[] tab) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        List.of(tab).forEach(i -> System.out.print(i+" "));
    }
}
