package fr.cocoraid.capitalismcraft.command;

import fr.cocoraid.capitalismcraft.CapitalismCraft;
import fr.cocoraid.capitalismcraft.command.commands.builder.BuilderCMD;
import fr.cocoraid.capitalismcraft.command.commands.skin.SkinCMD;
import fr.cocoraid.capitalismcraft.command.commands.skin.SkinOwnedCMD;

public class CommandManager {

    public CommandManager(CapitalismCraft instance) {

        instance.getCommand("skin").setExecutor(new SkinCMD(instance));
        instance.getCommand("skins").setExecutor(new SkinOwnedCMD());
        instance.getCommand("build").setExecutor(new BuilderCMD());
        instance.getCommand("emp").setExecutor(new BuilderCMD());
    }



}
