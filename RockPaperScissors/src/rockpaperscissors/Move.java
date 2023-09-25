package rockpaperscissors;

public class Move {
/*
            Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);
    */
    private String name = "";
    private Move strongAgainst;

    public Move(){
    }

    public String getName() {
        return this.name;
    }

    public Move getStrongAgainst() {
        return this.strongAgainst;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setStrongAgainst(Move strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public void makeMove(int i) {
        switch(i){
            case 1:
                ;
            case 2:;
            case 3:;
        }
    }
    
    public static int compareMoves(Move m1, Move m2) {
        // This method returns 0 if m1 wins, 1 if m2 wins, and 2 if neither wins
        if (m1.getStrongAgainst() == m2) {
            return 0;
        } else if (m2.getStrongAgainst() == m1) {
            return 1;
        } else {
            return 2;
        }
    }
}
