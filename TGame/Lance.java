package TGame;

/**
 * LANCE - The Casual Strategist
 * 
 * Backstory: Lance is a laid-back competitor who approaches battles with a relaxed demeanor.
 * His "Basically" skill simplifies complex situations into digestible tactics.
 * When he says "GG" (Good Game), it's either respect or a warning—sometimes both.
 * Lance visualizes victory before it happens, using his mental prowess to predict opponent moves.
 * His signature phrase "Di ba diay?" challenges opponents to think differently about the battle.
 */
public class Lance extends Characters {
    
    public Lance(){
        super("Lance", 100, 0);
    }

    public final String[] skillNames = {
        "Basically", 
        "GG", 
        "Di ba diay?", 
        "Visualize"
    };
    @Override
    public String[] getSkillNames() {
        return skillNames;
    }
    
    @Override
    public String getPunchline(int skillNum) {
        return switch (skillNum) {
            case 1 -> "Basically...";
            case 2 -> "GG!";
            case 3 -> "Di ba diay?";
            case 4 -> "Visualize!";
            default -> "Faltered!";
        };
    }
    
    @Override
    public void useSkill(int skillNum, Characters opponent) {
        // Use the base class skill system
        switch (skillNum) {
            case 1:
            case 2:
            case 3:
            case 4:
                // call parent method to handle random damage, shield, cooldown
                super.useSkill(skillNum, opponent);
                break;
            default:
                System.out.println(name + " faltered!");
        }
    }
}



