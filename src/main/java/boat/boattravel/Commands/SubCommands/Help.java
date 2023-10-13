package boat.boattravel.Commands.SubCommands;

import boat.boattravel.Commands.SubCommand;
import org.bukkit.entity.Player;

public class Help extends SubCommand {
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "Shows all the commands for BoatTravel";
    }

    @Override
    public String getSyntax() {
        return "/boat help";
    }

    @Override
    public void perform(Player player, String[] args) {

    }
}
