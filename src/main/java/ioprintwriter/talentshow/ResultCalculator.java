package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//beolvasunk két fájlt, a versenyzők listáját, és a szavazatok listáját,
//majd kiírjuk egy új listába, hogy melyik versenyző hány szavazatot kapott


public class ResultCalculator {

    private List<Production> productions = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    public void readTalents(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                Production production = new Production(Long.parseLong(temp[0]), temp[1]);
                productions.add(production);
            }
        }

        catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }


    public void calculateVotes(Path file) {
        try(BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while( (line = br.readLine()) !=null) {
                int productionVote = Integer.parseInt(line); // számmá a versenyző azonosítószámát)
                addVote(productionVote);
            }

        }
        catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }

    private void addVote(int id) {
        boolean exist = false;
        for (Vote v : votes) {
            if (v.getId() == id) {
                v.incNum();
                exist = true;
            }
        }
        if (!exist) {
            votes.add(new Vote(id, 1));
        }
    }

    private Production findWinner() {
        int max = votes.get(0).getVoteNumber();
        long maxId = votes.get(0).getId();
        for (Vote v : votes) {
            if (v.getVoteNumber() > max) {
                max = v.getVoteNumber();
                maxId = v.getId();
            }
        }
        for (Production p : productions) {
            if (maxId == p.getId()) {
                return p;
            }
        }
        return null;
    }

    private Production findProductionById(long id) {
        for (Production p : productions) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }



    public void writeResultToFile(Path file) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for (Vote v : votes) {
                Production p = findProductionById(v.getId());
                pw.print(v.getId() + " ");
                pw.print(p.getName() + " ");
                pw.print(v.getVoteNumber());
                pw.println();
            }
            pw.print("Winner: " + findWinner().getName());
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }
    }





    public List<Production> getProductions() {
        return productions;
    }

    public List<Vote> getVotes() {
        return votes;
    }
}
