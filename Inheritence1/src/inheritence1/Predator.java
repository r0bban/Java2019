package inheritence1;

public interface Predator {

    //Alla fält i interface är "Pubilc static final", men du ska inte skriva ut det. Det sker automatiskt.
    int DANGERBASE = 67;
    
    //Alla metoder i interface är "Pubilc" (men behöver och ska inte skirvas ut), men du ska inte skriva ut det om du overridar i class som implementerat interfacet. 
    void calaculateDangerLevel();
    
    //default-metod i inteface är inte tvingande att implementera. Kom till för att kunna utöka interface efterhand utan att tvinga existerande klasser som implementerat interfacet att implementera den nya metodern.
    default void printInfo(){
        System.out.println("Predator is pretty dangerous aniamal.");
    }

    // Static metoder är tvingande via intefrace och kan inte overridas. Bra lösning eftersom det inte gick i abstracta metoder.
    static void dance(){
        System.out.println("A predator doesnt dance");
    }

}
