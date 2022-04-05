package composite;

public class Main {
    public static void main(String[] args) {
        VoluntarAIESEC president = new VoluntarAIESEC("Dumitru Boesteanu", "Presindet of AIESEC");

        VoluntarAIESEC vicepresidentMKT = new VoluntarAIESEC("Argentina Botezatu", "Vice president Marketing");

        VoluntarAIESEC vicepresinentFLA = new VoluntarAIESEC("Elvira Boenciuc", "Vice president Finance");

        VoluntarAIESEC newBies = new VoluntarAIESEC("Pavalache Andrian", "MKT");
        VoluntarAIESEC newBies1 = new VoluntarAIESEC("Jucu Ecaterina", "MKT");
        VoluntarAIESEC newBies2 = new VoluntarAIESEC("Iurescu Valentin", "FLA");

        president.add(vicepresidentMKT);
        president.add(vicepresinentFLA);

        vicepresidentMKT.add(newBies);
        vicepresidentMKT.add(newBies1);

        vicepresinentFLA.add(newBies2);

        System.out.println(president);

        for (VoluntarAIESEC headVoluntar : president.getMembers()) {
            System.out.println(headVoluntar);

            for (VoluntarAIESEC voluntar : headVoluntar.getMembers()) {
                System.out.println(voluntar);

            }
        }

    }
}
