package TGame;

/**
 * KHAI - The Vigilant Mentor
 * 
 * Backstory: Khai is an attentive instructor who commands respect through presence and wisdom.
 * His "Listen" skill forces opponents to hear uncomfortable truths about their weaknesses.
 * He holds his Codechums accountable through rigorous questioning in battles.
 * Khai's "Quote of the Day" strikes like lightning—philosophical and devastating.
 * With his ultimate "EYES HERE!" he demands absolute focus, making escape impossible.
 */
public class Khai extends Characters {
    
    public Khai(){
        super("Khai", 100, 0);
    }

    public final String[] skillNames = {
        "Listen", 
        "Answer Your Codechum", 
        "Quote of The Day", 
        "EYES HERE!"
    };

    @Override
    public String[] getSkillNames() {
        return skillNames;
    }
    
    @Override
    public String getPunchline(int skillNum) {
        return switch (skillNum) {
            case 1 -> "Listen!";
            case 2 -> "Answer your Codechum!";
            case 3 -> "Quote of the day!";
            case 4 -> "EYES HERE!";
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
