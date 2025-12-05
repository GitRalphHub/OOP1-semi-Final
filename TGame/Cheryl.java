package TGame;

/**
 * CHERYL - The Meticulous Scholar
 * 
 * Backstory: Cheryl is a diligent student who believes that perfection lies in preparation.
 * Armed with her trusty sheets of paper, she meticulously documents every move and strategy.
 * Her competitive spirit drives her to expose her opponents' weaknesses through careful analysis.
 * When she opens her lair, she unleashes all her accumulated knowledge and tactical brilliance.
 * Her catch phrase "Basin dili ni para imo" reflects her determination—this victory is not for everyone!
 */
public class Cheryl extends Characters {
    
    public Cheryl(){
        super("Cheryl", 100, 0);
    }

    public final String[] skillNames = {
        "Get one Whole sheet of paper", 
        "Open your lair", 
        "printf kuyawan", 
        "Basin dili ni para imo"
    };

    @Override
    public String[] getSkillNames() {
        return skillNames;
    }
    
    @Override
    public String getPunchline(int skillNum) {
        return switch (skillNum) {
            case 1 -> "Get one whole sheet of paper!";
            case 2 -> "Open your lair, I'm coming in!";
            case 3 -> "Printf kuyawan!";
            case 4 -> "Basin dili ni para imo!";
            default -> "Faltered!";
        };
    }
    
    @Override
    public void useSkill(int skillNum, Characters opponent) {
        // Use the base class skill system
        switch (skillNum) {
            case 1, 2, 3, 4 -> // call parent method to handle random damage, shield, cooldown
                super.useSkill(skillNum, opponent);
            default -> System.out.println(name + " faltered!");
        }
    }
}
