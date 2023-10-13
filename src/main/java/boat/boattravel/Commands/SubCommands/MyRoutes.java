package boat.boattravel.Commands.SubCommands;

import boat.boattravel.Commands.SubCommand;
import org.bukkit.entity.Player;

public class MyRoutes extends SubCommand {
    @Override
    public String getName() {
        return "myroutes";
    }

    @Override
    public String getDescription() {
        return "Shows all of your routes with some extra details";
    }

    @Override
    public String getSyntax() {
        return "/boat myroutes";
    }

    @Override
    public void perform(Player player, String[] args) {

    }
}
