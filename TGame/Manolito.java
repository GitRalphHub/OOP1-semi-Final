package TGame;

/**
 * MANOLITO - The Timeless Legend
 * 
 * Backstory: Manolito is a warrior of history and principle, embodying centuries of Filipino heritage.
 * His legendary vow "I shall return!" echoes through time—a promise of unstoppable comeback.
 * He studies "Sucesos de las Islas Filipinas" (Events of the Philippine Islands) to draw power from history.
 * Manolito fights for sovereignty and independence, never allowing oppression in battle.
 * His classic style transcends trends; he is eternal, unchanging, and formidable.
 */
public class Manolito extends Characters {
    
    public Manolito(){
        super("Manolito", 100, 0);
    }

    public final String[] skillNames = {
        "I shall return!", 
        "Sucesos de las Islas Filipinas", 
        "Sovereignty", 
        "Classic"
    };
    @Override
    public String[] getSkillNames() {
        return skillNames;
    }
    
    @Override
    public String getPunchline(int skillNum) {
        return switch (skillNum) {
            case 1 -> "I shall return!";
            case 2 -> "Sucesos de las Islas Filipinas!";
            case 3 -> "Sovereignty!";
            case 4 -> "Classic!";
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