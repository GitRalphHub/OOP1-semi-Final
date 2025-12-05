package TGame;

/**
 * SARRAH - The Passionate Motivator
 * 
 * Backstory: Sarrah is a fiery educator who believes excellence comes from heart and dedication.
 * Her "Kamo ha!!" rallies her own spirit while intimidating foes with raw enthusiasm.
 * She demands perfection in her department—her battle mantra "dapat perfect mo sa depa!"
 * represents the standard she holds both herself and her opponents to.
 * Sarrah knows that schools alone won't guarantee success; true victory requires relentless effort.
 */
public class Sarrah extends Characters {
    
    public Sarrah(){
        super("Sarrah", 100, 0);
    }

    public final String[] skillNames = {
        "Kamo ha!!", 
        "dapat perfect mo sa depa!", 
        "Dili mo kapasar basta moeskwela lang", 
        "okay"
    };


    @Override
    public String[] getSkillNames() {
        return skillNames;
    }
    
    @Override
    public String getPunchline(int skillNum) {
        return switch (skillNum) {
            case 1 -> "Kamo ha!!";
            case 2 -> "Dapat perfect mo sa depa!";
            case 3 -> "Dili mo kapasar basta moeskwela lang!";
            case 4 -> "Okay!";
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
