package boat.boattravel.Commands.SubCommands;

import boat.boattravel.Commands.SubCommand;
import org.bukkit.entity.Player;

public class Routes extends SubCommand {
    @Override
    public String getName() {
        return "routes";
    }

    @Override
    public String getDescription() {
        return "Shows all the routes.";
    }

    @Override
    public String getSyntax() {
        return "/boat routes";
    }

    @Override
    public void perform(Player player, String[] args) {

    }
}
