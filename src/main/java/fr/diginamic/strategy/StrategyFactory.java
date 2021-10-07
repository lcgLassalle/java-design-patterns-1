package fr.diginamic.strategy;

public class StrategyFactory {

    public static void getTri(Type type, Integer[] tab){
        switch (type){
            case bubble:{
                System.out.println("Avec le Bubble Sort:");
                new BubbleTri().trier(tab);
                break;
            }
            case insertion:{
                System.out.println("\nAvec l'insertion Sort:");
                new InsertionTri().trier(tab);
                break;
            }
            case selection:{
                System.out.println("\nAvec le selection Sort:");
                new SelectionTri().trier(tab);
            }
        }
    }
}
