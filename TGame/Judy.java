package TGame;

/**
 * JUDY - The Grammar Guardian
 * 
 * Backstory: Judy is a linguistic warrior who battles with words and logic.
 * Her expertise lies in the art of language—she questions everything with her famous phrases
 * "Is or Are?" and "p or q?" to confuse and outsmart her foes.
 * She represents "Diba Class?" as a reminder that even the most confident opponent can slip up.
 * Her ultimate move "Bohth" embraces paradox itself, overwhelming enemies with both options at once.
 */
public class Judy extends Characters {
    
    public Judy(){
        super("Judy", 100, 0);
    }

    public final String[] skillNames = {
        "Is or Are?", 
        "p or q?", 
        "Diba Class?", 
        "Bohth"
    };

    @Override
    public String[] getSkillNames() {
        return skillNames;
    }
    
    @Override
    public String getPunchline(int skillNum) {
        return switch (skillNum) {
            case 1 -> "Is or Are?";
            case 2 -> "P or Q?";
            case 3 -> "Diba class?";
            case 4 -> "Bohth!";
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
